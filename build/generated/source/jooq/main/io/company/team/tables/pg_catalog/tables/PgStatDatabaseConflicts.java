/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgStatDatabaseConflictsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PgStatDatabaseConflicts extends TableImpl<PgStatDatabaseConflictsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_database_conflicts</code>
     */
    public static final PgStatDatabaseConflicts PG_STAT_DATABASE_CONFLICTS = new PgStatDatabaseConflicts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatDatabaseConflictsRecord> getRecordType() {
        return PgStatDatabaseConflictsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_TABLESPACE = createField(DSL.name("confl_tablespace"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_LOCK = createField(DSL.name("confl_lock"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_SNAPSHOT = createField(DSL.name("confl_snapshot"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_BUFFERPIN = createField(DSL.name("confl_bufferpin"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_DEADLOCK = createField(DSL.name("confl_deadlock"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_database_conflicts.confl_active_logicalslot</code>.
     */
    public final TableField<PgStatDatabaseConflictsRecord, Long> CONFL_ACTIVE_LOGICALSLOT = createField(DSL.name("confl_active_logicalslot"), SQLDataType.BIGINT, this, "");

    private PgStatDatabaseConflicts(Name alias, Table<PgStatDatabaseConflictsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatDatabaseConflicts(Name alias, Table<PgStatDatabaseConflictsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_database_conflicts" as  SELECT oid AS datid,
         datname,
         pg_stat_get_db_conflict_tablespace(oid) AS confl_tablespace,
         pg_stat_get_db_conflict_lock(oid) AS confl_lock,
         pg_stat_get_db_conflict_snapshot(oid) AS confl_snapshot,
         pg_stat_get_db_conflict_bufferpin(oid) AS confl_bufferpin,
         pg_stat_get_db_conflict_startup_deadlock(oid) AS confl_deadlock,
         pg_stat_get_db_conflict_logicalslot(oid) AS confl_active_logicalslot
        FROM pg_database d;
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database_conflicts</code>
     * table reference
     */
    public PgStatDatabaseConflicts(String alias) {
        this(DSL.name(alias), PG_STAT_DATABASE_CONFLICTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database_conflicts</code>
     * table reference
     */
    public PgStatDatabaseConflicts(Name alias) {
        this(alias, PG_STAT_DATABASE_CONFLICTS);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_database_conflicts</code> table
     * reference
     */
    public PgStatDatabaseConflicts() {
        this(DSL.name("pg_stat_database_conflicts"), null);
    }

    public <O extends Record> PgStatDatabaseConflicts(Table<O> child, ForeignKey<O, PgStatDatabaseConflictsRecord> key) {
        super(child, key, PG_STAT_DATABASE_CONFLICTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatDatabaseConflicts as(String alias) {
        return new PgStatDatabaseConflicts(DSL.name(alias), this);
    }

    @Override
    public PgStatDatabaseConflicts as(Name alias) {
        return new PgStatDatabaseConflicts(alias, this);
    }

    @Override
    public PgStatDatabaseConflicts as(Table<?> alias) {
        return new PgStatDatabaseConflicts(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatDatabaseConflicts rename(String name) {
        return new PgStatDatabaseConflicts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatDatabaseConflicts rename(Name name) {
        return new PgStatDatabaseConflicts(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatDatabaseConflicts rename(Table<?> name) {
        return new PgStatDatabaseConflicts(name.getQualifiedName(), null);
    }
}
