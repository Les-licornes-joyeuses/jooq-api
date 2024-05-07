/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.routines;


import io.company.team.tables.pg_catalog.PgCatalog;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Overlaps12 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.overlaps.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.overlaps._1</code>.
     */
    public static final Parameter<LocalDateTime> _1 = Internal.createParameter("_1", SQLDataType.LOCALDATETIME(6), false, true);

    /**
     * The parameter <code>pg_catalog.overlaps._2</code>.
     */
    public static final Parameter<LocalDateTime> _2 = Internal.createParameter("_2", SQLDataType.LOCALDATETIME(6), false, true);

    /**
     * The parameter <code>pg_catalog.overlaps._3</code>.
     */
    public static final Parameter<LocalDateTime> _3 = Internal.createParameter("_3", SQLDataType.LOCALDATETIME(6), false, true);

    /**
     * The parameter <code>pg_catalog.overlaps._4</code>.
     */
    public static final Parameter<YearToSecond> _4 = Internal.createParameter("_4", SQLDataType.INTERVAL, false, true);

    /**
     * Create a new routine call instance
     */
    public Overlaps12() {
        super("overlaps", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDateTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDateTime> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalDateTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalDateTime> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(LocalDateTime value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__3(Field<LocalDateTime> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(YearToSecond value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__4(Field<YearToSecond> field) {
        setField(_4, field);
    }
}
