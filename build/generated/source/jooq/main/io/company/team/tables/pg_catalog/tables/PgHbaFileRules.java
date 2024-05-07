/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgHbaFileRulesRecord;

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
public class PgHbaFileRules extends TableImpl<PgHbaFileRulesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_hba_file_rules</code>
     */
    public static final PgHbaFileRules PG_HBA_FILE_RULES = new PgHbaFileRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgHbaFileRulesRecord> getRecordType() {
        return PgHbaFileRulesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.rule_number</code>.
     */
    public final TableField<PgHbaFileRulesRecord, Integer> RULE_NUMBER = createField(DSL.name("rule_number"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.file_name</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> FILE_NAME = createField(DSL.name("file_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public final TableField<PgHbaFileRulesRecord, Integer> LINE_NUMBER = createField(DSL.name("line_number"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> DATABASE = createField(DSL.name("database"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> USER_NAME = createField(DSL.name("user_name"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> NETMASK = createField(DSL.name("netmask"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> AUTH_METHOD = createField(DSL.name("auth_method"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String[]> OPTIONS = createField(DSL.name("options"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public final TableField<PgHbaFileRulesRecord, String> ERROR = createField(DSL.name("error"), SQLDataType.CLOB, this, "");

    private PgHbaFileRules(Name alias, Table<PgHbaFileRulesRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgHbaFileRules(Name alias, Table<PgHbaFileRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_hba_file_rules</code> table
     * reference
     */
    public PgHbaFileRules(String alias) {
        this(DSL.name(alias), PG_HBA_FILE_RULES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_hba_file_rules</code> table
     * reference
     */
    public PgHbaFileRules(Name alias) {
        this(alias, PG_HBA_FILE_RULES);
    }

    /**
     * Create a <code>pg_catalog.pg_hba_file_rules</code> table reference
     */
    public PgHbaFileRules() {
        this(DSL.name("pg_hba_file_rules"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgHbaFileRules as(String alias) {
        return new PgHbaFileRules(DSL.name(alias), this, parameters);
    }

    @Override
    public PgHbaFileRules as(Name alias) {
        return new PgHbaFileRules(alias, this, parameters);
    }

    @Override
    public PgHbaFileRules as(Table<?> alias) {
        return new PgHbaFileRules(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgHbaFileRules rename(String name) {
        return new PgHbaFileRules(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgHbaFileRules rename(Name name) {
        return new PgHbaFileRules(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgHbaFileRules rename(Table<?> name) {
        return new PgHbaFileRules(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgHbaFileRules call() {
        PgHbaFileRules result = new PgHbaFileRules(DSL.name("pg_hba_file_rules"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
