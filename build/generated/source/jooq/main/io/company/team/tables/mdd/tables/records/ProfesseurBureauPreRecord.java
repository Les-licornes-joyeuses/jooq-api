/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.tables.records;


import io.company.team.tables.mdd.tables.ProfesseurBureauPre;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * La personne enseignante (identifiée par le matricule "matriculeP") a un
 * bureau et ce bureau est le "bureau". 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfesseurBureauPreRecord extends UpdatableRecordImpl<ProfesseurBureauPreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>MDD.professeur_bureau_pre.matriculep</code>.
     */
    public void setMatriculep(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>MDD.professeur_bureau_pre.matriculep</code>.
     */
    public String getMatriculep() {
        return (String) get(0);
    }

    /**
     * Setter for <code>MDD.professeur_bureau_pre.bureau</code>.
     */
    public void setBureau(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>MDD.professeur_bureau_pre.bureau</code>.
     */
    public String getBureau() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProfesseurBureauPreRecord
     */
    public ProfesseurBureauPreRecord() {
        super(ProfesseurBureauPre.PROFESSEUR_BUREAU_PRE);
    }

    /**
     * Create a detached, initialised ProfesseurBureauPreRecord
     */
    public ProfesseurBureauPreRecord(String matriculep, String bureau) {
        super(ProfesseurBureauPre.PROFESSEUR_BUREAU_PRE);

        setMatriculep(matriculep);
        setBureau(bureau);
    }
}
