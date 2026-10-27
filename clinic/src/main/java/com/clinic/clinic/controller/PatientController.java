package com.clinic.clinic.controller;

import com.clinic.clinic.entity.Patient;
import com.clinic.clinic.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService s){
        this.service = s;
    }

    @GetMapping("/patients")
    public List<Patient> seeAllPatients() {
        return service.seeAllPatients();
    }

    @PostMapping("/patients")
    public Patient addPatient(@RequestBody Patient p){
        return service.addPatient(p);
    }

}
