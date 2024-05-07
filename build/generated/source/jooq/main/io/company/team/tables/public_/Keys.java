/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.public_;


import io.company.team.tables.public_.tables.Inscription;
import io.company.team.tables.public_.tables.records.InscriptionRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<InscriptionRecord> INSCRIPTION_CC0 = Internal.createUniqueKey(Inscription.INSCRIPTION, DSL.name("inscription_cc0"), new TableField[] { Inscription.INSCRIPTION.SIGLE, Inscription.INSCRIPTION.TRIMESTRE, Inscription.INSCRIPTION.NOGROUPE, Inscription.INSCRIPTION.MATRICULEE }, true);
}