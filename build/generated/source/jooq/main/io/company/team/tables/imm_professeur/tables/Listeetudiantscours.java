/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.imm_professeur.tables;


import io.company.team.tables.imm_professeur.ImmProfesseur;
import io.company.team.tables.imm_professeur.tables.records.ListeetudiantscoursRecord;

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
public class Listeetudiantscours extends TableImpl<ListeetudiantscoursRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>imm_professeur.listeetudiantscours</code>
     */
    public static final Listeetudiantscours LISTEETUDIANTSCOURS = new Listeetudiantscours();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ListeetudiantscoursRecord> getRecordType() {
        return ListeetudiantscoursRecord.class;
    }

    /**
     * The column <code>imm_professeur.listeetudiantscours.matriculee</code>.
     */
    public final TableField<ListeetudiantscoursRecord, String> MATRICULEE = createField(DSL.name("matriculee"), io.company.team.tables.mdd.Domains.MATRICULEE.getDataType(), this, "");

    /**
     * The column <code>imm_professeur.listeetudiantscours.nom</code>.
     */
    public final TableField<ListeetudiantscoursRecord, String> NOM = createField(DSL.name("nom"), io.company.team.tables.mdd.Domains.NOM.getDataType(), this, "");

    private Listeetudiantscours(Name alias, Table<ListeetudiantscoursRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, io.company.team.tables.mdd.Domains.SIGLE.getDataType()),
            DSL.val(null, io.company.team.tables.mdd.Domains.MATRICULEP.getDataType())
        });
    }

    private Listeetudiantscours(Name alias, Table<ListeetudiantscoursRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>imm_professeur.listeetudiantscours</code> table
     * reference
     */
    public Listeetudiantscours(String alias) {
        this(DSL.name(alias), LISTEETUDIANTSCOURS);
    }

    /**
     * Create an aliased <code>imm_professeur.listeetudiantscours</code> table
     * reference
     */
    public Listeetudiantscours(Name alias) {
        this(alias, LISTEETUDIANTSCOURS);
    }

    /**
     * Create a <code>imm_professeur.listeetudiantscours</code> table reference
     */
    public Listeetudiantscours() {
        this(DSL.name("listeetudiantscours"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ImmProfesseur.IMM_PROFESSEUR;
    }

    @Override
    public Listeetudiantscours as(String alias) {
        return new Listeetudiantscours(DSL.name(alias), this, parameters);
    }

    @Override
    public Listeetudiantscours as(Name alias) {
        return new Listeetudiantscours(alias, this, parameters);
    }

    @Override
    public Listeetudiantscours as(Table<?> alias) {
        return new Listeetudiantscours(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Listeetudiantscours rename(String name) {
        return new Listeetudiantscours(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Listeetudiantscours rename(Name name) {
        return new Listeetudiantscours(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Listeetudiantscours rename(Table<?> name) {
        return new Listeetudiantscours(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public Listeetudiantscours call(
          String siglecours
        , String matriculeprofesseur
    ) {
        Listeetudiantscours result = new Listeetudiantscours(DSL.name("listeetudiantscours"), null, new Field[] {
            DSL.val(siglecours, io.company.team.tables.mdd.Domains.SIGLE.getDataType()),
            DSL.val(matriculeprofesseur, io.company.team.tables.mdd.Domains.MATRICULEP.getDataType())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public Listeetudiantscours call(
          Field<String> siglecours
        , Field<String> matriculeprofesseur
    ) {
        Listeetudiantscours result = new Listeetudiantscours(DSL.name("listeetudiantscours"), null, new Field[] {
            siglecours,
            matriculeprofesseur
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
