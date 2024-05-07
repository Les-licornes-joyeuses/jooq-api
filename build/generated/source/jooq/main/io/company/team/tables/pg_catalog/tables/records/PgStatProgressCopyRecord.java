/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgStatProgressCopy;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatProgressCopyRecord extends TableRecordImpl<PgStatProgressCopyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.datid</code>.
     */
    public void setDatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.datname</code>.
     */
    public void setDatname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.datname</code>.
     */
    public String getDatname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.command</code>.
     */
    public void setCommand(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.command</code>.
     */
    public String getCommand() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.type</code>.
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.bytes_processed</code>.
     */
    public void setBytesProcessed(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.bytes_processed</code>.
     */
    public Long getBytesProcessed() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.bytes_total</code>.
     */
    public void setBytesTotal(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.bytes_total</code>.
     */
    public Long getBytesTotal() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_copy.tuples_processed</code>.
     */
    public void setTuplesProcessed(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_copy.tuples_processed</code>.
     */
    public Long getTuplesProcessed() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_copy.tuples_excluded</code>.
     */
    public void setTuplesExcluded(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_copy.tuples_excluded</code>.
     */
    public Long getTuplesExcluded() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressCopyRecord
     */
    public PgStatProgressCopyRecord() {
        super(PgStatProgressCopy.PG_STAT_PROGRESS_COPY);
    }

    /**
     * Create a detached, initialised PgStatProgressCopyRecord
     */
    public PgStatProgressCopyRecord(Integer pid, Long datid, String datname, Long relid, String command, String type, Long bytesProcessed, Long bytesTotal, Long tuplesProcessed, Long tuplesExcluded) {
        super(PgStatProgressCopy.PG_STAT_PROGRESS_COPY);

        setPid(pid);
        setDatid(datid);
        setDatname(datname);
        setRelid(relid);
        setCommand(command);
        setType(type);
        setBytesProcessed(bytesProcessed);
        setBytesTotal(bytesTotal);
        setTuplesProcessed(tuplesProcessed);
        setTuplesExcluded(tuplesExcluded);
    }
}