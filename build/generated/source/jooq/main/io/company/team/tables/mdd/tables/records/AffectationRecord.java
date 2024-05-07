/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.tables.records;


import io.company.team.tables.mdd.tables.Affectation;

import org.jooq.Record3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * La personne enseignante (identifiée par "matriculeP") assure la formation du
 * groupe identifié par les  sigle "sigle", le numéro "noGroupe" et le trimestre
 * "trimestre". 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AffectationRecord extends UpdatableRecordImpl<AffectationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>MDD.affectation.sigle</code>.
     */
    public void setSigle(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>MDD.affectation.sigle</code>.
     */
    public String getSigle() {
        return (String) get(0);
    }

    /**
     * Setter for <code>MDD.affectation.trimestre</code>.
     */
    public void setTrimestre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>MDD.affectation.trimestre</code>.
     */
    public String getTrimestre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>MDD.affectation.nogroupe</code>.
     */
    public void setNogroupe(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>MDD.affectation.nogroupe</code>.
     */
    public String getNogroupe() {
        return (String) get(2);
    }

    /**
     * Setter for <code>MDD.affectation.matriculep</code>.
     */
    public void setMatriculep(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>MDD.affectation.matriculep</code>.
     */
    public String getMatriculep() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AffectationRecord
     */
    public AffectationRecord() {
        super(Affectation.AFFECTATION);
    }

    /**
     * Create a detached, initialised AffectationRecord
     */
    public AffectationRecord(String sigle, String trimestre, String nogroupe, String matriculep) {
        super(Affectation.AFFECTATION);

        setSigle(sigle);
        setTrimestre(trimestre);
        setNogroupe(nogroupe);
        setMatriculep(matriculep);
    }
}