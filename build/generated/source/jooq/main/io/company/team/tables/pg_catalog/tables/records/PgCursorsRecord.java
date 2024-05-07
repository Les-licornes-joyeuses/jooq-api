/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgCursors;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCursorsRecord extends TableRecordImpl<PgCursorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_cursors.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.statement</code>.
     */
    public void setStatement(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.statement</code>.
     */
    public String getStatement() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_holdable</code>.
     */
    public void setIsHoldable(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_holdable</code>.
     */
    public Boolean getIsHoldable() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_binary</code>.
     */
    public void setIsBinary(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_binary</code>.
     */
    public Boolean getIsBinary() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.is_scrollable</code>.
     */
    public void setIsScrollable(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.is_scrollable</code>.
     */
    public Boolean getIsScrollable() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_cursors.creation_time</code>.
     */
    public void setCreationTime(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_cursors.creation_time</code>.
     */
    public OffsetDateTime getCreationTime() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgCursorsRecord
     */
    public PgCursorsRecord() {
        super(PgCursors.PG_CURSORS);
    }

    /**
     * Create a detached, initialised PgCursorsRecord
     */
    public PgCursorsRecord(String name, String statement, Boolean isHoldable, Boolean isBinary, Boolean isScrollable, OffsetDateTime creationTime) {
        super(PgCursors.PG_CURSORS);

        setName(name);
        setStatement(statement);
        setIsHoldable(isHoldable);
        setIsBinary(isBinary);
        setIsScrollable(isScrollable);
        setCreationTime(creationTime);
    }
}
