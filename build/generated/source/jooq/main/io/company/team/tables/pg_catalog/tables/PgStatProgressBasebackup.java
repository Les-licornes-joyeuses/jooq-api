/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables;


import io.company.team.tables.pg_catalog.PgCatalog;
import io.company.team.tables.pg_catalog.tables.records.PgStatProgressBasebackupRecord;

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
public class PgStatProgressBasebackup extends TableImpl<PgStatProgressBasebackupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_progress_basebackup</code>
     */
    public static final PgStatProgressBasebackup PG_STAT_PROGRESS_BASEBACKUP = new PgStatProgressBasebackup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatProgressBasebackupRecord> getRecordType() {
        return PgStatProgressBasebackupRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_progress_basebackup.pid</code>.
     */
    public final TableField<PgStatProgressBasebackupRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_progress_basebackup.phase</code>.
     */
    public final TableField<PgStatProgressBasebackupRecord, String> PHASE = createField(DSL.name("phase"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_total</code>.
     */
    public final TableField<PgStatProgressBasebackupRecord, Long> BACKUP_TOTAL = createField(DSL.name("backup_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_streamed</code>.
     */
    public final TableField<PgStatProgressBasebackupRecord, Long> BACKUP_STREAMED = createField(DSL.name("backup_streamed"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_total</code>.
     */
    public final TableField<PgStatProgressBasebackupRecord, Long> TABLESPACES_TOTAL = createField(DSL.name("tablespaces_total"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_streamed</code>.
     */
    public final TableField<PgStatProgressBasebackupRecord, Long> TABLESPACES_STREAMED = createField(DSL.name("tablespaces_streamed"), SQLDataType.BIGINT, this, "");

    private PgStatProgressBasebackup(Name alias, Table<PgStatProgressBasebackupRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatProgressBasebackup(Name alias, Table<PgStatProgressBasebackupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_progress_basebackup" as  SELECT pid,
             CASE param1
                 WHEN 0 THEN 'initializing'::text
                 WHEN 1 THEN 'waiting for checkpoint to finish'::text
                 WHEN 2 THEN 'estimating backup size'::text
                 WHEN 3 THEN 'streaming database files'::text
                 WHEN 4 THEN 'waiting for wal archiving to finish'::text
                 WHEN 5 THEN 'transferring wal files'::text
                 ELSE NULL::text
             END AS phase,
             CASE param2
                 WHEN '-1'::integer THEN NULL::bigint
                 ELSE param2
             END AS backup_total,
         param3 AS backup_streamed,
         param4 AS tablespaces_total,
         param5 AS tablespaces_streamed
        FROM pg_stat_get_progress_info('BASEBACKUP'::text) s(pid, datid, relid, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_basebackup</code>
     * table reference
     */
    public PgStatProgressBasebackup(String alias) {
        this(DSL.name(alias), PG_STAT_PROGRESS_BASEBACKUP);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_progress_basebackup</code>
     * table reference
     */
    public PgStatProgressBasebackup(Name alias) {
        this(alias, PG_STAT_PROGRESS_BASEBACKUP);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_progress_basebackup</code> table
     * reference
     */
    public PgStatProgressBasebackup() {
        this(DSL.name("pg_stat_progress_basebackup"), null);
    }

    public <O extends Record> PgStatProgressBasebackup(Table<O> child, ForeignKey<O, PgStatProgressBasebackupRecord> key) {
        super(child, key, PG_STAT_PROGRESS_BASEBACKUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatProgressBasebackup as(String alias) {
        return new PgStatProgressBasebackup(DSL.name(alias), this);
    }

    @Override
    public PgStatProgressBasebackup as(Name alias) {
        return new PgStatProgressBasebackup(alias, this);
    }

    @Override
    public PgStatProgressBasebackup as(Table<?> alias) {
        return new PgStatProgressBasebackup(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressBasebackup rename(String name) {
        return new PgStatProgressBasebackup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressBasebackup rename(Name name) {
        return new PgStatProgressBasebackup(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatProgressBasebackup rename(Table<?> name) {
        return new PgStatProgressBasebackup(name.getQualifiedName(), null);
    }
}
