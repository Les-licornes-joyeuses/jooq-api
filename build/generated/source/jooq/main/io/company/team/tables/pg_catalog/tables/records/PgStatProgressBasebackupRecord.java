/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgStatProgressBasebackup;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatProgressBasebackupRecord extends TableRecordImpl<PgStatProgressBasebackupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_basebackup.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_basebackup.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_basebackup.phase</code>.
     */
    public void setPhase(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_basebackup.phase</code>.
     */
    public String getPhase() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_total</code>.
     */
    public void setBackupTotal(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_total</code>.
     */
    public Long getBackupTotal() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_streamed</code>.
     */
    public void setBackupStreamed(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_streamed</code>.
     */
    public Long getBackupStreamed() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_total</code>.
     */
    public void setTablespacesTotal(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_total</code>.
     */
    public Long getTablespacesTotal() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_streamed</code>.
     */
    public void setTablespacesStreamed(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_streamed</code>.
     */
    public Long getTablespacesStreamed() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressBasebackupRecord
     */
    public PgStatProgressBasebackupRecord() {
        super(PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP);
    }

    /**
     * Create a detached, initialised PgStatProgressBasebackupRecord
     */
    public PgStatProgressBasebackupRecord(Integer pid, String phase, Long backupTotal, Long backupStreamed, Long tablespacesTotal, Long tablespacesStreamed) {
        super(PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP);

        setPid(pid);
        setPhase(phase);
        setBackupTotal(backupTotal);
        setBackupStreamed(backupStreamed);
        setTablespacesTotal(tablespacesTotal);
        setTablespacesStreamed(tablespacesStreamed);
    }
}
