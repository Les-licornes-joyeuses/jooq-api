package com.tp1.tp1.controller;

//import io.company.team.tables.Routines;
//import io.company.team.tables.tables.records.OffrePlanNonCouverteRecord;
import com.tp1.tp1.model.*;
import io.company.team.tables.imm_base.ImmBase;
import io.company.team.tables.imm_base.Routines;
import io.company.team.tables.imm_base.tables.Getallstudents;
import io.company.team.tables.imm_base.tables.records.GetallprofRecord;
import io.company.team.tables.imm_base.tables.records.GetallstudentsRecord;
import io.company.team.tables.imm_base.tables.records.OffrePlanNonCouverteRecord;
import io.company.team.tables.imm_etudiant.ImmEtudiant;
import io.company.team.tables.imm_etudiant.tables.Getcoursinscrits;
import io.company.team.tables.imm_etudiant.tables.records.GetcoursinscritsRecord;
import io.company.team.tables.imm_etudiant.tables.records.GetmembregroupeRecord;
import io.company.team.tables.mdd.Mdd;
import io.company.team.tables.mdd.tables.Cours;
import io.company.team.tables.mdd.tables.records.CoursRecord;
import org.jooq.Configuration;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

    final Configuration configuration;

    @Autowired
    public AdminController(Configuration configuration) {
        this.configuration = configuration;
    }



    @PostMapping("add-cours")
    public ResponseEntity<?> addCourse(@RequestBody CoursDto coursRecord) {
        try {

            Routines.addcours(configuration, coursRecord.sigle(), coursRecord.titre(), coursRecord.credit());
            return ResponseEntity.ok(200);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("add-student")
    public ResponseEntity<?> addStudent(@RequestBody EtudinatDto studentDto) {
        try {

            Routines.addetudiant(configuration, studentDto.matriculee(), studentDto.nom(), studentDto.ddn());
            return ResponseEntity.ok(200);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("add-professeur")
    public ResponseEntity<?> addProfesseur(@RequestBody ProfesseurDto professeurDto) {
        try {

            Routines.addprofesseur(configuration, professeurDto.matriculeep(), professeurDto.nom());
            return ResponseEntity.ok(200);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("add-affectation")
    public ResponseEntity<?> addAffectation(@RequestBody AffectationDto affectationDto) {
        try {
            Routines.ajouteraffectation(configuration, affectationDto.sigle(), affectationDto.trimestre(), affectationDto.nogroupe(), affectationDto.matriculep());
            return ResponseEntity.ok(200);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("add-inscription-student-groupe")
    public ResponseEntity<?> addInscriptionStudentGroupe(@RequestBody AjouterInscriptionGroupeDto ajouterInscriptionGroupeDto) {

        try {
            Routines.ajouterinscriptionetudiantgroupe(
                    configuration,
                    ajouterInscriptionGroupeDto.matriculee(),
                    ajouterInscriptionGroupeDto.sigle(),
                    ajouterInscriptionGroupeDto.trimestre(),
                    ajouterInscriptionGroupeDto.nogroupe()
            );
            return ResponseEntity.ok(200);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("add-groupe")
    public ResponseEntity<?> addGroupe(@RequestBody GroupeDto groupeDto) {

        try {
            Routines.ajoutergroupe(configuration, groupeDto.sigle(), groupeDto.trimestre(), groupeDto.nogroupe());
            return ResponseEntity.ok(200);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("get-cour-inscrits/{matriculee}")
    public ResponseEntity<?> getCourInscrits(@PathVariable String matriculee) { //
        ArrayList<GetCoursInscritDto> resultDto = new ArrayList<>();
        try {
            Result<GetcoursinscritsRecord> result = DSL.using(configuration)
                    .selectFrom(ImmEtudiant.GETCOURSINSCRITS(matriculee))
                    .fetch();

            result.forEach(getcoursinscritsRecord -> resultDto.add(new GetCoursInscritDto(getcoursinscritsRecord.getSigle(), getcoursinscritsRecord.getTitre(), getcoursinscritsRecord.getMatriculep(), getcoursinscritsRecord.getNom())));


            return ResponseEntity.ok(resultDto);


        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        // Inscription

    }

    @GetMapping("get-membre-groupe/{matriculee}")
    public ResponseEntity<?> getMembreGroupe(@PathVariable String matriculee) {
        try {
            ArrayList<GetMembreGroupeDto> resultDto = new ArrayList<>();

            Result<GetmembregroupeRecord> result = DSL.using(configuration)
                    .selectFrom(ImmEtudiant.GETMEMBREGROUPE(matriculee)).fetch();

            result.forEach(r -> resultDto.add(new GetMembreGroupeDto(r.getNom())));
            return ResponseEntity.ok(resultDto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }


    }
    @GetMapping("get-student")
    public ResponseEntity<?> getAllStudent(){
        try{
            final ArrayList<EtudinatDto> resultDto = new ArrayList<>();
            Result<GetallstudentsRecord> result = DSL.using(configuration)
                    .selectFrom(ImmBase.GETALLSTUDENTS()).fetch();

            result.forEach(r -> resultDto.add(new EtudinatDto(r.getMatriculee(), r.getNom(), r.getDdn())));
            return ResponseEntity.ok(resultDto);

        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("get-prof")
    public ResponseEntity<?> getAllProf(){
        try{
            final ArrayList<ProfesseurDto> resultDto = new ArrayList<>();
            Result<GetallprofRecord> result = DSL.using(configuration)
                    .selectFrom(ImmBase.GETALLPROF()).fetch();

            result.forEach(r -> resultDto.add(new ProfesseurDto(r.getMatriculep(), r.getNom())));
            return ResponseEntity.ok(resultDto);

        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

//@GetMapping("get-cours/{sigle}")
//public ResponseEntity<?> getAllStudent(){
//
//}
//
//
//}
