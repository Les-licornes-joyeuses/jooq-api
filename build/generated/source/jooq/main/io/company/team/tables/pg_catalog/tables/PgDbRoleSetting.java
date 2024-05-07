/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.Keys;
import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgDbRoleSettingRecord;

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
public class PgDbRoleSetting extends TableImpl<PgDbRoleSettingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_db_role_setting</code>
     */
    public static final PgDbRoleSetting PG_DB_ROLE_SETTING = new PgDbRoleSetting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgDbRoleSettingRecord> getRecordType() {
        return PgDbRoleSettingRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_db_role_setting.setdatabase</code>.
     */
    public final TableField<PgDbRoleSettingRecord, Long> SETDATABASE = createField(DSL.name("setdatabase"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_db_role_setting.setrole</code>.
     */
    public final TableField<PgDbRoleSettingRecord, Long> SETROLE = createField(DSL.name("setrole"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_db_role_setting.setconfig</code>.
     */
    public final TableField<PgDbRoleSettingRecord, String[]> SETCONFIG = createField(DSL.name("setconfig"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgDbRoleSetting(Name alias, Table<PgDbRoleSettingRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgDbRoleSetting(Name alias, Table<PgDbRoleSettingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_db_role_setting</code> table
     * reference
     */
    public PgDbRoleSetting(String alias) {
        this(DSL.name(alias), PG_DB_ROLE_SETTING);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_db_role_setting</code> table
     * reference
     */
    public PgDbRoleSetting(Name alias) {
        this(alias, PG_DB_ROLE_SETTING);
    }

    /**
     * Create a <code>pg_catalog.pg_db_role_setting</code> table reference
     */
    public PgDbRoleSetting() {
        this(DSL.name("pg_db_role_setting"), null);
    }

    public <O extends Record> PgDbRoleSetting(Table<O> child, ForeignKey<O, PgDbRoleSettingRecord> key) {
        super(child, key, PG_DB_ROLE_SETTING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgDbRoleSettingRecord> getPrimaryKey() {
        return Keys.PG_DB_ROLE_SETTING_DATABASEID_ROL_INDEX;
    }

    @Override
    public PgDbRoleSetting as(String alias) {
        return new PgDbRoleSetting(DSL.name(alias), this);
    }

    @Override
    public PgDbRoleSetting as(Name alias) {
        return new PgDbRoleSetting(alias, this);
    }

    @Override
    public PgDbRoleSetting as(Table<?> alias) {
        return new PgDbRoleSetting(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDbRoleSetting rename(String name) {
        return new PgDbRoleSetting(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDbRoleSetting rename(Name name) {
        return new PgDbRoleSetting(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgDbRoleSetting rename(Table<?> name) {
        return new PgDbRoleSetting(name.getQualifiedName(), null);
    }
}
