/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgDatabase;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgDatabaseRecord extends UpdatableRecordImpl<PgDatabaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_database.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datname</code>.
     */
    public void setDatname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datname</code>.
     */
    public String getDatname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datdba</code>.
     */
    public void setDatdba(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datdba</code>.
     */
    public Long getDatdba() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.encoding</code>.
     */
    public void setEncoding(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.encoding</code>.
     */
    public Integer getEncoding() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datlocprovider</code>.
     */
    public void setDatlocprovider(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datlocprovider</code>.
     */
    public String getDatlocprovider() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public void setDatistemplate(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datistemplate</code>.
     */
    public Boolean getDatistemplate() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public void setDatallowconn(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datallowconn</code>.
     */
    public Boolean getDatallowconn() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public void setDatconnlimit(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datconnlimit</code>.
     */
    public Integer getDatconnlimit() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public void setDatfrozenxid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datfrozenxid</code>.
     */
    public Long getDatfrozenxid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public void setDatminmxid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datminmxid</code>.
     */
    public Long getDatminmxid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public void setDattablespace(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.dattablespace</code>.
     */
    public Long getDattablespace() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    public void setDatcollate(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datcollate</code>.
     */
    public String getDatcollate() {
        return (String) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datctype</code>.
     */
    public void setDatctype(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datctype</code>.
     */
    public String getDatctype() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.daticulocale</code>.
     */
    public void setDaticulocale(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.daticulocale</code>.
     */
    public String getDaticulocale() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.daticurules</code>.
     */
    public void setDaticurules(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.daticurules</code>.
     */
    public String getDaticurules() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datcollversion</code>.
     */
    public void setDatcollversion(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datcollversion</code>.
     */
    public String getDatcollversion() {
        return (String) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_database.datacl</code>.
     */
    public void setDatacl(String[] value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_database.datacl</code>.
     */
    public String[] getDatacl() {
        return (String[]) get(16);
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
     * Create a detached PgDatabaseRecord
     */
    public PgDatabaseRecord() {
        super(PgDatabase.PG_DATABASE);
    }

    /**
     * Create a detached, initialised PgDatabaseRecord
     */
    public PgDatabaseRecord(Long oid, String datname, Long datdba, Integer encoding, String datlocprovider, Boolean datistemplate, Boolean datallowconn, Integer datconnlimit, Long datfrozenxid, Long datminmxid, Long dattablespace, String datcollate, String datctype, String daticulocale, String daticurules, String datcollversion, String[] datacl) {
        super(PgDatabase.PG_DATABASE);

        setOid(oid);
        setDatname(datname);
        setDatdba(datdba);
        setEncoding(encoding);
        setDatlocprovider(datlocprovider);
        setDatistemplate(datistemplate);
        setDatallowconn(datallowconn);
        setDatconnlimit(datconnlimit);
        setDatfrozenxid(datfrozenxid);
        setDatminmxid(datminmxid);
        setDattablespace(dattablespace);
        setDatcollate(datcollate);
        setDatctype(datctype);
        setDaticulocale(daticulocale);
        setDaticurules(daticurules);
        setDatcollversion(datcollversion);
        setDatacl(datacl);
    }
}
