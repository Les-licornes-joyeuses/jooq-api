/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.imm_etudiant;


import io.company.team.tables.DefaultCatalog;
import io.company.team.tables.imm_etudiant.tables.Getcoursinscrits;
import io.company.team.tables.imm_etudiant.tables.Getmembregroupe;
import io.company.team.tables.imm_etudiant.tables.Getnoteetudiant;
import io.company.team.tables.imm_etudiant.tables.records.GetcoursinscritsRecord;
import io.company.team.tables.imm_etudiant.tables.records.GetmembregroupeRecord;
import io.company.team.tables.imm_etudiant.tables.records.GetnoteetudiantRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImmEtudiant extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>imm_etudiant</code>
     */
    public static final ImmEtudiant IMM_ETUDIANT = new ImmEtudiant();

    /**
     * The table <code>imm_etudiant.getcoursinscrits</code>.
     */
    public final Getcoursinscrits GETCOURSINSCRITS = Getcoursinscrits.GETCOURSINSCRITS;

    /**
     * Call <code>imm_etudiant.getcoursinscrits</code>.
     */
    public static Result<GetcoursinscritsRecord> GETCOURSINSCRITS(
          Configuration configuration
        , String _Matriculee
    ) {
        return configuration.dsl().selectFrom(io.company.team.tables.imm_etudiant.tables.Getcoursinscrits.GETCOURSINSCRITS.call(
              _Matriculee
        )).fetch();
    }

    /**
     * Get <code>imm_etudiant.getcoursinscrits</code> as a table.
     */
    public static Getcoursinscrits GETCOURSINSCRITS(
          String _Matriculee
    ) {
        return io.company.team.tables.imm_etudiant.tables.Getcoursinscrits.GETCOURSINSCRITS.call(
            _Matriculee
        );
    }

    /**
     * Get <code>imm_etudiant.getcoursinscrits</code> as a table.
     */
    public static Getcoursinscrits GETCOURSINSCRITS(
          Field<String> _Matriculee
    ) {
        return io.company.team.tables.imm_etudiant.tables.Getcoursinscrits.GETCOURSINSCRITS.call(
            _Matriculee
        );
    }

    /**
     * The table <code>imm_etudiant.getmembregroupe</code>.
     */
    public final Getmembregroupe GETMEMBREGROUPE = Getmembregroupe.GETMEMBREGROUPE;

    /**
     * Call <code>imm_etudiant.getmembregroupe</code>.
     */
    public static Result<GetmembregroupeRecord> GETMEMBREGROUPE(
          Configuration configuration
        , String _Matriculee
    ) {
        return configuration.dsl().selectFrom(io.company.team.tables.imm_etudiant.tables.Getmembregroupe.GETMEMBREGROUPE.call(
              _Matriculee
        )).fetch();
    }

    /**
     * Get <code>imm_etudiant.getmembregroupe</code> as a table.
     */
    public static Getmembregroupe GETMEMBREGROUPE(
          String _Matriculee
    ) {
        return io.company.team.tables.imm_etudiant.tables.Getmembregroupe.GETMEMBREGROUPE.call(
            _Matriculee
        );
    }

    /**
     * Get <code>imm_etudiant.getmembregroupe</code> as a table.
     */
    public static Getmembregroupe GETMEMBREGROUPE(
          Field<String> _Matriculee
    ) {
        return io.company.team.tables.imm_etudiant.tables.Getmembregroupe.GETMEMBREGROUPE.call(
            _Matriculee
        );
    }

    /**
     * The table <code>imm_etudiant.getnoteetudiant</code>.
     */
    public final Getnoteetudiant GETNOTEETUDIANT = Getnoteetudiant.GETNOTEETUDIANT;

    /**
     * Call <code>imm_etudiant.getnoteetudiant</code>.
     */
    public static Result<GetnoteetudiantRecord> GETNOTEETUDIANT(
          Configuration configuration
        , String _Matriculee
        , String _Sigle
    ) {
        return configuration.dsl().selectFrom(io.company.team.tables.imm_etudiant.tables.Getnoteetudiant.GETNOTEETUDIANT.call(
              _Matriculee
            , _Sigle
        )).fetch();
    }

    /**
     * Get <code>imm_etudiant.getnoteetudiant</code> as a table.
     */
    public static Getnoteetudiant GETNOTEETUDIANT(
          String _Matriculee
        , String _Sigle
    ) {
        return io.company.team.tables.imm_etudiant.tables.Getnoteetudiant.GETNOTEETUDIANT.call(
            _Matriculee,
            _Sigle
        );
    }

    /**
     * Get <code>imm_etudiant.getnoteetudiant</code> as a table.
     */
    public static Getnoteetudiant GETNOTEETUDIANT(
          Field<String> _Matriculee
        , Field<String> _Sigle
    ) {
        return io.company.team.tables.imm_etudiant.tables.Getnoteetudiant.GETNOTEETUDIANT.call(
            _Matriculee,
            _Sigle
        );
    }

    /**
     * No further instances allowed
     */
    private ImmEtudiant() {
        super("imm_etudiant", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Getcoursinscrits.GETCOURSINSCRITS,
            Getmembregroupe.GETMEMBREGROUPE,
            Getnoteetudiant.GETNOTEETUDIANT
        );
    }
}
