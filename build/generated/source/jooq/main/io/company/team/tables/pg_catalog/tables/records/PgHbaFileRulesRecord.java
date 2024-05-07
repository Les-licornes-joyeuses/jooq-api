/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgHbaFileRules;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgHbaFileRulesRecord extends TableRecordImpl<PgHbaFileRulesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.rule_number</code>.
     */
    public void setRuleNumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.rule_number</code>.
     */
    public Integer getRuleNumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.file_name</code>.
     */
    public void setFileName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.file_name</code>.
     */
    public String getFileName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public void setLineNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public Integer getLineNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public void setDatabase(String[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public String[] getDatabase() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public void setUserName(String[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public String[] getUserName() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public void setAddress(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public String getAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public void setNetmask(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public String getNetmask() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public void setAuthMethod(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public String getAuthMethod() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public void setOptions(String[] value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public String[] getOptions() {
        return (String[]) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public void setError(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public String getError() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgHbaFileRulesRecord
     */
    public PgHbaFileRulesRecord() {
        super(PgHbaFileRules.PG_HBA_FILE_RULES);
    }

    /**
     * Create a detached, initialised PgHbaFileRulesRecord
     */
    public PgHbaFileRulesRecord(Integer ruleNumber, String fileName, Integer lineNumber, String type, String[] database, String[] userName, String address, String netmask, String authMethod, String[] options, String error) {
        super(PgHbaFileRules.PG_HBA_FILE_RULES);

        setRuleNumber(ruleNumber);
        setFileName(fileName);
        setLineNumber(lineNumber);
        setType(type);
        setDatabase(database);
        setUserName(userName);
        setAddress(address);
        setNetmask(netmask);
        setAuthMethod(authMethod);
        setOptions(options);
        setError(error);
    }
}