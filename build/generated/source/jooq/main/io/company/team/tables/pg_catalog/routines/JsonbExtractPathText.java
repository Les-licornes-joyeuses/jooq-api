/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.routines;


import io.company.team.tables.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbExtractPathText extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.jsonb_extract_path_text.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_extract_path_text.from_json</code>.
     */
    public static final Parameter<JSONB> FROM_JSON = Internal.createParameter("from_json", SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_extract_path_text.path_elems</code>.
     */
    public static final Parameter<String[]> PATH_ELEMS = Internal.createParameter("path_elems", SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public JsonbExtractPathText() {
        super("jsonb_extract_path_text", PgCatalog.PG_CATALOG, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(PATH_ELEMS);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(JSONB value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<JSONB> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>path_elems</code> parameter IN value to the routine
     */
    public void setPathElems(String[] value) {
        setValue(PATH_ELEMS, value);
    }

    /**
     * Set the <code>path_elems</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setPathElems(Field<String[]> field) {
        setField(PATH_ELEMS, field);
    }
}
