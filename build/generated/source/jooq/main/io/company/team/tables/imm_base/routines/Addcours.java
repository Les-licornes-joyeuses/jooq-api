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
public class Addcours extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>IMM_base.addcours.sigle</code>.
     */
    public static final Parameter<String> SIGLE = Internal.createParameter("sigle", io.company.team.tables.mdd.Domains.SIGLE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.addcours.titre</code>.
     */
    public static final Parameter<String> TITRE = Internal.createParameter("titre", io.company.team.tables.mdd.Domains.TITRE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.addcours.credit</code>.
     */
    public static final Parameter<Short> CREDIT = Internal.createParameter("credit", io.company.team.tables.mdd.Domains.CDC.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public Addcours() {
        super("addcours", ImmBase.IMM_BASE);

        addInParameter(SIGLE);
        addInParameter(TITRE);
        addInParameter(CREDIT);
        setSQLUsable(false);
    }

    /**
     * Set the <code>sigle</code> parameter IN value to the routine
     */
    public void setSigle(String value) {
        setValue(SIGLE, value);
    }

    /**
     * Set the <code>titre</code> parameter IN value to the routine
     */
    public void setTitre(String value) {
        setValue(TITRE, value);
    }

    /**
     * Set the <code>credit</code> parameter IN value to the routine
     */
    public void setCredit(Short value) {
        setValue(CREDIT, value);
    }
}
