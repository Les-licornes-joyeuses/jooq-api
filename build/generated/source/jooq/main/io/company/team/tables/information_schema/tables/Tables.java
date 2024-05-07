/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables;


import io.company.team.tables.information_schema.InformationSchema;
import io.company.team.tables.information_schema.tables.records.TablesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends TableImpl<TablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.tables</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablesRecord> getRecordType() {
        return TablesRecord.class;
    }

    /**
     * The column <code>information_schema.tables.table_catalog</code>.
     */
    public final TableField<TablesRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.table_schema</code>.
     */
    public final TableField<TablesRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.table_name</code>.
     */
    public final TableField<TablesRecord, String> TABLE_NAME = createField(DSL.name("table_name"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.table_type</code>.
     */
    public final TableField<TablesRecord, String> TABLE_TYPE = createField(DSL.name("table_type"), io.company.team.tables.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.tables.self_referencing_column_name</code>.
     */
    public final TableField<TablesRecord, String> SELF_REFERENCING_COLUMN_NAME = createField(DSL.name("self_referencing_column_name"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.reference_generation</code>.
     */
    public final TableField<TablesRecord, String> REFERENCE_GENERATION = createField(DSL.name("reference_generation"), io.company.team.tables.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.tables.user_defined_type_catalog</code>.
     */
    public final TableField<TablesRecord, String> USER_DEFINED_TYPE_CATALOG = createField(DSL.name("user_defined_type_catalog"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.tables.user_defined_type_schema</code>.
     */
    public final TableField<TablesRecord, String> USER_DEFINED_TYPE_SCHEMA = createField(DSL.name("user_defined_type_schema"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.user_defined_type_name</code>.
     */
    public final TableField<TablesRecord, String> USER_DEFINED_TYPE_NAME = createField(DSL.name("user_defined_type_name"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.is_insertable_into</code>.
     */
    public final TableField<TablesRecord, String> IS_INSERTABLE_INTO = createField(DSL.name("is_insertable_into"), io.company.team.tables.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.is_typed</code>.
     */
    public final TableField<TablesRecord, String> IS_TYPED = createField(DSL.name("is_typed"), io.company.team.tables.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.tables.commit_action</code>.
     */
    public final TableField<TablesRecord, String> COMMIT_ACTION = createField(DSL.name("commit_action"), io.company.team.tables.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private Tables(Name alias, Table<TablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tables(Name alias, Table<TablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "tables" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
          (nc.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (
              CASE
                  WHEN (nc.oid = pg_my_temp_schema()) THEN 'LOCAL TEMPORARY'::text
                  WHEN (c.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) THEN 'BASE TABLE'::text
                  WHEN (c.relkind = 'v'::"char") THEN 'VIEW'::text
                  WHEN (c.relkind = 'f'::"char") THEN 'FOREIGN'::text
                  ELSE NULL::text
              END)::information_schema.character_data AS table_type,
          (NULL::name)::information_schema.sql_identifier AS self_referencing_column_name,
          (NULL::character varying)::information_schema.character_data AS reference_generation,
          (
              CASE
                  WHEN (t.typname IS NOT NULL) THEN current_database()
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS user_defined_type_catalog,
          (nt.nspname)::information_schema.sql_identifier AS user_defined_type_schema,
          (t.typname)::information_schema.sql_identifier AS user_defined_type_name,
          (
              CASE
                  WHEN ((c.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) OR ((c.relkind = ANY (ARRAY['v'::"char", 'f'::"char"])) AND ((pg_relation_is_updatable((c.oid)::regclass, false) & 8) = 8))) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_insertable_into,
          (
              CASE
                  WHEN (t.typname IS NOT NULL) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_typed,
          (NULL::character varying)::information_schema.character_data AS commit_action
         FROM ((pg_namespace nc
           JOIN pg_class c ON ((nc.oid = c.relnamespace)))
           LEFT JOIN (pg_type t
           JOIN pg_namespace nt ON ((t.typnamespace = nt.oid))) ON ((c.reloftype = t.oid)))
        WHERE ((c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND (NOT pg_is_other_temp_schema(nc.oid)) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'SELECT, INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'SELECT, INSERT, UPDATE, REFERENCES'::text)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.tables</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>information_schema.tables</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    /**
     * Create a <code>information_schema.tables</code> table reference
     */
    public Tables() {
        this(DSL.name("tables"), null);
    }

    public <O extends Record> Tables(Table<O> child, ForeignKey<O, TablesRecord> key) {
        super(child, key, TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    @Override
    public Tables as(Table<?> alias) {
        return new Tables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(String name) {
        return new Tables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Name name) {
        return new Tables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Table<?> name) {
        return new Tables(name.getQualifiedName(), null);
    }
}
