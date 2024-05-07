/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd.tables;


import io.company.team.tables.mdd.Keys;
import io.company.team.tables.mdd.Mdd;
import io.company.team.tables.mdd.tables.records.EvaluationRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * La personne étudiante (identifiée par "matriculeE") inscrite au groupe
 * identifié par sigle "sigle", le numéro "noGroupe" et le trimestre "trimestre"
 * a obtenu la note "note". 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Evaluation extends TableImpl<EvaluationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>MDD.evaluation</code>
     */
    public static final Evaluation EVALUATION = new Evaluation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EvaluationRecord> getRecordType() {
        return EvaluationRecord.class;
    }

    /**
     * The column <code>MDD.evaluation.matriculee</code>.
     */
    public final TableField<EvaluationRecord, String> MATRICULEE = createField(DSL.name("matriculee"), io.company.team.tables.mdd.Domains.MATRICULEE.getDataType(), this, "");

    /**
     * The column <code>MDD.evaluation.sigle</code>.
     */
    public final TableField<EvaluationRecord, String> SIGLE = createField(DSL.name("sigle"), io.company.team.tables.mdd.Domains.SIGLE.getDataType(), this, "");

    /**
     * The column <code>MDD.evaluation.trimestre</code>.
     */
    public final TableField<EvaluationRecord, String> TRIMESTRE = createField(DSL.name("trimestre"), io.company.team.tables.mdd.Domains.TRIMESTRE.getDataType(), this, "");

    /**
     * The column <code>MDD.evaluation.nogroupe</code>.
     */
    public final TableField<EvaluationRecord, String> NOGROUPE = createField(DSL.name("nogroupe"), io.company.team.tables.mdd.Domains.NOGROUPE.getDataType(), this, "");

    /**
     * The column <code>MDD.evaluation.note</code>.
     */
    public final TableField<EvaluationRecord, Short> NOTE = createField(DSL.name("note"), io.company.team.tables.mdd.Domains.NOTE.getDataType(), this, "");

    private Evaluation(Name alias, Table<EvaluationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Evaluation(Name alias, Table<EvaluationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("La personne étudiante (identifiée par \"matriculeE\") inscrite au groupe identifié par sigle \"sigle\", le numéro \"noGroupe\" et le trimestre \"trimestre\" a obtenu la note \"note\". "), TableOptions.table());
    }

    /**
     * Create an aliased <code>MDD.evaluation</code> table reference
     */
    public Evaluation(String alias) {
        this(DSL.name(alias), EVALUATION);
    }

    /**
     * Create an aliased <code>MDD.evaluation</code> table reference
     */
    public Evaluation(Name alias) {
        this(alias, EVALUATION);
    }

    /**
     * Create a <code>MDD.evaluation</code> table reference
     */
    public Evaluation() {
        this(DSL.name("evaluation"), null);
    }

    public <O extends Record> Evaluation(Table<O> child, ForeignKey<O, EvaluationRecord> key) {
        super(child, key, EVALUATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mdd.MDD;
    }

    @Override
    public UniqueKey<EvaluationRecord> getPrimaryKey() {
        return Keys.EVALUATION_CC0;
    }

    @Override
    public List<ForeignKey<EvaluationRecord, ?>> getReferences() {
        return Arrays.asList(Keys.EVALUATION__EVALUATION_CR0);
    }

    private transient Inscription _inscription;

    /**
     * Get the implicit join path to the <code>MDD.inscription</code> table.
     */
    public Inscription inscription() {
        if (_inscription == null)
            _inscription = new Inscription(this, Keys.EVALUATION__EVALUATION_CR0);

        return _inscription;
    }

    @Override
    public Evaluation as(String alias) {
        return new Evaluation(DSL.name(alias), this);
    }

    @Override
    public Evaluation as(Name alias) {
        return new Evaluation(alias, this);
    }

    @Override
    public Evaluation as(Table<?> alias) {
        return new Evaluation(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Evaluation rename(String name) {
        return new Evaluation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Evaluation rename(Name name) {
        return new Evaluation(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Evaluation rename(Table<?> name) {
        return new Evaluation(name.getQualifiedName(), null);
    }
}
