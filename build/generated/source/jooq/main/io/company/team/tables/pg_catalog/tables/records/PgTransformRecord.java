/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgTransform;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTransformRecord extends UpdatableRecordImpl<PgTransformRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_transform.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_transform.trftype</code>.
     */
    public void setTrftype(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trftype</code>.
     */
    public Long getTrftype() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_transform.trflang</code>.
     */
    public void setTrflang(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trflang</code>.
     */
    public Long getTrflang() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_transform.trffromsql</code>.
     */
    public void setTrffromsql(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trffromsql</code>.
     */
    public String getTrffromsql() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_transform.trftosql</code>.
     */
    public void setTrftosql(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_transform.trftosql</code>.
     */
    public String getTrftosql() {
        return (String) get(4);
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
     * Create a detached PgTransformRecord
     */
    public PgTransformRecord() {
        super(PgTransform.PG_TRANSFORM);
    }

    /**
     * Create a detached, initialised PgTransformRecord
     */
    public PgTransformRecord(Long oid, Long trftype, Long trflang, String trffromsql, String trftosql) {
        super(PgTransform.PG_TRANSFORM);

        setOid(oid);
        setTrftype(trftype);
        setTrflang(trflang);
        setTrffromsql(trffromsql);
        setTrftosql(trftosql);
    }
}
