/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.tables.records;


import io.company.team.tables.mdd.tables.Competence;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * La personne enseignante (identifiée par "matriculeP") a la compétence requise
 * pour assure le cours (identifié par le sigle "sigle"). 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompetenceRecord extends UpdatableRecordImpl<CompetenceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>MDD.competence.sigle</code>.
     */
    public void setSigle(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>MDD.competence.sigle</code>.
     */
    public String getSigle() {
        return (String) get(0);
    }

    /**
     * Setter for <code>MDD.competence.matriculep</code>.
     */
    public void setMatriculep(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>MDD.competence.matriculep</code>.
     */
    public String getMatriculep() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompetenceRecord
     */
    public CompetenceRecord() {
        super(Competence.COMPETENCE);
    }

    /**
     * Create a detached, initialised CompetenceRecord
     */
    public CompetenceRecord(String sigle, String matriculep) {
        super(Competence.COMPETENCE);

        setSigle(sigle);
        setMatriculep(matriculep);
    }
}
