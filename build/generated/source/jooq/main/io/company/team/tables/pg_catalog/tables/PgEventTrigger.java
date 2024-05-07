/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.Keys;
import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgEventTriggerRecord;

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
public class PgEventTrigger extends TableImpl<PgEventTriggerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_event_trigger</code>
     */
    public static final PgEventTrigger PG_EVENT_TRIGGER = new PgEventTrigger();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgEventTriggerRecord> getRecordType() {
        return PgEventTriggerRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_event_trigger.oid</code>.
     */
    public final TableField<PgEventTriggerRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger.evtname</code>.
     */
    public final TableField<PgEventTriggerRecord, String> EVTNAME = createField(DSL.name("evtname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger.evtevent</code>.
     */
    public final TableField<PgEventTriggerRecord, String> EVTEVENT = createField(DSL.name("evtevent"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger.evtowner</code>.
     */
    public final TableField<PgEventTriggerRecord, Long> EVTOWNER = createField(DSL.name("evtowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger.evtfoid</code>.
     */
    public final TableField<PgEventTriggerRecord, Long> EVTFOID = createField(DSL.name("evtfoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger.evtenabled</code>.
     */
    public final TableField<PgEventTriggerRecord, String> EVTENABLED = createField(DSL.name("evtenabled"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger.evttags</code>.
     */
    public final TableField<PgEventTriggerRecord, String[]> EVTTAGS = createField(DSL.name("evttags"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgEventTrigger(Name alias, Table<PgEventTriggerRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgEventTrigger(Name alias, Table<PgEventTriggerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger</code> table
     * reference
     */
    public PgEventTrigger(String alias) {
        this(DSL.name(alias), PG_EVENT_TRIGGER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger</code> table
     * reference
     */
    public PgEventTrigger(Name alias) {
        this(alias, PG_EVENT_TRIGGER);
    }

    /**
     * Create a <code>pg_catalog.pg_event_trigger</code> table reference
     */
    public PgEventTrigger() {
        this(DSL.name("pg_event_trigger"), null);
    }

    public <O extends Record> PgEventTrigger(Table<O> child, ForeignKey<O, PgEventTriggerRecord> key) {
        super(child, key, PG_EVENT_TRIGGER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgEventTriggerRecord> getPrimaryKey() {
        return Keys.PG_EVENT_TRIGGER_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgEventTriggerRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_EVENT_TRIGGER_EVTNAME_INDEX);
    }

    @Override
    public PgEventTrigger as(String alias) {
        return new PgEventTrigger(DSL.name(alias), this);
    }

    @Override
    public PgEventTrigger as(Name alias) {
        return new PgEventTrigger(alias, this);
    }

    @Override
    public PgEventTrigger as(Table<?> alias) {
        return new PgEventTrigger(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTrigger rename(String name) {
        return new PgEventTrigger(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTrigger rename(Name name) {
        return new PgEventTrigger(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTrigger rename(Table<?> name) {
        return new PgEventTrigger(name.getQualifiedName(), null);
    }
}
