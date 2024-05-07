/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgPartitionAncestorsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPartitionAncestors extends TableImpl<PgPartitionAncestorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_partition_ancestors</code>
     */
    public static final PgPartitionAncestors PG_PARTITION_ANCESTORS = new PgPartitionAncestors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPartitionAncestorsRecord> getRecordType() {
        return PgPartitionAncestorsRecord.class;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgPartitionAncestorsRecord, Object> RELID = createField(DSL.name("relid"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), this, "");

    private PgPartitionAncestors(Name alias, Table<PgPartitionAncestorsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
        });
    }

    private PgPartitionAncestors(Name alias, Table<PgPartitionAncestorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_partition_ancestors</code> table
     * reference
     */
    public PgPartitionAncestors(String alias) {
        this(DSL.name(alias), PG_PARTITION_ANCESTORS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_partition_ancestors</code> table
     * reference
     */
    public PgPartitionAncestors(Name alias) {
        this(alias, PG_PARTITION_ANCESTORS);
    }

    /**
     * Create a <code>pg_catalog.pg_partition_ancestors</code> table reference
     */
    public PgPartitionAncestors() {
        this(DSL.name("pg_partition_ancestors"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPartitionAncestors as(String alias) {
        return new PgPartitionAncestors(DSL.name(alias), this, parameters);
    }

    @Override
    public PgPartitionAncestors as(Name alias) {
        return new PgPartitionAncestors(alias, this, parameters);
    }

    @Override
    public PgPartitionAncestors as(Table<?> alias) {
        return new PgPartitionAncestors(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPartitionAncestors rename(String name) {
        return new PgPartitionAncestors(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPartitionAncestors rename(Name name) {
        return new PgPartitionAncestors(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPartitionAncestors rename(Table<?> name) {
        return new PgPartitionAncestors(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgPartitionAncestors call(
          Object partitionid
    ) {
        PgPartitionAncestors result = new PgPartitionAncestors(DSL.name("pg_partition_ancestors"), null, new Field[] {
            DSL.val(partitionid, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""))
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgPartitionAncestors call(
          Field<Object> partitionid
    ) {
        PgPartitionAncestors result = new PgPartitionAncestors(DSL.name("pg_partition_ancestors"), null, new Field[] {
            partitionid
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
