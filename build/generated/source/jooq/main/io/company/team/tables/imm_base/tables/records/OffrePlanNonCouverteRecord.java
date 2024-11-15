/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.imm_base.tables.records;


import io.company.team.tables.imm_base.tables.OffrePlanNonCouverte;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OffrePlanNonCouverteRecord extends TableRecordImpl<OffrePlanNonCouverteRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>IMM_base.offre_plan_non_couverte.sigle</code>.
     */
    public void setSigle(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>IMM_base.offre_plan_non_couverte.sigle</code>.
     */
    public String getSigle() {
        return (String) get(0);
    }

    /**
     * Setter for <code>IMM_base.offre_plan_non_couverte.trimestre</code>.
     */
    public void setTrimestre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>IMM_base.offre_plan_non_couverte.trimestre</code>.
     */
    public String getTrimestre() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OffrePlanNonCouverteRecord
     */
    public OffrePlanNonCouverteRecord() {
        super(OffrePlanNonCouverte.OFFRE_PLAN_NON_COUVERTE);
    }

    /**
     * Create a detached, initialised OffrePlanNonCouverteRecord
     */
    public OffrePlanNonCouverteRecord(String sigle, String trimestre) {
        super(OffrePlanNonCouverte.OFFRE_PLAN_NON_COUVERTE);

        setSigle(sigle);
        setTrimestre(trimestre);
    }
}
