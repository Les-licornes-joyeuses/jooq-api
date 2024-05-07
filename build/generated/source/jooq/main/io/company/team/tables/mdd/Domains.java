/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd;


import org.jooq.Domain;
import org.jooq.Schema;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.LazySchema;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all Domains in MDD.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains {

    /**
     * The domain <code>MDD.bureau</code>.
     */
    public static final Domain<String> BUREAU = Internal.createDomain(
          schema()
        , DSL.name("bureau")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".bureau_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.cause</code>.
     */
    public static final Domain<String> CAUSE = Internal.createDomain(
          schema()
        , DSL.name("cause")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".cause_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.cdc</code>.
     */
    public static final Domain<Short> CDC = Internal.createDomain(
          schema()
        , DSL.name("cdc")
        , SQLDataType.SMALLINT
        , Internal.createCheck(null, null, "CHECK (\"MDD\".cdc_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.matriculee</code>.
     */
    public static final Domain<String> MATRICULEE = Internal.createDomain(
          schema()
        , DSL.name("matriculee")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".matriculee_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.matriculep</code>.
     */
    public static final Domain<String> MATRICULEP = Internal.createDomain(
          schema()
        , DSL.name("matriculep")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".matriculep_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.nogroupe</code>.
     */
    public static final Domain<String> NOGROUPE = Internal.createDomain(
          schema()
        , DSL.name("nogroupe")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".nogroupe_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.nom</code>.
     */
    public static final Domain<String> NOM = Internal.createDomain(
          schema()
        , DSL.name("nom")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".nom_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.note</code>.
     */
    public static final Domain<Short> NOTE = Internal.createDomain(
          schema()
        , DSL.name("note")
        , SQLDataType.SMALLINT
        , Internal.createCheck(null, null, "CHECK (\"MDD\".note_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.sigle</code>.
     */
    public static final Domain<String> SIGLE = Internal.createDomain(
          schema()
        , DSL.name("sigle")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".sigle_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.titre</code>.
     */
    public static final Domain<String> TITRE = Internal.createDomain(
          schema()
        , DSL.name("titre")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".titre_dom(VALUE))")
    );

    /**
     * The domain <code>MDD.trimestre</code>.
     */
    public static final Domain<String> TRIMESTRE = Internal.createDomain(
          schema()
        , DSL.name("trimestre")
        , SQLDataType.CLOB
        , Internal.createCheck(null, null, "CHECK (\"MDD\".trimestre_dom(VALUE))")
    );

    private static final Schema schema() {
        return new LazySchema(DSL.name("MDD"), DSL.comment(""), () -> Mdd.MDD);
    }
}