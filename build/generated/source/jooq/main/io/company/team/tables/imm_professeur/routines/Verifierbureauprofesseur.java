/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.imm_professeur.routines;


import io.company.team.tables.imm_professeur.ImmProfesseur;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Verifierbureauprofesseur extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>imm_professeur.verifierbureauprofesseur.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>imm_professeur.verifierbureauprofesseur.matriculeprofesseur</code>.
     */
    public static final Parameter<String> MATRICULEPROFESSEUR = Internal.createParameter("matriculeprofesseur", io.company.team.tables.mdd.Domains.MATRICULEP.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public Verifierbureauprofesseur() {
        super("verifierbureauprofesseur", ImmProfesseur.IMM_PROFESSEUR, SQLDataType.VARCHAR);

        setReturnParameter(RETURN_VALUE);
        addInParameter(MATRICULEPROFESSEUR);
    }

    /**
     * Set the <code>matriculeprofesseur</code> parameter IN value to the
     * routine
     */
    public void setMatriculeprofesseur(String value) {
        setValue(MATRICULEPROFESSEUR, value);
    }

    /**
     * Set the <code>matriculeprofesseur</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public void setMatriculeprofesseur(Field<String> field) {
        setField(MATRICULEPROFESSEUR, field);
    }
}