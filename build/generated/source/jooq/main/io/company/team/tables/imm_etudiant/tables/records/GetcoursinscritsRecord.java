/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.imm_etudiant.tables.records;


import io.company.team.tables.imm_etudiant.tables.Getcoursinscrits;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetcoursinscritsRecord extends TableRecordImpl<GetcoursinscritsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>imm_etudiant.getcoursinscrits.titre</code>.
     */
    public void setTitre(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>imm_etudiant.getcoursinscrits.titre</code>.
     */
    public String getTitre() {
        return (String) get(0);
    }

    /**
     * Setter for <code>imm_etudiant.getcoursinscrits.sigle</code>.
     */
    public void setSigle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>imm_etudiant.getcoursinscrits.sigle</code>.
     */
    public String getSigle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>imm_etudiant.getcoursinscrits.matriculep</code>.
     */
    public void setMatriculep(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>imm_etudiant.getcoursinscrits.matriculep</code>.
     */
    public String getMatriculep() {
        return (String) get(2);
    }

    /**
     * Setter for <code>imm_etudiant.getcoursinscrits.nom</code>.
     */
    public void setNom(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>imm_etudiant.getcoursinscrits.nom</code>.
     */
    public String getNom() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetcoursinscritsRecord
     */
    public GetcoursinscritsRecord() {
        super(Getcoursinscrits.GETCOURSINSCRITS);
    }

    /**
     * Create a detached, initialised GetcoursinscritsRecord
     */
    public GetcoursinscritsRecord(String titre, String sigle, String matriculep, String nom) {
        super(Getcoursinscrits.GETCOURSINSCRITS);

        setTitre(titre);
        setSigle(sigle);
        setMatriculep(matriculep);
        setNom(nom);
    }
}
