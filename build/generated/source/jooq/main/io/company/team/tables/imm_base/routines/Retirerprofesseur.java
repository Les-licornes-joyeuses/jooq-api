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
public class Retirerprofesseur extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>IMM_base.retirerprofesseur.matricule</code>.
     */
    public static final Parameter<String> MATRICULE = Internal.createParameter("matricule", io.company.team.tables.mdd.Domains.MATRICULEP.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public Retirerprofesseur() {
        super("retirerprofesseur", ImmBase.IMM_BASE);

        addInParameter(MATRICULE);
        setSQLUsable(false);
    }

    /**
     * Set the <code>matricule</code> parameter IN value to the routine
     */
    public void setMatricule(String value) {
        setValue(MATRICULE, value);
    }
}
