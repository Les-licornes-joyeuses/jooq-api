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
public class Modifiernote extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>IMM_base.modifiernote._matriculee</code>.
     */
    public static final Parameter<String> _MATRICULEE = Internal.createParameter("_matriculee", io.company.team.tables.mdd.Domains.MATRICULEE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiernote._sigle</code>.
     */
    public static final Parameter<String> _SIGLE = Internal.createParameter("_sigle", io.company.team.tables.mdd.Domains.SIGLE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiernote._trimestre</code>.
     */
    public static final Parameter<String> _TRIMESTRE = Internal.createParameter("_trimestre", io.company.team.tables.mdd.Domains.TRIMESTRE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiernote._nogroupe</code>.
     */
    public static final Parameter<String> _NOGROUPE = Internal.createParameter("_nogroupe", io.company.team.tables.mdd.Domains.NOGROUPE.getDataType(), false, false);

    /**
     * The parameter <code>IMM_base.modifiernote._note</code>.
     */
    public static final Parameter<Short> _NOTE = Internal.createParameter("_note", io.company.team.tables.mdd.Domains.NOTE.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public Modifiernote() {
        super("modifiernote", ImmBase.IMM_BASE);

        addInParameter(_MATRICULEE);
        addInParameter(_SIGLE);
        addInParameter(_TRIMESTRE);
        addInParameter(_NOGROUPE);
        addInParameter(_NOTE);
        setSQLUsable(false);
    }

    /**
     * Set the <code>_matriculee</code> parameter IN value to the routine
     */
    public void set_Matriculee(String value) {
        setValue(_MATRICULEE, value);
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

    /**
     * Set the <code>_note</code> parameter IN value to the routine
     */
    public void set_Note(Short value) {
        setValue(_NOTE, value);
    }
}
