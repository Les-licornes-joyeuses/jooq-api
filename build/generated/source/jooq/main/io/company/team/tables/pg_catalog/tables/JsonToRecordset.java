/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.JsonToRecordsetRecord;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
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
public class JsonToRecordset extends TableImpl<JsonToRecordsetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.json_to_recordset</code>
     */
    public static final JsonToRecordset JSON_TO_RECORDSET = new JsonToRecordset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonToRecordsetRecord> getRecordType() {
        return JsonToRecordsetRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_to_recordset.json_to_recordset</code>.
     */
    public final TableField<JsonToRecordsetRecord, Record> JSON_TO_RECORDSET_ = createField(DSL.name("json_to_recordset"), SQLDataType.RECORD, this, "");

    private JsonToRecordset(Name alias, Table<JsonToRecordsetRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSON)
        });
    }

    private JsonToRecordset(Name alias, Table<JsonToRecordsetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.json_to_recordset</code> table
     * reference
     */
    public JsonToRecordset(String alias) {
        this(DSL.name(alias), JSON_TO_RECORDSET);
    }

    /**
     * Create an aliased <code>pg_catalog.json_to_recordset</code> table
     * reference
     */
    public JsonToRecordset(Name alias) {
        this(alias, JSON_TO_RECORDSET);
    }

    /**
     * Create a <code>pg_catalog.json_to_recordset</code> table reference
     */
    public JsonToRecordset() {
        this(DSL.name("json_to_recordset"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonToRecordset as(String alias) {
        return new JsonToRecordset(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonToRecordset as(Name alias) {
        return new JsonToRecordset(alias, this, parameters);
    }

    @Override
    public JsonToRecordset as(Table<?> alias) {
        return new JsonToRecordset(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonToRecordset rename(String name) {
        return new JsonToRecordset(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonToRecordset rename(Name name) {
        return new JsonToRecordset(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonToRecordset rename(Table<?> name) {
        return new JsonToRecordset(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonToRecordset call(
          JSON __1
    ) {
        JsonToRecordset result = new JsonToRecordset(DSL.name("json_to_recordset"), null, new Field[] {
            DSL.val(__1, SQLDataType.JSON)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonToRecordset call(
          Field<JSON> __1
    ) {
        JsonToRecordset result = new JsonToRecordset(DSL.name("json_to_recordset"), null, new Field[] {
            __1
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
