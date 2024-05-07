/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables.records;


import io.company.team.tables.information_schema.tables.Domains;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DomainsRecord extends TableRecordImpl<DomainsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.domains.domain_catalog</code>.
     */
    public void setDomainCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.domains.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.domains.domain_schema</code>.
     */
    public void setDomainSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.domains.domain_schema</code>.
     */
    public String getDomainSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.domains.domain_name</code>.
     */
    public void setDomainName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.domains.domain_name</code>.
     */
    public String getDomainName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.domains.data_type</code>.
     */
    public void setDataType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.domains.data_type</code>.
     */
    public String getDataType() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    public void setCharacterMaximumLength(Integer value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.domains.character_octet_length</code>.
     */
    public void setCharacterOctetLength(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.domains.character_octet_length</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>information_schema.domains.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.domains.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.domains.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.domains.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.domains.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.domains.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.domains.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.domains.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.domains.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.domains.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.domains.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.domains.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.domains.numeric_precision</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.domains.numeric_precision</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(12);
    }

    /**
     * Setter for
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>information_schema.domains.numeric_scale</code>.
     */
    public void setNumericScale(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.domains.numeric_scale</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>information_schema.domains.datetime_precision</code>.
     */
    public void setDatetimePrecision(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.domains.datetime_precision</code>.
     */
    public Integer getDatetimePrecision() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>information_schema.domains.interval_type</code>.
     */
    public void setIntervalType(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.domains.interval_type</code>.
     */
    public String getIntervalType() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.domains.interval_precision</code>.
     */
    public void setIntervalPrecision(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.domains.interval_precision</code>.
     */
    public Integer getIntervalPrecision() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>information_schema.domains.domain_default</code>.
     */
    public void setDomainDefault(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.domains.domain_default</code>.
     */
    public String getDomainDefault() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.domains.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.domains.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.domains.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.domains.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(20);
    }

    /**
     * Setter for <code>information_schema.domains.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.domains.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.domains.scope_catalog</code>.
     */
    public void setScopeCatalog(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.domains.scope_catalog</code>.
     */
    public String getScopeCatalog() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.domains.scope_schema</code>.
     */
    public void setScopeSchema(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.domains.scope_schema</code>.
     */
    public String getScopeSchema() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.domains.scope_name</code>.
     */
    public void setScopeName(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.domains.scope_name</code>.
     */
    public String getScopeName() {
        return (String) get(24);
    }

    /**
     * Setter for <code>information_schema.domains.maximum_cardinality</code>.
     */
    public void setMaximumCardinality(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.domains.maximum_cardinality</code>.
     */
    public Integer getMaximumCardinality() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>information_schema.domains.dtd_identifier</code>.
     */
    public void setDtdIdentifier(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.domains.dtd_identifier</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(26);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DomainsRecord
     */
    public DomainsRecord() {
        super(Domains.DOMAINS);
    }

    /**
     * Create a detached, initialised DomainsRecord
     */
    public DomainsRecord(String domainCatalog, String domainSchema, String domainName, String dataType, Integer characterMaximumLength, Integer characterOctetLength, String characterSetCatalog, String characterSetSchema, String characterSetName, String collationCatalog, String collationSchema, String collationName, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, Integer datetimePrecision, String intervalType, Integer intervalPrecision, String domainDefault, String udtCatalog, String udtSchema, String udtName, String scopeCatalog, String scopeSchema, String scopeName, Integer maximumCardinality, String dtdIdentifier) {
        super(Domains.DOMAINS);

        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setIntervalType(intervalType);
        setIntervalPrecision(intervalPrecision);
        setDomainDefault(domainDefault);
        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setScopeCatalog(scopeCatalog);
        setScopeSchema(scopeSchema);
        setScopeName(scopeName);
        setMaximumCardinality(maximumCardinality);
        setDtdIdentifier(dtdIdentifier);
    }
}
