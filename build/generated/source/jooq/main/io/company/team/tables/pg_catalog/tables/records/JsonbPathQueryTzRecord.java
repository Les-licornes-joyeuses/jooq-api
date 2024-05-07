/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.JsonbPathQueryTz;

import org.jooq.JSONB;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbPathQueryTzRecord extends TableRecordImpl<JsonbPathQueryTzRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.jsonb_path_query_tz.jsonb_path_query_tz</code>.
     */
    public void setJsonbPathQueryTz(JSONB value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.jsonb_path_query_tz.jsonb_path_query_tz</code>.
     */
    public JSONB getJsonbPathQueryTz() {
        return (JSONB) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbPathQueryTzRecord
     */
    public JsonbPathQueryTzRecord() {
        super(JsonbPathQueryTz.JSONB_PATH_QUERY_TZ);
    }

    /**
     * Create a detached, initialised JsonbPathQueryTzRecord
     */
    public JsonbPathQueryTzRecord(JSONB jsonbPathQueryTz) {
        super(JsonbPathQueryTz.JSONB_PATH_QUERY_TZ);

        setJsonbPathQueryTz(jsonbPathQueryTz);
    }
}
