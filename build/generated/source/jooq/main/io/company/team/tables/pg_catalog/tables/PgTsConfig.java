/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.Keys;
import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgTsConfigRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PgTsConfig extends TableImpl<PgTsConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_config</code>
     */
    public static final PgTsConfig PG_TS_CONFIG = new PgTsConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsConfigRecord> getRecordType() {
        return PgTsConfigRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_config.oid</code>.
     */
    public final TableField<PgTsConfigRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    public final TableField<PgTsConfigRecord, String> CFGNAME = createField(DSL.name("cfgname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    public final TableField<PgTsConfigRecord, Long> CFGNAMESPACE = createField(DSL.name("cfgnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    public final TableField<PgTsConfigRecord, Long> CFGOWNER = createField(DSL.name("cfgowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    public final TableField<PgTsConfigRecord, Long> CFGPARSER = createField(DSL.name("cfgparser"), SQLDataType.BIGINT.nullable(false), this, "");

    private PgTsConfig(Name alias, Table<PgTsConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsConfig(Name alias, Table<PgTsConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config</code> table reference
     */
    public PgTsConfig(String alias) {
        this(DSL.name(alias), PG_TS_CONFIG);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config</code> table reference
     */
    public PgTsConfig(Name alias) {
        this(alias, PG_TS_CONFIG);
    }

    /**
     * Create a <code>pg_catalog.pg_ts_config</code> table reference
     */
    public PgTsConfig() {
        this(DSL.name("pg_ts_config"), null);
    }

    public <O extends Record> PgTsConfig(Table<O> child, ForeignKey<O, PgTsConfigRecord> key) {
        super(child, key, PG_TS_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgTsConfigRecord> getPrimaryKey() {
        return Keys.PG_TS_CONFIG_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgTsConfigRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_TS_CONFIG_CFGNAME_INDEX);
    }

    @Override
    public PgTsConfig as(String alias) {
        return new PgTsConfig(DSL.name(alias), this);
    }

    @Override
    public PgTsConfig as(Name alias) {
        return new PgTsConfig(alias, this);
    }

    @Override
    public PgTsConfig as(Table<?> alias) {
        return new PgTsConfig(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfig rename(String name) {
        return new PgTsConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfig rename(Name name) {
        return new PgTsConfig(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfig rename(Table<?> name) {
        return new PgTsConfig(name.getQualifiedName(), null);
    }
}
