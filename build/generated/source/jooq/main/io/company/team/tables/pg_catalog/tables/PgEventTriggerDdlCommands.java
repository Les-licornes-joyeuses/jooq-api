/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgEventTriggerDdlCommandsRecord;

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
public class PgEventTriggerDdlCommands extends TableImpl<PgEventTriggerDdlCommandsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_event_trigger_ddl_commands</code>
     */
    public static final PgEventTriggerDdlCommands PG_EVENT_TRIGGER_DDL_COMMANDS = new PgEventTriggerDdlCommands();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgEventTriggerDdlCommandsRecord> getRecordType() {
        return PgEventTriggerDdlCommandsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.classid</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Long> CLASSID = createField(DSL.name("classid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_ddl_commands.objid</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Long> OBJID = createField(DSL.name("objid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_ddl_commands.objsubid</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_ddl_commands.command_tag</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> COMMAND_TAG = createField(DSL.name("command_tag"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_type</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_ddl_commands.schema_name</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> SCHEMA_NAME = createField(DSL.name("schema_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_ddl_commands.object_identity</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, String> OBJECT_IDENTITY = createField(DSL.name("object_identity"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_event_trigger_ddl_commands.in_extension</code>.
     */
    public final TableField<PgEventTriggerDdlCommandsRecord, Boolean> IN_EXTENSION = createField(DSL.name("in_extension"), SQLDataType.BOOLEAN, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgEventTriggerDdlCommandsRecord, Object> COMMAND = createField(DSL.name("command"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_ddl_command\""), this, "");

    private PgEventTriggerDdlCommands(Name alias, Table<PgEventTriggerDdlCommandsRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgEventTriggerDdlCommands(Name alias, Table<PgEventTriggerDdlCommandsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger_ddl_commands</code>
     * table reference
     */
    public PgEventTriggerDdlCommands(String alias) {
        this(DSL.name(alias), PG_EVENT_TRIGGER_DDL_COMMANDS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger_ddl_commands</code>
     * table reference
     */
    public PgEventTriggerDdlCommands(Name alias) {
        this(alias, PG_EVENT_TRIGGER_DDL_COMMANDS);
    }

    /**
     * Create a <code>pg_catalog.pg_event_trigger_ddl_commands</code> table
     * reference
     */
    public PgEventTriggerDdlCommands() {
        this(DSL.name("pg_event_trigger_ddl_commands"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgEventTriggerDdlCommands as(String alias) {
        return new PgEventTriggerDdlCommands(DSL.name(alias), this, parameters);
    }

    @Override
    public PgEventTriggerDdlCommands as(Name alias) {
        return new PgEventTriggerDdlCommands(alias, this, parameters);
    }

    @Override
    public PgEventTriggerDdlCommands as(Table<?> alias) {
        return new PgEventTriggerDdlCommands(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDdlCommands rename(String name) {
        return new PgEventTriggerDdlCommands(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDdlCommands rename(Name name) {
        return new PgEventTriggerDdlCommands(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDdlCommands rename(Table<?> name) {
        return new PgEventTriggerDdlCommands(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgEventTriggerDdlCommands call() {
        PgEventTriggerDdlCommands result = new PgEventTriggerDdlCommands(DSL.name("pg_event_trigger_ddl_commands"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
