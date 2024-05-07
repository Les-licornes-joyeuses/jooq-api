/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgGetMultixactMembers;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetMultixactMembersRecord extends TableRecordImpl<PgGetMultixactMembersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_multixact_members.xid</code>.
     */
    public void setXid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_multixact_members.xid</code>.
     */
    public Long getXid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_multixact_members.mode</code>.
     */
    public void setMode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_multixact_members.mode</code>.
     */
    public String getMode() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetMultixactMembersRecord
     */
    public PgGetMultixactMembersRecord() {
        super(PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS);
    }

    /**
     * Create a detached, initialised PgGetMultixactMembersRecord
     */
    public PgGetMultixactMembersRecord(Long xid, String mode) {
        super(PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS);

        setXid(xid);
        setMode(mode);
    }
}