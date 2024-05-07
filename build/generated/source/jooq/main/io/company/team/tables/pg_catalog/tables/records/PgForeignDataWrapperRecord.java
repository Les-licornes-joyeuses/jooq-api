/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgForeignDataWrapper;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgForeignDataWrapperRecord extends UpdatableRecordImpl<PgForeignDataWrapperRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    public void setFdwname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwname</code>.
     */
    public String getFdwname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    public void setFdwowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwowner</code>.
     */
    public Long getFdwowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    public void setFdwhandler(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwhandler</code>.
     */
    public Long getFdwhandler() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    public void setFdwvalidator(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwvalidator</code>.
     */
    public Long getFdwvalidator() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    public void setFdwacl(String[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwacl</code>.
     */
    public String[] getFdwacl() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    public void setFdwoptions(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_data_wrapper.fdwoptions</code>.
     */
    public String[] getFdwoptions() {
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
     * Create a detached PgForeignDataWrapperRecord
     */
    public PgForeignDataWrapperRecord() {
        super(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER);
    }

    /**
     * Create a detached, initialised PgForeignDataWrapperRecord
     */
    public PgForeignDataWrapperRecord(Long oid, String fdwname, Long fdwowner, Long fdwhandler, Long fdwvalidator, String[] fdwacl, String[] fdwoptions) {
        super(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER);

        setOid(oid);
        setFdwname(fdwname);
        setFdwowner(fdwowner);
        setFdwhandler(fdwhandler);
        setFdwvalidator(fdwvalidator);
        setFdwacl(fdwacl);
        setFdwoptions(fdwoptions);
    }
}