/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.imm_base.routines;


import io.company.team.tables.imm_base.ImmBase;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Modifiercours extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>IMM_base.modifiercours._sigle</code>.
     */
    public static final Parameter<String> _SIGLE = Internal.createParameter("_sigle", io.company.team.tables.mdd.Domains.SIGLE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiercours._titre</code>.
     */
    public static final Parameter<String> _TITRE = Internal.createParameter("_titre", io.company.team.tables.mdd.Domains.TITRE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiercours._credit</code>.
     */
    public static final Parameter<Short> _CREDIT = Internal.createParameter("_credit", io.company.team.tables.mdd.Domains.CDC.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public Modifiercours() {
        super("modifiercours", ImmBase.IMM_BASE);

        addInParameter(_SIGLE);
        addInParameter(_TITRE);
        addInParameter(_CREDIT);
        setSQLUsable(false);
    }

    /**
     * Set the <code>_sigle</code> parameter IN value to the routine
     */
    public void set_Sigle(String value) {
        setValue(_SIGLE, value);
    }

    /**
     * Set the <code>_titre</code> parameter IN value to the routine
     */
    public void set_Titre(String value) {
        setValue(_TITRE, value);
    }

    /**
     * Set the <code>_credit</code> parameter IN value to the routine
     */
    public void set_Credit(Short value) {
        setValue(_CREDIT, value);
    }
}