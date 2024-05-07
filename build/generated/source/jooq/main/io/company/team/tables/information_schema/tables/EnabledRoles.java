/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.information_schema.tables;


import io.company.team.tables.information_schema.InformationSchema;
import io.company.team.tables.information_schema.tables.records.EnabledRolesRecord;

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
public class EnabledRoles extends TableImpl<EnabledRolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.enabled_roles</code>
     */
    public static final EnabledRoles ENABLED_ROLES = new EnabledRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnabledRolesRecord> getRecordType() {
        return EnabledRolesRecord.class;
    }

    /**
     * The column <code>information_schema.enabled_roles.role_name</code>.
     */
    public final TableField<EnabledRolesRecord, String> ROLE_NAME = createField(DSL.name("role_name"), io.company.team.tables.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private EnabledRoles(Name alias, Table<EnabledRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnabledRoles(Name alias, Table<EnabledRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "enabled_roles" as  SELECT (rolname)::information_schema.sql_identifier AS role_name
         FROM pg_authid a
        WHERE pg_has_role(oid, 'USAGE'::text);
        """));
    }

    /**
     * Create an aliased <code>information_schema.enabled_roles</code> table
     * reference
     */
    public EnabledRoles(String alias) {
        this(DSL.name(alias), ENABLED_ROLES);
    }

    /**
     * Create an aliased <code>information_schema.enabled_roles</code> table
     * reference
     */
    public EnabledRoles(Name alias) {
        this(alias, ENABLED_ROLES);
    }

    /**
     * Create a <code>information_schema.enabled_roles</code> table reference
     */
    public EnabledRoles() {
        this(DSL.name("enabled_roles"), null);
    }

    public <O extends Record> EnabledRoles(Table<O> child, ForeignKey<O, EnabledRolesRecord> key) {
        super(child, key, ENABLED_ROLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public EnabledRoles as(String alias) {
        return new EnabledRoles(DSL.name(alias), this);
    }

    @Override
    public EnabledRoles as(Name alias) {
        return new EnabledRoles(alias, this);
    }

    @Override
    public EnabledRoles as(Table<?> alias) {
        return new EnabledRoles(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(String name) {
        return new EnabledRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(Name name) {
        return new EnabledRoles(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(Table<?> name) {
        return new EnabledRoles(name.getQualifiedName(), null);
    }
}
