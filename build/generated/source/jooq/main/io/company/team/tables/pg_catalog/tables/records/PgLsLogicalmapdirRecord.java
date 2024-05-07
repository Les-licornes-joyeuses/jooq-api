/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgLsLogicalmapdir;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLsLogicalmapdirRecord extends TableRecordImpl<PgLsLogicalmapdirRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ls_logicalmapdir.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_logicalmapdir.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_logicalmapdir.size</code>.
     */
    public void setSize(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_logicalmapdir.size</code>.
     */
    public Long getSize() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_logicalmapdir.modification</code>.
     */
    public void setModification(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_logicalmapdir.modification</code>.
     */
    public OffsetDateTime getModification() {
        return (OffsetDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLsLogicalmapdirRecord
     */
    public PgLsLogicalmapdirRecord() {
        super(PgLsLogicalmapdir.PG_LS_LOGICALMAPDIR);
    }

    /**
     * Create a detached, initialised PgLsLogicalmapdirRecord
     */
    public PgLsLogicalmapdirRecord(String name, Long size, OffsetDateTime modification) {
        super(PgLsLogicalmapdir.PG_LS_LOGICALMAPDIR);

        setName(name);
        setSize(size);
        setModification(modification);
    }
}
