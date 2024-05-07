/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.routines;


import io.company.team.tables.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetObjectAddress extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.type</code>.
     */
    public static final Parameter<String> TYPE = Internal.createParameter("type", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.object_names</code>.
     */
    public static final Parameter<String[]> OBJECT_NAMES = Internal.createParameter("object_names", SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.object_args</code>.
     */
    public static final Parameter<String[]> OBJECT_ARGS = Internal.createParameter("object_args", SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.classid</code>.
     */
    public static final Parameter<Long> CLASSID = Internal.createParameter("classid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.objid</code>.
     */
    public static final Parameter<Long> OBJID = Internal.createParameter("objid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_get_object_address.objsubid</code>.
     */
    public static final Parameter<Integer> OBJSUBID = Internal.createParameter("objsubid", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public PgGetObjectAddress() {
        super("pg_get_object_address", PgCatalog.PG_CATALOG);

        addInParameter(TYPE);
        addInParameter(OBJECT_NAMES);
        addInParameter(OBJECT_ARGS);
        addOutParameter(CLASSID);
        addOutParameter(OBJID);
        addOutParameter(OBJSUBID);
    }

    /**
     * Set the <code>type</code> parameter IN value to the routine
     */
    public void setType(String value) {
        setValue(TYPE, value);
    }

    /**
     * Set the <code>object_names</code> parameter IN value to the routine
     */
    public void setObjectNames(String[] value) {
        setValue(OBJECT_NAMES, value);
    }

    /**
     * Set the <code>object_args</code> parameter IN value to the routine
     */
    public void setObjectArgs(String[] value) {
        setValue(OBJECT_ARGS, value);
    }

    /**
     * Get the <code>classid</code> parameter OUT value from the routine
     */
    public Long getClassid() {
        return get(CLASSID);
    }

    /**
     * Get the <code>objid</code> parameter OUT value from the routine
     */
    public Long getObjid() {
        return get(OBJID);
    }

    /**
     * Get the <code>objsubid</code> parameter OUT value from the routine
     */
    public Integer getObjsubid() {
        return get(OBJSUBID);
    }
}
