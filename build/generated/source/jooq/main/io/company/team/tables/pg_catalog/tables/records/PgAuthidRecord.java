/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgAuthid;

import java.time.OffsetDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAuthidRecord extends UpdatableRecordImpl<PgAuthidRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_authid.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    public void setRolname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolname</code>.
     */
    public String getRolname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public void setRolsuper(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolsuper</code>.
     */
    public Boolean getRolsuper() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public void setRolinherit(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolinherit</code>.
     */
    public Boolean getRolinherit() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public void setRolcreaterole(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreaterole</code>.
     */
    public Boolean getRolcreaterole() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public void setRolcreatedb(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcreatedb</code>.
     */
    public Boolean getRolcreatedb() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public void setRolcanlogin(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolcanlogin</code>.
     */
    public Boolean getRolcanlogin() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public void setRolreplication(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolreplication</code>.
     */
    public Boolean getRolreplication() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public void setRolbypassrls(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolbypassrls</code>.
     */
    public Boolean getRolbypassrls() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public void setRolconnlimit(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolconnlimit</code>.
     */
    public Integer getRolconnlimit() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public void setRolpassword(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolpassword</code>.
     */
    public String getRolpassword() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public void setRolvaliduntil(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_authid.rolvaliduntil</code>.
     */
    public OffsetDateTime getRolvaliduntil() {
        return (OffsetDateTime) get(11);
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
     * Create a detached PgAuthidRecord
     */
    public PgAuthidRecord() {
        super(PgAuthid.PG_AUTHID);
    }

    /**
     * Create a detached, initialised PgAuthidRecord
     */
    public PgAuthidRecord(Long oid, String rolname, Boolean rolsuper, Boolean rolinherit, Boolean rolcreaterole, Boolean rolcreatedb, Boolean rolcanlogin, Boolean rolreplication, Boolean rolbypassrls, Integer rolconnlimit, String rolpassword, OffsetDateTime rolvaliduntil) {
        super(PgAuthid.PG_AUTHID);

        setOid(oid);
        setRolname(rolname);
        setRolsuper(rolsuper);
        setRolinherit(rolinherit);
        setRolcreaterole(rolcreaterole);
        setRolcreatedb(rolcreatedb);
        setRolcanlogin(rolcanlogin);
        setRolreplication(rolreplication);
        setRolbypassrls(rolbypassrls);
        setRolconnlimit(rolconnlimit);
        setRolpassword(rolpassword);
        setRolvaliduntil(rolvaliduntil);
    }
}
