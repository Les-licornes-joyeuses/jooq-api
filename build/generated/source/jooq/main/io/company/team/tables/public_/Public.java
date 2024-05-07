/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.public_;


import io.company.team.tables.DefaultCatalog;
import io.company.team.tables.public_.tables.Inscription;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * La personne étudiante (identifiée par "matriculeE") est inscrite au
     * groupe identifié par le sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre".
     */
    public final Inscription INSCRIPTION = Inscription.INSCRIPTION;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Inscription.INSCRIPTION
        );
    }
}
