/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables.records;


import io.company.team.tables.information_schema.tables.ColumnDomainUsage;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnDomainUsageRecord extends TableRecordImpl<ColumnDomainUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    public void setDomainCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    public void setDomainSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.domain_schema</code>.
     */
    public String getDomainSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.domain_name</code>.
     */
    public void setDomainName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.domain_name</code>.
     */
    public String getDomainName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.column_domain_usage.column_name</code>.
     */
    public void setColumnName(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_domain_usage.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnDomainUsageRecord
     */
    public ColumnDomainUsageRecord() {
        super(ColumnDomainUsage.COLUMN_DOMAIN_USAGE);
    }

    /**
     * Create a detached, initialised ColumnDomainUsageRecord
     */
    public ColumnDomainUsageRecord(String domainCatalog, String domainSchema, String domainName, String tableCatalog, String tableSchema, String tableName, String columnName) {
        super(ColumnDomainUsage.COLUMN_DOMAIN_USAGE);

        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
    }
}
