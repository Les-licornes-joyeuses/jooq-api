/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables.records;


import io.company.team.tables.information_schema.tables.RoutineRoutineUsage;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineRoutineUsageRecord extends TableRecordImpl<RoutineRoutineUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.routine_catalog</code>.
     */
    public void setRoutineCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.routine_catalog</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.routine_schema</code>.
     */
    public void setRoutineSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.routine_schema</code>.
     */
    public String getRoutineSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.routine_routine_usage.routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.routine_routine_usage.routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutineRoutineUsageRecord
     */
    public RoutineRoutineUsageRecord() {
        super(RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE);
    }

    /**
     * Create a detached, initialised RoutineRoutineUsageRecord
     */
    public RoutineRoutineUsageRecord(String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName) {
        super(RoutineRoutineUsage.ROUTINE_ROUTINE_USAGE);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
    }
}
