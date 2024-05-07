/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.Indexes;
import io.company.team.tables.pg_catalog.Keys;
import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgConstraintRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgConstraint extends TableImpl<PgConstraintRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_constraint</code>
     */
    public static final PgConstraint PG_CONSTRAINT = new PgConstraint();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgConstraintRecord> getRecordType() {
        return PgConstraintRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_constraint.oid</code>.
     */
    public final TableField<PgConstraintRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conname</code>.
     */
    public final TableField<PgConstraintRecord, String> CONNAME = createField(DSL.name("conname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.connamespace</code>.
     */
    public final TableField<PgConstraintRecord, Long> CONNAMESPACE = createField(DSL.name("connamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.contype</code>.
     */
    public final TableField<PgConstraintRecord, String> CONTYPE = createField(DSL.name("contype"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.condeferrable</code>.
     */
    public final TableField<PgConstraintRecord, Boolean> CONDEFERRABLE = createField(DSL.name("condeferrable"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.condeferred</code>.
     */
    public final TableField<PgConstraintRecord, Boolean> CONDEFERRED = createField(DSL.name("condeferred"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.convalidated</code>.
     */
    public final TableField<PgConstraintRecord, Boolean> CONVALIDATED = createField(DSL.name("convalidated"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conrelid</code>.
     */
    public final TableField<PgConstraintRecord, Long> CONRELID = createField(DSL.name("conrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.contypid</code>.
     */
    public final TableField<PgConstraintRecord, Long> CONTYPID = createField(DSL.name("contypid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conindid</code>.
     */
    public final TableField<PgConstraintRecord, Long> CONINDID = createField(DSL.name("conindid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conparentid</code>.
     */
    public final TableField<PgConstraintRecord, Long> CONPARENTID = createField(DSL.name("conparentid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.confrelid</code>.
     */
    public final TableField<PgConstraintRecord, Long> CONFRELID = createField(DSL.name("confrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.confupdtype</code>.
     */
    public final TableField<PgConstraintRecord, String> CONFUPDTYPE = createField(DSL.name("confupdtype"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.confdeltype</code>.
     */
    public final TableField<PgConstraintRecord, String> CONFDELTYPE = createField(DSL.name("confdeltype"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.confmatchtype</code>.
     */
    public final TableField<PgConstraintRecord, String> CONFMATCHTYPE = createField(DSL.name("confmatchtype"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conislocal</code>.
     */
    public final TableField<PgConstraintRecord, Boolean> CONISLOCAL = createField(DSL.name("conislocal"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.coninhcount</code>.
     */
    public final TableField<PgConstraintRecord, Short> CONINHCOUNT = createField(DSL.name("coninhcount"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.connoinherit</code>.
     */
    public final TableField<PgConstraintRecord, Boolean> CONNOINHERIT = createField(DSL.name("connoinherit"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conkey</code>.
     */
    public final TableField<PgConstraintRecord, Short[]> CONKEY = createField(DSL.name("conkey"), SQLDataType.SMALLINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.confkey</code>.
     */
    public final TableField<PgConstraintRecord, Short[]> CONFKEY = createField(DSL.name("confkey"), SQLDataType.SMALLINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conpfeqop</code>.
     */
    public final TableField<PgConstraintRecord, Long[]> CONPFEQOP = createField(DSL.name("conpfeqop"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conppeqop</code>.
     */
    public final TableField<PgConstraintRecord, Long[]> CONPPEQOP = createField(DSL.name("conppeqop"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conffeqop</code>.
     */
    public final TableField<PgConstraintRecord, Long[]> CONFFEQOP = createField(DSL.name("conffeqop"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.confdelsetcols</code>.
     */
    public final TableField<PgConstraintRecord, Short[]> CONFDELSETCOLS = createField(DSL.name("confdelsetcols"), SQLDataType.SMALLINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_constraint.conexclop</code>.
     */
    public final TableField<PgConstraintRecord, Long[]> CONEXCLOP = createField(DSL.name("conexclop"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgConstraintRecord, Object> CONBIN = createField(DSL.name("conbin"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgConstraint(Name alias, Table<PgConstraintRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgConstraint(Name alias, Table<PgConstraintRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_constraint</code> table reference
     */
    public PgConstraint(String alias) {
        this(DSL.name(alias), PG_CONSTRAINT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_constraint</code> table reference
     */
    public PgConstraint(Name alias) {
        this(alias, PG_CONSTRAINT);
    }

    /**
     * Create a <code>pg_catalog.pg_constraint</code> table reference
     */
    public PgConstraint() {
        this(DSL.name("pg_constraint"), null);
    }

    public <O extends Record> PgConstraint(Table<O> child, ForeignKey<O, PgConstraintRecord> key) {
        super(child, key, PG_CONSTRAINT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_CONSTRAINT_CONNAME_NSP_INDEX, Indexes.PG_CONSTRAINT_CONPARENTID_INDEX, Indexes.PG_CONSTRAINT_CONTYPID_INDEX);
    }

    @Override
    public UniqueKey<PgConstraintRecord> getPrimaryKey() {
        return Keys.PG_CONSTRAINT_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgConstraintRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_CONSTRAINT_CONRELID_CONTYPID_CONNAME_INDEX);
    }

    @Override
    public PgConstraint as(String alias) {
        return new PgConstraint(DSL.name(alias), this);
    }

    @Override
    public PgConstraint as(Name alias) {
        return new PgConstraint(alias, this);
    }

    @Override
    public PgConstraint as(Table<?> alias) {
        return new PgConstraint(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgConstraint rename(String name) {
        return new PgConstraint(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgConstraint rename(Name name) {
        return new PgConstraint(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgConstraint rename(Table<?> name) {
        return new PgConstraint(name.getQualifiedName(), null);
    }
}
