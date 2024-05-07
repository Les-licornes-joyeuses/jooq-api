/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables;


import io.company.team.tables.information_schema.InformationSchema;
import io.company.team.tables.information_schema.tables.records.ForeignServersRecord;

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
public class ForeignServers extends TableImpl<ForeignServersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.foreign_servers</code>
     */
    public static final ForeignServers FOREIGN_SERVERS = new ForeignServers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignServersRecord> getRecordType() {
        return ForeignServersRecord.class;
    }

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_catalog</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_name</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_data_wrapper_name</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_type</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_TYPE = createField(DSL.name("foreign_server_type"), io.company.team.tables.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_servers.foreign_server_version</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_VERSION = createField(DSL.name("foreign_server_version"), io.company.team.tables.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_servers.authorization_identifier</code>.
     */
    public final TableField<ForeignServersRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ForeignServers(Name alias, Table<ForeignServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignServers(Name alias, Table<ForeignServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "foreign_servers" as  SELECT foreign_server_catalog,
         foreign_server_name,
         foreign_data_wrapper_catalog,
         foreign_data_wrapper_name,
         foreign_server_type,
         foreign_server_version,
         authorization_identifier
        FROM information_schema._pg_foreign_servers;
        """));
    }

    /**
     * Create an aliased <code>information_schema.foreign_servers</code> table
     * reference
     */
    public ForeignServers(String alias) {
        this(DSL.name(alias), FOREIGN_SERVERS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_servers</code> table
     * reference
     */
    public ForeignServers(Name alias) {
        this(alias, FOREIGN_SERVERS);
    }

    /**
     * Create a <code>information_schema.foreign_servers</code> table reference
     */
    public ForeignServers() {
        this(DSL.name("foreign_servers"), null);
    }

    public <O extends Record> ForeignServers(Table<O> child, ForeignKey<O, ForeignServersRecord> key) {
        super(child, key, FOREIGN_SERVERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ForeignServers as(String alias) {
        return new ForeignServers(DSL.name(alias), this);
    }

    @Override
    public ForeignServers as(Name alias) {
        return new ForeignServers(alias, this);
    }

    @Override
    public ForeignServers as(Table<?> alias) {
        return new ForeignServers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServers rename(String name) {
        return new ForeignServers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServers rename(Name name) {
        return new ForeignServers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServers rename(Table<?> name) {
        return new ForeignServers(name.getQualifiedName(), null);
    }
}
