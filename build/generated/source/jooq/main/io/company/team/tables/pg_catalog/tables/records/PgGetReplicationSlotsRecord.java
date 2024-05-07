/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgGetReplicationSlots;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetReplicationSlotsRecord extends TableRecordImpl<PgGetReplicationSlotsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    public void setSlotName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    public String getSlotName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    public void setPlugin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    public String getPlugin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    public void setSlotType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    public String getSlotType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    public void setDatoid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    public Long getDatoid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    public void setTemporary(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    public Boolean getTemporary() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    public void setActive(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    public void setActivePid(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    public Integer getActivePid() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    public void setXmin(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    public Long getXmin() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    public void setCatalogXmin(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    public Long getCatalogXmin() {
        return (Long) get(8);
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
    public void setRestartLsn(Object value) {
        set(9, value);
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
    public Object getRestartLsn() {
        return get(9);
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
    public void setConfirmedFlushLsn(Object value) {
        set(10, value);
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
    public Object getConfirmedFlushLsn() {
        return get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    public void setWalStatus(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    public String getWalStatus() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    public void setSafeWalSize(Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    public Long getSafeWalSize() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    public void setTwoPhase(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    public Boolean getTwoPhase() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.conflicting</code>.
     */
    public void setConflicting(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.conflicting</code>.
     */
    public Boolean getConflicting() {
        return (Boolean) get(14);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetReplicationSlotsRecord
     */
    public PgGetReplicationSlotsRecord() {
        super(PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS);
    }

    /**
     * Create a detached, initialised PgGetReplicationSlotsRecord
     */
    public PgGetReplicationSlotsRecord(String slotName, String plugin, String slotType, Long datoid, Boolean temporary, Boolean active, Integer activePid, Long xmin, Long catalogXmin, Object restartLsn, Object confirmedFlushLsn, String walStatus, Long safeWalSize, Boolean twoPhase, Boolean conflicting) {
        super(PgGetReplicationSlots.PG_GET_REPLICATION_SLOTS);

        setSlotName(slotName);
        setPlugin(plugin);
        setSlotType(slotType);
        setDatoid(datoid);
        setTemporary(temporary);
        setActive(active);
        setActivePid(activePid);
        setXmin(xmin);
        setCatalogXmin(catalogXmin);
        setRestartLsn(restartLsn);
        setConfirmedFlushLsn(confirmedFlushLsn);
        setWalStatus(walStatus);
        setSafeWalSize(safeWalSize);
        setTwoPhase(twoPhase);
        setConflicting(conflicting);
    }
}
