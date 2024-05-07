/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.StringToTableRecord;

import org.jooq.Field;
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
public class StringToTable extends TableImpl<StringToTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.string_to_table</code>
     */
    public static final StringToTable STRING_TO_TABLE = new StringToTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StringToTableRecord> getRecordType() {
        return StringToTableRecord.class;
    }

    /**
     * The column <code>pg_catalog.string_to_table.string_to_table</code>.
     */
    public final TableField<StringToTableRecord, String> STRING_TO_TABLE_ = createField(DSL.name("string_to_table"), SQLDataType.CLOB, this, "");

    private StringToTable(Name alias, Table<StringToTableRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private StringToTable(Name alias, Table<StringToTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.string_to_table</code> table reference
     */
    public StringToTable(String alias) {
        this(DSL.name(alias), STRING_TO_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.string_to_table</code> table reference
     */
    public StringToTable(Name alias) {
        this(alias, STRING_TO_TABLE);
    }

    /**
     * Create a <code>pg_catalog.string_to_table</code> table reference
     */
    public StringToTable() {
        this(DSL.name("string_to_table"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public StringToTable as(String alias) {
        return new StringToTable(DSL.name(alias), this, parameters);
    }

    @Override
    public StringToTable as(Name alias) {
        return new StringToTable(alias, this, parameters);
    }

    @Override
    public StringToTable as(Table<?> alias) {
        return new StringToTable(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StringToTable rename(String name) {
        return new StringToTable(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StringToTable rename(Name name) {
        return new StringToTable(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StringToTable rename(Table<?> name) {
        return new StringToTable(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StringToTable call(
          String __1
        , String __2
    ) {
        StringToTable result = new StringToTable(DSL.name("string_to_table"), null, new Field[] {
            DSL.val(__1, SQLDataType.CLOB),
            DSL.val(__2, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public StringToTable call(
          Field<String> __1
        , Field<String> __2
    ) {
        StringToTable result = new StringToTable(DSL.name("string_to_table"), null, new Field[] {
            __1,
            __2
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
