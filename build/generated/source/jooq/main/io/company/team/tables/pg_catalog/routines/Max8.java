/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.routines;


import io.company.team.tables.pg_catalog.PgCatalog;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Max8 extends AbstractRoutine<LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.max.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDate> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATE, false, false);

    /**
     * The parameter <code>pg_catalog.max._1</code>.
     */
    public static final Parameter<LocalDate> _1 = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true);

    /**
     * Create a new routine call instance
     */
    public Max8() {
        super("max", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDate value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDate> field) {
        setField(_1, field);
    }
}
