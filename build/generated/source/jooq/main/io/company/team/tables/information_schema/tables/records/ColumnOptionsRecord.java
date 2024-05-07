/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables.records;


import io.company.team.tables.information_schema.tables.ColumnOptions;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnOptionsRecord extends TableRecordImpl<ColumnOptionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.column_options.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.column_options.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.column_options.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.column_options.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.column_options.column_name</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.column_options.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.column_options.option_name</code>.
     */
    public void setOptionName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.column_options.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.column_options.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnOptionsRecord
     */
    public ColumnOptionsRecord() {
        super(ColumnOptions.COLUMN_OPTIONS);
    }

    /**
     * Create a detached, initialised ColumnOptionsRecord
     */
    public ColumnOptionsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, String optionName, String optionValue) {
        super(ColumnOptions.COLUMN_OPTIONS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOptionName(optionName);
        setOptionValue(optionValue);
    }
}
