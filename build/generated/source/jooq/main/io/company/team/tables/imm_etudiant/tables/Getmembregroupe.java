/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.imm_etudiant.tables;


import io.company.team.tables.imm_etudiant.ImmEtudiant;
import io.company.team.tables.imm_etudiant.tables.records.GetmembregroupeRecord;

import org.jooq.Field;
import org.jooq.Name;
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
public class Getmembregroupe extends TableImpl<GetmembregroupeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>imm_etudiant.getmembregroupe</code>
     */
    public static final Getmembregroupe GETMEMBREGROUPE = new Getmembregroupe();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetmembregroupeRecord> getRecordType() {
        return GetmembregroupeRecord.class;
    }

    /**
     * The column <code>imm_etudiant.getmembregroupe.nom</code>.
     */
    public final TableField<GetmembregroupeRecord, String> NOM = createField(DSL.name("nom"), io.company.team.tables.mdd.Domains.NOM.getDataType(), this, "");

    private Getmembregroupe(Name alias, Table<GetmembregroupeRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, io.company.team.tables.mdd.Domains.MATRICULEE.getDataType())
        });
    }

    private Getmembregroupe(Name alias, Table<GetmembregroupeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>imm_etudiant.getmembregroupe</code> table
     * reference
     */
    public Getmembregroupe(String alias) {
        this(DSL.name(alias), GETMEMBREGROUPE);
    }

    /**
     * Create an aliased <code>imm_etudiant.getmembregroupe</code> table
     * reference
     */
    public Getmembregroupe(Name alias) {
        this(alias, GETMEMBREGROUPE);
    }

    /**
     * Create a <code>imm_etudiant.getmembregroupe</code> table reference
     */
    public Getmembregroupe() {
        this(DSL.name("getmembregroupe"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ImmEtudiant.IMM_ETUDIANT;
    }

    @Override
    public Getmembregroupe as(String alias) {
        return new Getmembregroupe(DSL.name(alias), this, parameters);
    }

    @Override
    public Getmembregroupe as(Name alias) {
        return new Getmembregroupe(alias, this, parameters);
    }

    @Override
    public Getmembregroupe as(Table<?> alias) {
        return new Getmembregroupe(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmembregroupe rename(String name) {
        return new Getmembregroupe(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmembregroupe rename(Name name) {
        return new Getmembregroupe(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmembregroupe rename(Table<?> name) {
        return new Getmembregroupe(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public Getmembregroupe call(
          String _Matriculee
    ) {
        Getmembregroupe result = new Getmembregroupe(DSL.name("getmembregroupe"), null, new Field[] {
            DSL.val(_Matriculee, io.company.team.tables.mdd.Domains.MATRICULEE.getDataType())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public Getmembregroupe call(
          Field<String> _Matriculee
    ) {
        Getmembregroupe result = new Getmembregroupe(DSL.name("getmembregroupe"), null, new Field[] {
            _Matriculee
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}