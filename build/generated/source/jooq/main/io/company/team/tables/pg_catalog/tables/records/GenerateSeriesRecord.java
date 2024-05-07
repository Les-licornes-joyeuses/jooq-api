/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.GenerateSeries;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSeriesRecord extends TableRecordImpl<GenerateSeriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public void setGenerateSeries(OffsetDateTime value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.generate_series.generate_series</code>.
     */
    public OffsetDateTime getGenerateSeries() {
        return (OffsetDateTime) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GenerateSeriesRecord
     */
    public GenerateSeriesRecord() {
        super(GenerateSeries.GENERATE_SERIES);
    }

    /**
     * Create a detached, initialised GenerateSeriesRecord
     */
    public GenerateSeriesRecord(OffsetDateTime generateSeries) {
        super(GenerateSeries.GENERATE_SERIES);

        setGenerateSeries(generateSeries);
    }
}
