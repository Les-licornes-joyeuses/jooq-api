/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.tables.records;


import io.company.team.tables.mdd.tables.Professeur;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * La personne enseignante (identifiée par le matricule "matriculeP") possède un
 * dossier à l’Université. Une personne enseignante est une professeure, un
 * professeur, une chargée de cours ou un chargé de cours. Son nom est "nom". 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfesseurRecord extends UpdatableRecordImpl<ProfesseurRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>MDD.professeur.matriculep</code>.
     */
    public void setMatriculep(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>MDD.professeur.matriculep</code>.
     */
    public String getMatriculep() {
        return (String) get(0);
    }

    /**
     * Setter for <code>MDD.professeur.nom</code>.
     */
    public void setNom(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>MDD.professeur.nom</code>.
     */
    public String getNom() {
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
     * Create a detached ProfesseurRecord
     */
    public ProfesseurRecord() {
        super(Professeur.PROFESSEUR);
    }

    /**
     * Create a detached, initialised ProfesseurRecord
     */
    public ProfesseurRecord(String matriculep, String nom) {
        super(Professeur.PROFESSEUR);

        setMatriculep(matriculep);
        setNom(nom);
    }
}
