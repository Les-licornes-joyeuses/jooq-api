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
public class PgStatGetBackendSubxact extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_stat_get_backend_subxact.bid</code>.
     */
    public static final Parameter<Integer> BID = Internal.createParameter("bid", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_stat_get_backend_subxact.subxact_count</code>.
     */
    public static final Parameter<Integer> SUBXACT_COUNT = Internal.createParameter("subxact_count", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_stat_get_backend_subxact.subxact_overflowed</code>.
     */
    public static final Parameter<Boolean> SUBXACT_OVERFLOWED = Internal.createParameter("subxact_overflowed", SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public PgStatGetBackendSubxact() {
        super("pg_stat_get_backend_subxact", PgCatalog.PG_CATALOG);

        addInParameter(BID);
        addOutParameter(SUBXACT_COUNT);
        addOutParameter(SUBXACT_OVERFLOWED);
    }

    /**
     * Set the <code>bid</code> parameter IN value to the routine
     */
    public void setBid(Integer value) {
        setValue(BID, value);
    }

    /**
     * Get the <code>subxact_count</code> parameter OUT value from the routine
     */
    public Integer getSubxactCount() {
        return get(SUBXACT_COUNT);
    }

    /**
     * Get the <code>subxact_overflowed</code> parameter OUT value from the
     * routine
     */
    public Boolean getSubxactOverflowed() {
        return get(SUBXACT_OVERFLOWED);
    }
}
