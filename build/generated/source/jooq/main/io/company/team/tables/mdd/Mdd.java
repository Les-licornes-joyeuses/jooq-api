/*
 * This file is generated by jOOQ.
 */
package io.company.team.tables.mdd;


import io.company.team.tables.DefaultCatalog;
import io.company.team.tables.mdd.tables.Affectation;
import io.company.team.tables.mdd.tables.Competence;
import io.company.team.tables.mdd.tables.Cours;
import io.company.team.tables.mdd.tables.Disponibilite;
import io.company.team.tables.mdd.tables.Etudiant;
import io.company.team.tables.mdd.tables.Evaluation;
import io.company.team.tables.mdd.tables.Groupe;
import io.company.team.tables.mdd.tables.Inscription;
import io.company.team.tables.mdd.tables.Offre;
import io.company.team.tables.mdd.tables.Prealable;
import io.company.team.tables.mdd.tables.Professeur;
import io.company.team.tables.mdd.tables.ProfesseurBureauAbs;
import io.company.team.tables.mdd.tables.ProfesseurBureauPre;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Domain;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mdd extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>MDD</code>
     */
    public static final Mdd MDD = new Mdd();

    /**
     * La personne enseignante (identifiée par "matriculeP") assure la formation
     * du groupe identifié par les  sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre". 
     */
    public final Affectation AFFECTATION = Affectation.AFFECTATION;

    /**
     * La personne enseignante (identifiée par "matriculeP") a la compétence
     * requise pour assure le cours (identifié par le sigle "sigle"). 
     */
    public final Competence COMPETENCE = Competence.COMPETENCE;

    /**
     * Le cours (identifié par le sigle "sigle") est défini dans le répertoire
     * des cours offerts par l’Université. Il a pour titre "titre". Il comporte
     * "credit" crédit(s). 
     */
    public final Cours COURS = Cours.COURS;

    /**
     * La personne enseignante (identifiée par "matriculeP") est disponible pour
     * enseigner durant le trimestre "trimestre". 
     */
    public final Disponibilite DISPONIBILITE = Disponibilite.DISPONIBILITE;

    /**
     * La personne étudiante (identifiée par le matricule "matriculeE") possède
     * un dossier à l’Université. Son nom est "nom". Sa date de naissance est
     * "ddn". 
     */
    public final Etudiant ETUDIANT = Etudiant.ETUDIANT;

    /**
     * La personne étudiante (identifiée par "matriculeE") inscrite au groupe
     * identifié par sigle "sigle", le numéro "noGroupe" et le trimestre
     * "trimestre" a obtenu la note "note". 
     */
    public final Evaluation EVALUATION = Evaluation.EVALUATION;

    /**
     * Le groupe (identifié par le sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre") est constitué. 
     */
    public final Groupe GROUPE = Groupe.GROUPE;

    /**
     * La personne étudiante (identifiée par "matriculeE") est inscrite au
     * groupe identifié par le sigle "sigle", le numéro "noGroupe" et le
     * trimestre "trimestre".
     */
    public final Inscription INSCRIPTION = Inscription.INSCRIPTION;

    /**
     * l’Université s’engage à offrir le cours "sigle" au trimestre
     * "trimestre". 
     */
    public final Offre OFFRE = Offre.OFFRE;

    /**
     * L’inscription au cours "sigle" n’est autorisée qu’aux personnes qui
     * auront réussi le cours "siglePréalable" avant le début du cours "sigle". 
     */
    public final Prealable PREALABLE = Prealable.PREALABLE;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP")
     * possède un dossier à l’Université. Une personne enseignante est une
     * professeure, un professeur, une chargée de cours ou un chargé de cours.
     * Son nom est "nom". 
     */
    public final Professeur PROFESSEUR = Professeur.PROFESSEUR;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP") n’a
     * pas de bureau pour la raison "cause". 
     */
    public final ProfesseurBureauAbs PROFESSEUR_BUREAU_ABS = ProfesseurBureauAbs.PROFESSEUR_BUREAU_ABS;

    /**
     * La personne enseignante (identifiée par le matricule "matriculeP") a un
     * bureau et ce bureau est le "bureau". 
     */
    public final ProfesseurBureauPre PROFESSEUR_BUREAU_PRE = ProfesseurBureauPre.PROFESSEUR_BUREAU_PRE;

    /**
     * No further instances allowed
     */
    private Mdd() {
        super("MDD", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Domain<?>> getDomains() {
        return Arrays.asList(
            Domains.BUREAU,
            Domains.CAUSE,
            Domains.CDC,
            Domains.MATRICULEE,
            Domains.MATRICULEP,
            Domains.NOGROUPE,
            Domains.NOM,
            Domains.NOTE,
            Domains.SIGLE,
            Domains.TITRE,
            Domains.TRIMESTRE
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Affectation.AFFECTATION,
            Competence.COMPETENCE,
            Cours.COURS,
            Disponibilite.DISPONIBILITE,
            Etudiant.ETUDIANT,
            Evaluation.EVALUATION,
            Groupe.GROUPE,
            Inscription.INSCRIPTION,
            Offre.OFFRE,
            Prealable.PREALABLE,
            Professeur.PROFESSEUR,
            ProfesseurBureauAbs.PROFESSEUR_BUREAU_ABS,
            ProfesseurBureauPre.PROFESSEUR_BUREAU_PRE
        );
    }
}
