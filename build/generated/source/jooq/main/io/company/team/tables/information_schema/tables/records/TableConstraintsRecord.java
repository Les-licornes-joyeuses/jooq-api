/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables.records;


import io.company.team.tables.information_schema.tables.TableConstraints;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableConstraintsRecord extends TableRecordImpl<TableConstraintsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.table_constraints.table_name</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.table_name</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.constraint_type</code>.
     */
    public void setConstraintType(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.constraint_type</code>.
     */
    public String getConstraintType() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public void setIsDeferrable(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public String getIsDeferrable() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public void setInitiallyDeferred(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public String getInitiallyDeferred() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.table_constraints.enforced</code>.
     */
    public void setEnforced(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.enforced</code>.
     */
    public String getEnforced() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.table_constraints.nulls_distinct</code>.
     */
    public void setNullsDistinct(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_constraints.nulls_distinct</code>.
     */
    public String getNullsDistinct() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableConstraintsRecord
     */
    public TableConstraintsRecord() {
        super(TableConstraints.TABLE_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised TableConstraintsRecord
     */
    public TableConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableCatalog, String tableSchema, String tableName, String constraintType, String isDeferrable, String initiallyDeferred, String enforced, String nullsDistinct) {
        super(TableConstraints.TABLE_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setConstraintType(constraintType);
        setIsDeferrable(isDeferrable);
        setInitiallyDeferred(initiallyDeferred);
        setEnforced(enforced);
        setNullsDistinct(nullsDistinct);
    }
}
