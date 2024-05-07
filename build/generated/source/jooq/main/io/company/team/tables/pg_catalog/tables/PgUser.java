/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgUserRecord;

import java.time.OffsetDateTime;

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
public class PgUser extends TableImpl<PgUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_user</code>
     */
    public static final PgUser PG_USER = new PgUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgUserRecord> getRecordType() {
        return PgUserRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_user.usename</code>.
     */
    public final TableField<PgUserRecord, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usesysid</code>.
     */
    public final TableField<PgUserRecord, Long> USESYSID = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public final TableField<PgUserRecord, Boolean> USECREATEDB = createField(DSL.name("usecreatedb"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usesuper</code>.
     */
    public final TableField<PgUserRecord, Boolean> USESUPER = createField(DSL.name("usesuper"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.userepl</code>.
     */
    public final TableField<PgUserRecord, Boolean> USEREPL = createField(DSL.name("userepl"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public final TableField<PgUserRecord, Boolean> USEBYPASSRLS = createField(DSL.name("usebypassrls"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_user.passwd</code>.
     */
    public final TableField<PgUserRecord, String> PASSWD = createField(DSL.name("passwd"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_user.valuntil</code>.
     */
    public final TableField<PgUserRecord, OffsetDateTime> VALUNTIL = createField(DSL.name("valuntil"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_user.useconfig</code>.
     */
    public final TableField<PgUserRecord, String[]> USECONFIG = createField(DSL.name("useconfig"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgUser(Name alias, Table<PgUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUser(Name alias, Table<PgUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_user" as  SELECT usename,
         usesysid,
         usecreatedb,
         usesuper,
         userepl,
         usebypassrls,
         '********'::text AS passwd,
         valuntil,
         useconfig
        FROM pg_shadow;
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser(String alias) {
        this(DSL.name(alias), PG_USER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser(Name alias) {
        this(alias, PG_USER);
    }

    /**
     * Create a <code>pg_catalog.pg_user</code> table reference
     */
    public PgUser() {
        this(DSL.name("pg_user"), null);
    }

    public <O extends Record> PgUser(Table<O> child, ForeignKey<O, PgUserRecord> key) {
        super(child, key, PG_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgUser as(String alias) {
        return new PgUser(DSL.name(alias), this);
    }

    @Override
    public PgUser as(Name alias) {
        return new PgUser(alias, this);
    }

    @Override
    public PgUser as(Table<?> alias) {
        return new PgUser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUser rename(String name) {
        return new PgUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUser rename(Name name) {
        return new PgUser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgUser rename(Table<?> name) {
        return new PgUser(name.getQualifiedName(), null);
    }
}
