/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.pg_catalog.tables.records;


import io.company.team.tables.pg_catalog.tables.PgLogicalSlotPeekBinaryChanges;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLogicalSlotPeekBinaryChangesRecord extends TableRecordImpl<PgLogicalSlotPeekBinaryChangesRecord> {

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
    public void setLsn(Object value) {
        set(0, value);
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
    public Object getLsn() {
        return get(0);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.xid</code>.
     */
    public void setXid(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.xid</code>.
     */
    public Long getXid() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.data</code>.
     */
    public void setData(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_logical_slot_peek_binary_changes.data</code>.
     */
    public byte[] getData() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLogicalSlotPeekBinaryChangesRecord
     */
    public PgLogicalSlotPeekBinaryChangesRecord() {
        super(PgLogicalSlotPeekBinaryChanges.PG_LOGICAL_SLOT_PEEK_BINARY_CHANGES);
    }

    /**
     * Create a detached, initialised PgLogicalSlotPeekBinaryChangesRecord
     */
    public PgLogicalSlotPeekBinaryChangesRecord(Object lsn, Long xid, byte[] data) {
        super(PgLogicalSlotPeekBinaryChanges.PG_LOGICAL_SLOT_PEEK_BINARY_CHANGES);

        setLsn(lsn);
        setXid(xid);
        setData(data);
    }
}
