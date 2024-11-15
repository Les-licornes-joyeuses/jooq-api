/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.tables.records;


import io.company.team.tables.mdd.tables.Etudiant;

import java.time.LocalDate;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * La personne étudiante (identifiée par le matricule "matriculeE") possède un
 * dossier à l’Université. Son nom est "nom". Sa date de naissance est "ddn". 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EtudiantRecord extends UpdatableRecordImpl<EtudiantRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>MDD.etudiant.matriculee</code>.
     */
    public void setMatriculee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>MDD.etudiant.matriculee</code>.
     */
    public String getMatriculee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>MDD.etudiant.nom</code>.
     */
    public void setNom(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>MDD.etudiant.nom</code>.
     */
    public String getNom() {
        return (String) get(1);
    }

    /**
     * Setter for <code>MDD.etudiant.ddn</code>.
     */
    public void setDdn(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>MDD.etudiant.ddn</code>.
     */
    public LocalDate getDdn() {
        return (LocalDate) get(2);
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
     * Create a detached EtudiantRecord
     */
    public EtudiantRecord() {
        super(Etudiant.ETUDIANT);
    }

    /**
     * Create a detached, initialised EtudiantRecord
     */
    public EtudiantRecord(String matriculee, String nom, LocalDate ddn) {
        super(Etudiant.ETUDIANT);

        setMatriculee(matriculee);
        setNom(nom);
        setDdn(ddn);
    }
}
