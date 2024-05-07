/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgGetPublicationTablesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetPublicationTables extends TableImpl<PgGetPublicationTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_publication_tables</code>
     */
    public static final PgGetPublicationTables PG_GET_PUBLICATION_TABLES = new PgGetPublicationTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetPublicationTablesRecord> getRecordType() {
        return PgGetPublicationTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.pubid</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Long> PUBID = createField(DSL.name("pubid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    public final TableField<PgGetPublicationTablesRecord, Object[]> ATTRS = createField(DSL.name("attrs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgGetPublicationTablesRecord, Object> QUAL = createField(DSL.name("qual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB.getArrayDataType())
        });
    }

    private PgGetPublicationTables(Name alias, Table<PgGetPublicationTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables(String alias) {
        this(DSL.name(alias), PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables(Name alias) {
        this(alias, PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_get_publication_tables</code> table
     * reference
     */
    public PgGetPublicationTables() {
        this(DSL.name("pg_get_publication_tables"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetPublicationTables as(String alias) {
        return new PgGetPublicationTables(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetPublicationTables as(Name alias) {
        return new PgGetPublicationTables(alias, this, parameters);
    }

    @Override
    public PgGetPublicationTables as(Table<?> alias) {
        return new PgGetPublicationTables(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetPublicationTables rename(String name) {
        return new PgGetPublicationTables(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetPublicationTables rename(Name name) {
        return new PgGetPublicationTables(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetPublicationTables rename(Table<?> name) {
        return new PgGetPublicationTables(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(
          String[] pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            DSL.val(pubname, SQLDataType.CLOB.getArrayDataType())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgGetPublicationTables call(
          Field<String[]> pubname
    ) {
        PgGetPublicationTables result = new PgGetPublicationTables(DSL.name("pg_get_publication_tables"), null, new Field[] {
            pubname
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
