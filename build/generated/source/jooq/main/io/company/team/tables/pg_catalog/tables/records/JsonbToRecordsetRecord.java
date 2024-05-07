/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.JsonbToRecordset;

import org.jooq.Record;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbToRecordsetRecord extends TableRecordImpl<JsonbToRecordsetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public void setJsonbToRecordset(Record value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.jsonb_to_recordset.jsonb_to_recordset</code>.
     */
    public Record getJsonbToRecordset() {
        return (Record) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbToRecordsetRecord
     */
    public JsonbToRecordsetRecord() {
        super(JsonbToRecordset.JSONB_TO_RECORDSET);
    }

    /**
     * Create a detached, initialised JsonbToRecordsetRecord
     */
    public JsonbToRecordsetRecord(Record jsonbToRecordset) {
        super(JsonbToRecordset.JSONB_TO_RECORDSET);

        setJsonbToRecordset(jsonbToRecordset);
    }
}
