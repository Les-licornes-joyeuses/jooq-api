/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.routines;


import io.company.team.tables.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonObjectFieldText extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.json_object_field_text.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.json_object_field_text.from_json</code>.
     */
    public static final Parameter<JSON> FROM_JSON = Internal.createParameter("from_json", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>pg_catalog.json_object_field_text.field_name</code>.
     */
    public static final Parameter<String> FIELD_NAME = Internal.createParameter("field_name", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonObjectFieldText() {
        super("json_object_field_text", PgCatalog.PG_CATALOG, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(FIELD_NAME);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(JSON value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<JSON> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>field_name</code> parameter IN value to the routine
     */
    public void setFieldName(String value) {
        setValue(FIELD_NAME, value);
    }

    /**
     * Set the <code>field_name</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFieldName(Field<String> field) {
        setField(FIELD_NAME, field);
    }
}
