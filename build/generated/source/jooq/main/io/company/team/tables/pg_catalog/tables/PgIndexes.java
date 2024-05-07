/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgIndexesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class PgIndexes extends TableImpl<PgIndexesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_indexes</code>
     */
    public static final PgIndexes PG_INDEXES = new PgIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgIndexesRecord> getRecordType() {
        return PgIndexesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_indexes.schemaname</code>.
     */
    public final TableField<PgIndexesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_indexes.tablename</code>.
     */
    public final TableField<PgIndexesRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_indexes.indexname</code>.
     */
    public final TableField<PgIndexesRecord, String> INDEXNAME = createField(DSL.name("indexname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_indexes.tablespace</code>.
     */
    public final TableField<PgIndexesRecord, String> TABLESPACE = createField(DSL.name("tablespace"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_indexes.indexdef</code>.
     */
    public final TableField<PgIndexesRecord, String> INDEXDEF = createField(DSL.name("indexdef"), SQLDataType.CLOB, this, "");

    private PgIndexes(Name alias, Table<PgIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgIndexes(Name alias, Table<PgIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_indexes" as  SELECT n.nspname AS schemaname,
          c.relname AS tablename,
          i.relname AS indexname,
          t.spcname AS tablespace,
          pg_get_indexdef(i.oid) AS indexdef
         FROM ((((pg_index x
           JOIN pg_class c ON ((c.oid = x.indrelid)))
           JOIN pg_class i ON ((i.oid = x.indexrelid)))
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
           LEFT JOIN pg_tablespace t ON ((t.oid = i.reltablespace)))
        WHERE ((c.relkind = ANY (ARRAY['r'::"char", 'm'::"char", 'p'::"char"])) AND (i.relkind = ANY (ARRAY['i'::"char", 'I'::"char"])));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_indexes</code> table reference
     */
    public PgIndexes(String alias) {
        this(DSL.name(alias), PG_INDEXES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_indexes</code> table reference
     */
    public PgIndexes(Name alias) {
        this(alias, PG_INDEXES);
    }

    /**
     * Create a <code>pg_catalog.pg_indexes</code> table reference
     */
    public PgIndexes() {
        this(DSL.name("pg_indexes"), null);
    }

    public <O extends Record> PgIndexes(Table<O> child, ForeignKey<O, PgIndexesRecord> key) {
        super(child, key, PG_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgIndexes as(String alias) {
        return new PgIndexes(DSL.name(alias), this);
    }

    @Override
    public PgIndexes as(Name alias) {
        return new PgIndexes(alias, this);
    }

    @Override
    public PgIndexes as(Table<?> alias) {
        return new PgIndexes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndexes rename(String name) {
        return new PgIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndexes rename(Name name) {
        return new PgIndexes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndexes rename(Table<?> name) {
        return new PgIndexes(name.getQualifiedName(), null);
    }
}
