/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgStatsExtExprs;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatsExtExprsRecord extends TableRecordImpl<PgStatsExtExprsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stats_ext_exprs.statistics_schemaname</code>.
     */
    public void setStatisticsSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stats_ext_exprs.statistics_schemaname</code>.
     */
    public String getStatisticsSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.statistics_name</code>.
     */
    public void setStatisticsName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.statistics_name</code>.
     */
    public String getStatisticsName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.statistics_owner</code>.
     */
    public void setStatisticsOwner(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.statistics_owner</code>.
     */
    public String getStatisticsOwner() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.expr</code>.
     */
    public void setExpr(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.expr</code>.
     */
    public String getExpr() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.inherited</code>.
     */
    public void setInherited(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.inherited</code>.
     */
    public Boolean getInherited() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.null_frac</code>.
     */
    public void setNullFrac(Float value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.null_frac</code>.
     */
    public Float getNullFrac() {
        return (Float) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.avg_width</code>.
     */
    public void setAvgWidth(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.avg_width</code>.
     */
    public Integer getAvgWidth() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.n_distinct</code>.
     */
    public void setNDistinct(Float value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.n_distinct</code>.
     */
    public Float getNDistinct() {
        return (Float) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.most_common_vals</code>.
     */
    public void setMostCommonVals(Object[] value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.most_common_vals</code>.
     */
    public Object[] getMostCommonVals() {
        return (Object[]) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.most_common_freqs</code>.
     */
    public void setMostCommonFreqs(Float[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.most_common_freqs</code>.
     */
    public Float[] getMostCommonFreqs() {
        return (Float[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.histogram_bounds</code>.
     */
    public void setHistogramBounds(Object[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.histogram_bounds</code>.
     */
    public Object[] getHistogramBounds() {
        return (Object[]) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.correlation</code>.
     */
    public void setCorrelation(Float value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.correlation</code>.
     */
    public Float getCorrelation() {
        return (Float) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.most_common_elems</code>.
     */
    public void setMostCommonElems(Object[] value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.most_common_elems</code>.
     */
    public Object[] getMostCommonElems() {
        return (Object[]) get(14);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stats_ext_exprs.most_common_elem_freqs</code>.
     */
    public void setMostCommonElemFreqs(Float[] value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stats_ext_exprs.most_common_elem_freqs</code>.
     */
    public Float[] getMostCommonElemFreqs() {
        return (Float[]) get(15);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stats_ext_exprs.elem_count_histogram</code>.
     */
    public void setElemCountHistogram(Float[] value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stats_ext_exprs.elem_count_histogram</code>.
     */
    public Float[] getElemCountHistogram() {
        return (Float[]) get(16);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatsExtExprsRecord
     */
    public PgStatsExtExprsRecord() {
        super(PgStatsExtExprs.PG_STATS_EXT_EXPRS);
    }

    /**
     * Create a detached, initialised PgStatsExtExprsRecord
     */
    public PgStatsExtExprsRecord(String schemaname, String tablename, String statisticsSchemaname, String statisticsName, String statisticsOwner, String expr, Boolean inherited, Float nullFrac, Integer avgWidth, Float nDistinct, Object[] mostCommonVals, Float[] mostCommonFreqs, Object[] histogramBounds, Float correlation, Object[] mostCommonElems, Float[] mostCommonElemFreqs, Float[] elemCountHistogram) {
        super(PgStatsExtExprs.PG_STATS_EXT_EXPRS);

        setSchemaname(schemaname);
        setTablename(tablename);
        setStatisticsSchemaname(statisticsSchemaname);
        setStatisticsName(statisticsName);
        setStatisticsOwner(statisticsOwner);
        setExpr(expr);
        setInherited(inherited);
        setNullFrac(nullFrac);
        setAvgWidth(avgWidth);
        setNDistinct(nDistinct);
        setMostCommonVals(mostCommonVals);
        setMostCommonFreqs(mostCommonFreqs);
        setHistogramBounds(histogramBounds);
        setCorrelation(correlation);
        setMostCommonElems(mostCommonElems);
        setMostCommonElemFreqs(mostCommonElemFreqs);
        setElemCountHistogram(elemCountHistogram);
    }
}