package com.tp1.tp1.controller;

import io.company.team.tables.Routines;
import io.company.team.tables.tables.records.OffrePlanNonCouverteRecord;
import org.jooq.Configuration;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    final Configuration configuration;

    @Autowired
    public AdminController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/")
    public Result<OffrePlanNonCouverteRecord> perform(){

       return  Routines.offrePlanNonCouverte(configuration);





    }
}
