/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgGetCatalogForeignKeys;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetCatalogForeignKeysRecord extends TableRecordImpl<PgGetCatalogForeignKeysRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setFktable(Object value) {
        set(0, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getFktable() {
        return get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.fkcols</code>.
     */
    public void setFkcols(String[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.fkcols</code>.
     */
    public String[] getFkcols() {
        return (String[]) get(1);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setPktable(Object value) {
        set(2, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getPktable() {
        return get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.pkcols</code>.
     */
    public void setPkcols(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.pkcols</code>.
     */
    public String[] getPkcols() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_array</code>.
     */
    public void setIsArray(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_array</code>.
     */
    public Boolean getIsArray() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_opt</code>.
     */
    public void setIsOpt(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_catalog_foreign_keys.is_opt</code>.
     */
    public Boolean getIsOpt() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetCatalogForeignKeysRecord
     */
    public PgGetCatalogForeignKeysRecord() {
        super(PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS);
    }

    /**
     * Create a detached, initialised PgGetCatalogForeignKeysRecord
     */
    public PgGetCatalogForeignKeysRecord(Object fktable, String[] fkcols, Object pktable, String[] pkcols, Boolean isArray, Boolean isOpt) {
        super(PgGetCatalogForeignKeys.PG_GET_CATALOG_FOREIGN_KEYS);

        setFktable(fktable);
        setFkcols(fkcols);
        setPktable(pktable);
        setPkcols(pkcols);
        setIsArray(isArray);
        setIsOpt(isOpt);
    }
}
