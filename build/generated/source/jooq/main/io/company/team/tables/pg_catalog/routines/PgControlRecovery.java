/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.routines;


import io.company.team.tables.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgControlRecovery extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> MIN_RECOVERY_END_LSN = Internal.createParameter("min_recovery_end_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_recovery.min_recovery_end_timeline</code>.
     */
    public static final Parameter<Integer> MIN_RECOVERY_END_TIMELINE = Internal.createParameter("min_recovery_end_timeline", SQLDataType.INTEGER, false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> BACKUP_START_LSN = Internal.createParameter("backup_start_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> BACKUP_END_LSN = Internal.createParameter("backup_end_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_recovery.end_of_backup_record_required</code>.
     */
    public static final Parameter<Boolean> END_OF_BACKUP_RECORD_REQUIRED = Internal.createParameter("end_of_backup_record_required", SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public PgControlRecovery() {
        super("pg_control_recovery", PgCatalog.PG_CATALOG);

        addOutParameter(MIN_RECOVERY_END_LSN);
        addOutParameter(MIN_RECOVERY_END_TIMELINE);
        addOutParameter(BACKUP_START_LSN);
        addOutParameter(BACKUP_END_LSN);
        addOutParameter(END_OF_BACKUP_RECORD_REQUIRED);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getMinRecoveryEndLsn() {
        return get(MIN_RECOVERY_END_LSN);
    }

    /**
     * Get the <code>min_recovery_end_timeline</code> parameter OUT value from
     * the routine
     */
    public Integer getMinRecoveryEndTimeline() {
        return get(MIN_RECOVERY_END_TIMELINE);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getBackupStartLsn() {
        return get(BACKUP_START_LSN);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getBackupEndLsn() {
        return get(BACKUP_END_LSN);
    }

    /**
     * Get the <code>end_of_backup_record_required</code> parameter OUT value
     * from the routine
     */
    public Boolean getEndOfBackupRecordRequired() {
        return get(END_OF_BACKUP_RECORD_REQUIRED);
    }
}
