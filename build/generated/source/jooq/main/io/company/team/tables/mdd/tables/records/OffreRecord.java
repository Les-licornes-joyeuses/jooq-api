/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.tables.records;


import io.company.team.tables.mdd.tables.Offre;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * l’Université s’engage à offrir le cours "sigle" au trimestre "trimestre". 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OffreRecord extends UpdatableRecordImpl<OffreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>MDD.offre.sigle</code>.
     */
    public void setSigle(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>MDD.offre.sigle</code>.
     */
    public String getSigle() {
        return (String) get(0);
    }

    /**
     * Setter for <code>MDD.offre.trimestre</code>.
     */
    public void setTrimestre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>MDD.offre.trimestre</code>.
     */
    public String getTrimestre() {
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
     * Create a detached OffreRecord
     */
    public OffreRecord() {
        super(Offre.OFFRE);
    }

    /**
     * Create a detached, initialised OffreRecord
     */
    public OffreRecord(String sigle, String trimestre) {
        super(Offre.OFFRE);

        setSigle(sigle);
        setTrimestre(trimestre);
    }
}
