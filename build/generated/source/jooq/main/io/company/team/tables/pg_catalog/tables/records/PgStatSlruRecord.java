/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgStatSlru;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatSlruRecord extends TableRecordImpl<PgStatSlruRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_zeroed</code>.
     */
    public void setBlksZeroed(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_zeroed</code>.
     */
    public Long getBlksZeroed() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_hit</code>.
     */
    public void setBlksHit(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_hit</code>.
     */
    public Long getBlksHit() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_read</code>.
     */
    public void setBlksRead(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_read</code>.
     */
    public Long getBlksRead() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_written</code>.
     */
    public void setBlksWritten(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_written</code>.
     */
    public Long getBlksWritten() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.blks_exists</code>.
     */
    public void setBlksExists(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.blks_exists</code>.
     */
    public Long getBlksExists() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.flushes</code>.
     */
    public void setFlushes(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.flushes</code>.
     */
    public Long getFlushes() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.truncates</code>.
     */
    public void setTruncates(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.truncates</code>.
     */
    public Long getTruncates() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_slru.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_slru.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatSlruRecord
     */
    public PgStatSlruRecord() {
        super(PgStatSlru.PG_STAT_SLRU);
    }

    /**
     * Create a detached, initialised PgStatSlruRecord
     */
    public PgStatSlruRecord(String name, Long blksZeroed, Long blksHit, Long blksRead, Long blksWritten, Long blksExists, Long flushes, Long truncates, OffsetDateTime statsReset) {
        super(PgStatSlru.PG_STAT_SLRU);

        setName(name);
        setBlksZeroed(blksZeroed);
        setBlksHit(blksHit);
        setBlksRead(blksRead);
        setBlksWritten(blksWritten);
        setBlksExists(blksExists);
        setFlushes(flushes);
        setTruncates(truncates);
        setStatsReset(statsReset);
    }
}
