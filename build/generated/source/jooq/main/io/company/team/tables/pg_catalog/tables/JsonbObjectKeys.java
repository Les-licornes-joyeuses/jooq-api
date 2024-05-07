/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.JsonbObjectKeysRecord;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbObjectKeys extends TableImpl<JsonbObjectKeysRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.jsonb_object_keys</code>
     */
    public static final JsonbObjectKeys JSONB_OBJECT_KEYS = new JsonbObjectKeys();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonbObjectKeysRecord> getRecordType() {
        return JsonbObjectKeysRecord.class;
    }

    /**
     * The column <code>pg_catalog.jsonb_object_keys.jsonb_object_keys</code>.
     */
    public final TableField<JsonbObjectKeysRecord, String> JSONB_OBJECT_KEYS_ = createField(DSL.name("jsonb_object_keys"), SQLDataType.CLOB, this, "");

    private JsonbObjectKeys(Name alias, Table<JsonbObjectKeysRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB)
        });
    }

    private JsonbObjectKeys(Name alias, Table<JsonbObjectKeysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_object_keys</code> table
     * reference
     */
    public JsonbObjectKeys(String alias) {
        this(DSL.name(alias), JSONB_OBJECT_KEYS);
    }

    /**
     * Create an aliased <code>pg_catalog.jsonb_object_keys</code> table
     * reference
     */
    public JsonbObjectKeys(Name alias) {
        this(alias, JSONB_OBJECT_KEYS);
    }

    /**
     * Create a <code>pg_catalog.jsonb_object_keys</code> table reference
     */
    public JsonbObjectKeys() {
        this(DSL.name("jsonb_object_keys"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonbObjectKeys as(String alias) {
        return new JsonbObjectKeys(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonbObjectKeys as(Name alias) {
        return new JsonbObjectKeys(alias, this, parameters);
    }

    @Override
    public JsonbObjectKeys as(Table<?> alias) {
        return new JsonbObjectKeys(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbObjectKeys rename(String name) {
        return new JsonbObjectKeys(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbObjectKeys rename(Name name) {
        return new JsonbObjectKeys(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonbObjectKeys rename(Table<?> name) {
        return new JsonbObjectKeys(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonbObjectKeys call(
          JSONB __1
    ) {
        JsonbObjectKeys result = new JsonbObjectKeys(DSL.name("jsonb_object_keys"), null, new Field[] {
            DSL.val(__1, SQLDataType.JSONB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonbObjectKeys call(
          Field<JSONB> __1
    ) {
        JsonbObjectKeys result = new JsonbObjectKeys(DSL.name("jsonb_object_keys"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
