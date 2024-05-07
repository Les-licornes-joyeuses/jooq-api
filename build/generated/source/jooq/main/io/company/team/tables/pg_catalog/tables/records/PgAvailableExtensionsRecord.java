/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgAvailableExtensions;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAvailableExtensionsRecord extends TableRecordImpl<PgAvailableExtensionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public void setDefaultVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public String getDefaultVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public void setComment(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public String getComment() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAvailableExtensionsRecord
     */
    public PgAvailableExtensionsRecord() {
        super(PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS);
    }

    /**
     * Create a detached, initialised PgAvailableExtensionsRecord
     */
    public PgAvailableExtensionsRecord(String name, String defaultVersion, String comment) {
        super(PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS);

        setName(name);
        setDefaultVersion(defaultVersion);
        setComment(comment);
    }
}
