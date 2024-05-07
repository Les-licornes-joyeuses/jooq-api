/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgEventTrigger;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgEventTriggerRecord extends UpdatableRecordImpl<PgEventTriggerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtname</code>.
     */
    public void setEvtname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtname</code>.
     */
    public String getEvtname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtevent</code>.
     */
    public void setEvtevent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtevent</code>.
     */
    public String getEvtevent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtowner</code>.
     */
    public void setEvtowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtowner</code>.
     */
    public Long getEvtowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtfoid</code>.
     */
    public void setEvtfoid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtfoid</code>.
     */
    public Long getEvtfoid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evtenabled</code>.
     */
    public void setEvtenabled(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evtenabled</code>.
     */
    public String getEvtenabled() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_event_trigger.evttags</code>.
     */
    public void setEvttags(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_event_trigger.evttags</code>.
     */
    public String[] getEvttags() {
        return (String[]) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgEventTriggerRecord
     */
    public PgEventTriggerRecord() {
        super(PgEventTrigger.PG_EVENT_TRIGGER);
    }

    /**
     * Create a detached, initialised PgEventTriggerRecord
     */
    public PgEventTriggerRecord(Long oid, String evtname, String evtevent, Long evtowner, Long evtfoid, String evtenabled, String[] evttags) {
        super(PgEventTrigger.PG_EVENT_TRIGGER);

        setOid(oid);
        setEvtname(evtname);
        setEvtevent(evtevent);
        setEvtowner(evtowner);
        setEvtfoid(evtfoid);
        setEvtenabled(evtenabled);
        setEvttags(evttags);
    }
}
