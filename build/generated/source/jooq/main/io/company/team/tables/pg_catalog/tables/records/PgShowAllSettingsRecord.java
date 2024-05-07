/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgShowAllSettings;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShowAllSettingsRecord extends TableRecordImpl<PgShowAllSettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.setting</code>.
     */
    public void setSetting(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.setting</code>.
     */
    public String getSetting() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.unit</code>.
     */
    public void setUnit(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.unit</code>.
     */
    public String getUnit() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.category</code>.
     */
    public void setCategory(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.category</code>.
     */
    public String getCategory() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.short_desc</code>.
     */
    public void setShortDesc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.short_desc</code>.
     */
    public String getShortDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.extra_desc</code>.
     */
    public void setExtraDesc(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.extra_desc</code>.
     */
    public String getExtraDesc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.context</code>.
     */
    public void setContext(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.context</code>.
     */
    public String getContext() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.vartype</code>.
     */
    public void setVartype(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.vartype</code>.
     */
    public String getVartype() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.source</code>.
     */
    public void setSource(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.source</code>.
     */
    public String getSource() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.min_val</code>.
     */
    public void setMinVal(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.min_val</code>.
     */
    public String getMinVal() {
        return (String) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.max_val</code>.
     */
    public void setMaxVal(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.max_val</code>.
     */
    public String getMaxVal() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.enumvals</code>.
     */
    public void setEnumvals(String[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.enumvals</code>.
     */
    public String[] getEnumvals() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.boot_val</code>.
     */
    public void setBootVal(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.boot_val</code>.
     */
    public String getBootVal() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.reset_val</code>.
     */
    public void setResetVal(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.reset_val</code>.
     */
    public String getResetVal() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.sourcefile</code>.
     */
    public void setSourcefile(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.sourcefile</code>.
     */
    public String getSourcefile() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.sourceline</code>.
     */
    public void setSourceline(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.sourceline</code>.
     */
    public Integer getSourceline() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_show_all_settings.pending_restart</code>.
     */
    public void setPendingRestart(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_show_all_settings.pending_restart</code>.
     */
    public Boolean getPendingRestart() {
        return (Boolean) get(16);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShowAllSettingsRecord
     */
    public PgShowAllSettingsRecord() {
        super(PgShowAllSettings.PG_SHOW_ALL_SETTINGS);
    }

    /**
     * Create a detached, initialised PgShowAllSettingsRecord
     */
    public PgShowAllSettingsRecord(String name, String setting, String unit, String category, String shortDesc, String extraDesc, String context, String vartype, String source, String minVal, String maxVal, String[] enumvals, String bootVal, String resetVal, String sourcefile, Integer sourceline, Boolean pendingRestart) {
        super(PgShowAllSettings.PG_SHOW_ALL_SETTINGS);

        setName(name);
        setSetting(setting);
        setUnit(unit);
        setCategory(category);
        setShortDesc(shortDesc);
        setExtraDesc(extraDesc);
        setContext(context);
        setVartype(vartype);
        setSource(source);
        setMinVal(minVal);
        setMaxVal(maxVal);
        setEnumvals(enumvals);
        setBootVal(bootVal);
        setResetVal(resetVal);
        setSourcefile(sourcefile);
        setSourceline(sourceline);
        setPendingRestart(pendingRestart);
    }
}
