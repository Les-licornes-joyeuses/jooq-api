/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgOpfamily;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOpfamilyRecord extends UpdatableRecordImpl<PgOpfamilyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_opfamily.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public void setOpfmethod(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public Long getOpfmethod() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public void setOpfname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public String getOpfname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public void setOpfnamespace(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public Long getOpfnamespace() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public void setOpfowner(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public Long getOpfowner() {
        return (Long) get(4);
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
     * Create a detached PgOpfamilyRecord
     */
    public PgOpfamilyRecord() {
        super(PgOpfamily.PG_OPFAMILY);
    }

    /**
     * Create a detached, initialised PgOpfamilyRecord
     */
    public PgOpfamilyRecord(Long oid, Long opfmethod, String opfname, Long opfnamespace, Long opfowner) {
        super(PgOpfamily.PG_OPFAMILY);

        setOid(oid);
        setOpfmethod(opfmethod);
        setOpfname(opfname);
        setOpfnamespace(opfnamespace);
        setOpfowner(opfowner);
    }
}