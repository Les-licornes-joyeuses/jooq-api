/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgCursor;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCursorRecord extends TableRecordImpl<PgCursorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_cursor.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursor.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursor.statement</code>.
     */
    public void setStatement(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursor.statement</code>.
     */
    public String getStatement() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursor.is_holdable</code>.
     */
    public void setIsHoldable(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursor.is_holdable</code>.
     */
    public Boolean getIsHoldable() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursor.is_binary</code>.
     */
    public void setIsBinary(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursor.is_binary</code>.
     */
    public Boolean getIsBinary() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursor.is_scrollable</code>.
     */
    public void setIsScrollable(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursor.is_scrollable</code>.
     */
    public Boolean getIsScrollable() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursor.creation_time</code>.
     */
    public void setCreationTime(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursor.creation_time</code>.
     */
    public OffsetDateTime getCreationTime() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgCursorRecord
     */
    public PgCursorRecord() {
        super(PgCursor.PG_CURSOR);
    }

    /**
     * Create a detached, initialised PgCursorRecord
     */
    public PgCursorRecord(String name, String statement, Boolean isHoldable, Boolean isBinary, Boolean isScrollable, OffsetDateTime creationTime) {
        super(PgCursor.PG_CURSOR);

        setName(name);
        setStatement(statement);
        setIsHoldable(isHoldable);
        setIsBinary(isBinary);
        setIsScrollable(isScrollable);
        setCreationTime(creationTime);
    }
}
