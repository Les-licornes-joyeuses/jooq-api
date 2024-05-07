/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.GenerateSubscripts;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSubscriptsRecord extends TableRecordImpl<GenerateSubscriptsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.generate_subscripts.generate_subscripts</code>.
     */
    public void setGenerateSubscripts(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.generate_subscripts.generate_subscripts</code>.
     */
    public Integer getGenerateSubscripts() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GenerateSubscriptsRecord
     */
    public GenerateSubscriptsRecord() {
        super(GenerateSubscripts.GENERATE_SUBSCRIPTS);
    }

    /**
     * Create a detached, initialised GenerateSubscriptsRecord
     */
    public GenerateSubscriptsRecord(Integer generateSubscripts) {
        super(GenerateSubscripts.GENERATE_SUBSCRIPTS);

        setGenerateSubscripts(generateSubscripts);
    }
}
