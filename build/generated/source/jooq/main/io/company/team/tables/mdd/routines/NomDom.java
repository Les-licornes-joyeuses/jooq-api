/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.routines;


import io.company.team.tables.mdd.Mdd;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NomDom extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>MDD.nom_dom.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>MDD.nom_dom.t</code>.
     */
    public static final Parameter<String> T = Internal.createParameter("t", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public NomDom() {
        super("nom_dom", Mdd.MDD, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(T);
    }

    /**
     * Set the <code>t</code> parameter IN value to the routine
     */
    public void setT(String value) {
        setValue(T, value);
    }

    /**
     * Set the <code>t</code> parameter to the function to be used with a {@link
     * org.jooq.Select} statement
     */
    public void setT(Field<String> field) {
        setField(T, field);
    }
}
