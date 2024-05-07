/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.public_.tables;


import io.company.team.tables.public_.Keys;
import io.company.team.tables.public_.Public;
import io.company.team.tables.public_.tables.records.InscriptionRecord;

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
 * La personne étudiante (identifiée par "matriculeE") est inscrite au groupe
 * identifié par le sigle "sigle", le numéro "noGroupe" et le trimestre
 * "trimestre".
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Inscription extends TableImpl<InscriptionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.inscription</code>
     */
    public static final Inscription INSCRIPTION = new Inscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InscriptionRecord> getRecordType() {
        return InscriptionRecord.class;
    }

    /**
     * The column <code>public.inscription.matriculee</code>.
     */
    public final TableField<InscriptionRecord, String> MATRICULEE = createField(DSL.name("matriculee"), io.company.team.tables.mdd.Domains.MATRICULEE.getDataType(), this, "");

    /**
     * The column <code>public.inscription.sigle</code>.
     */
    public final TableField<InscriptionRecord, String> SIGLE = createField(DSL.name("sigle"), io.company.team.tables.mdd.Domains.SIGLE.getDataType(), this, "");

    /**
     * The column <code>public.inscription.trimestre</code>.
     */
    public final TableField<InscriptionRecord, String> TRIMESTRE = createField(DSL.name("trimestre"), io.company.team.tables.mdd.Domains.TRIMESTRE.getDataType(), this, "");

    /**
     * The column <code>public.inscription.nogroupe</code>.
     */
    public final TableField<InscriptionRecord, String> NOGROUPE = createField(DSL.name("nogroupe"), io.company.team.tables.mdd.Domains.NOGROUPE.getDataType(), this, "");

    private Inscription(Name alias, Table<InscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Inscription(Name alias, Table<InscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("La personne étudiante (identifiée par \"matriculeE\") est inscrite au groupe identifié par le sigle \"sigle\", le numéro \"noGroupe\" et le trimestre \"trimestre\"."), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.inscription</code> table reference
     */
    public Inscription(String alias) {
        this(DSL.name(alias), INSCRIPTION);
    }

    /**
     * Create an aliased <code>public.inscription</code> table reference
     */
    public Inscription(Name alias) {
        this(alias, INSCRIPTION);
    }

    /**
     * Create a <code>public.inscription</code> table reference
     */
    public Inscription() {
        this(DSL.name("inscription"), null);
    }

    public <O extends Record> Inscription(Table<O> child, ForeignKey<O, InscriptionRecord> key) {
        super(child, key, INSCRIPTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<InscriptionRecord> getPrimaryKey() {
        return Keys.INSCRIPTION_CC0;
    }

    @Override
    public Inscription as(String alias) {
        return new Inscription(DSL.name(alias), this);
    }

    @Override
    public Inscription as(Name alias) {
        return new Inscription(alias, this);
    }

    @Override
    public Inscription as(Table<?> alias) {
        return new Inscription(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Inscription rename(String name) {
        return new Inscription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Inscription rename(Name name) {
        return new Inscription(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Inscription rename(Table<?> name) {
        return new Inscription(name.getQualifiedName(), null);
    }
}