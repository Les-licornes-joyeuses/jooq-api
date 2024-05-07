/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.routines;


import io.company.team.tables.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.XML;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableToXmlAndXmlschema extends AbstractRoutine<XML> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.table_to_xml_and_xmlschema.RETURN_VALUE</code>.
     */
    public static final Parameter<XML> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.XML, false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> TBL = Internal.createParameter("tbl", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false);

    /**
     * The parameter <code>pg_catalog.table_to_xml_and_xmlschema.nulls</code>.
     */
    public static final Parameter<Boolean> NULLS = Internal.createParameter("nulls", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>pg_catalog.table_to_xml_and_xmlschema.tableforest</code>.
     */
    public static final Parameter<Boolean> TABLEFOREST = Internal.createParameter("tableforest", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>pg_catalog.table_to_xml_and_xmlschema.targetns</code>.
     */
    public static final Parameter<String> TARGETNS = Internal.createParameter("targetns", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public TableToXmlAndXmlschema() {
        super("table_to_xml_and_xmlschema", PgCatalog.PG_CATALOG, SQLDataType.XML);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TBL);
        addInParameter(NULLS);
        addInParameter(TABLEFOREST);
        addInParameter(TARGETNS);
    }

    /**
     * Set the <code>tbl</code> parameter IN value to the routine
     */
    public void setTbl(Object value) {
        setValue(TBL, value);
    }

    /**
     * Set the <code>tbl</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTbl(Field<Object> field) {
        setField(TBL, field);
    }

    /**
     * Set the <code>nulls</code> parameter IN value to the routine
     */
    public void setNulls(Boolean value) {
        setValue(NULLS, value);
    }

    /**
     * Set the <code>nulls</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setNulls(Field<Boolean> field) {
        setField(NULLS, field);
    }

    /**
     * Set the <code>tableforest</code> parameter IN value to the routine
     */
    public void setTableforest(Boolean value) {
        setValue(TABLEFOREST, value);
    }

    /**
     * Set the <code>tableforest</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setTableforest(Field<Boolean> field) {
        setField(TABLEFOREST, field);
    }

    /**
     * Set the <code>targetns</code> parameter IN value to the routine
     */
    public void setTargetns(String value) {
        setValue(TARGETNS, value);
    }

    /**
     * Set the <code>targetns</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTargetns(Field<String> field) {
        setField(TARGETNS, field);
    }
}
