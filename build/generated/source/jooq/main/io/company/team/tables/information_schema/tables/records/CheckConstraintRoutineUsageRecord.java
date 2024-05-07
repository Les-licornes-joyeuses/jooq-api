/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables.records;


import io.company.team.tables.information_schema.tables.CheckConstraintRoutineUsage;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraintRoutineUsageRecord extends TableRecordImpl<CheckConstraintRoutineUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.check_constraint_routine_usage.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.check_constraint_routine_usage.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.check_constraint_routine_usage.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.check_constraint_routine_usage.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.check_constraint_routine_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.check_constraint_routine_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.check_constraint_routine_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.check_constraint_routine_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.check_constraint_routine_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.check_constraint_routine_usage.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CheckConstraintRoutineUsageRecord
     */
    public CheckConstraintRoutineUsageRecord() {
        super(CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    /**
     * Create a detached, initialised CheckConstraintRoutineUsageRecord
     */
    public CheckConstraintRoutineUsageRecord(String constraintCatalog, String constraintSchema, String constraintName, String specificCatalog, String specificSchema, String specificName) {
        super(CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
    }
}
