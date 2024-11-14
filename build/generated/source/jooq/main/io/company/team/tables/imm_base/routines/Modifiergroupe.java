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
public class Modifiergroupe extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>IMM_base.modifiergroupe._sigle</code>.
     */
    public static final Parameter<String> _SIGLE = Internal.createParameter("_sigle", io.company.team.tables.mdd.Domains.SIGLE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiergroupe._trimestre</code>.
     */
    public static final Parameter<String> _TRIMESTRE = Internal.createParameter("_trimestre", io.company.team.tables.mdd.Domains.TRIMESTRE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiergroupe._nogroupe</code>.
     */
    public static final Parameter<String> _NOGROUPE = Internal.createParameter("_nogroupe", io.company.team.tables.mdd.Domains.NOGROUPE.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public Modifiergroupe() {
        super("modifiergroupe", ImmBase.IMM_BASE);

        addInParameter(_SIGLE);
        addInParameter(_TRIMESTRE);
        addInParameter(_NOGROUPE);
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

    /**
     * Set the <code>_nogroupe</code> parameter IN value to the routine
     */
    public void set_Nogroupe(String value) {
        setValue(_NOGROUPE, value);
    }
}
