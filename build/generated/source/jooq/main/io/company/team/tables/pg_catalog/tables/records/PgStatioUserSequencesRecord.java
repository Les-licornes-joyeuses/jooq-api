/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgStatioUserSequences;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatioUserSequencesRecord extends TableRecordImpl<PgStatioUserSequencesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_statio_user_sequences.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_sequences.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_sequences.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_sequences.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_sequences.relname</code>.
     */
    public void setRelname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_sequences.relname</code>.
     */
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_sequences.blks_read</code>.
     */
    public void setBlksRead(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_sequences.blks_read</code>.
     */
    public Long getBlksRead() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_sequences.blks_hit</code>.
     */
    public void setBlksHit(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_sequences.blks_hit</code>.
     */
    public Long getBlksHit() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatioUserSequencesRecord
     */
    public PgStatioUserSequencesRecord() {
        super(PgStatioUserSequences.PG_STATIO_USER_SEQUENCES);
    }

    /**
     * Create a detached, initialised PgStatioUserSequencesRecord
     */
    public PgStatioUserSequencesRecord(Long relid, String schemaname, String relname, Long blksRead, Long blksHit) {
        super(PgStatioUserSequences.PG_STATIO_USER_SEQUENCES);

        setRelid(relid);
        setSchemaname(schemaname);
        setRelname(relname);
        setBlksRead(blksRead);
        setBlksHit(blksHit);
    }
}
