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
public class Ajouteroffre extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>IMM_base.ajouteroffre._sigle</code>.
     */
    public static final Parameter<String> _SIGLE = Internal.createParameter("_sigle", io.company.team.tables.mdd.Domains.SIGLE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.ajouteroffre._trimestre</code>.
     */
    public static final Parameter<String> _TRIMESTRE = Internal.createParameter("_trimestre", io.company.team.tables.mdd.Domains.TRIMESTRE.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public Ajouteroffre() {
        super("ajouteroffre", ImmBase.IMM_BASE);

        addInParameter(_SIGLE);
        addInParameter(_TRIMESTRE);
        setSQLUsable(false);
    }

    /**
     * Set the <code>_sigle</code> parameter IN value to the routine
     */
    public void set_Sigle(String value) {
        setValue(_SIGLE, value);
    }

    /**
     * Set the <code>_trimestre</code> parameter IN value to the routine
     */
    public void set_Trimestre(String value) {
        setValue(_TRIMESTRE, value);
    }
}