package com.clinic.clinic.controller;

import com.clinic.clinic.entity.Patient;
import com.clinic.clinic.service.PatientService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/patients/{id}")
    public Patient findPatientById(@PathVariable long id){
        return service.findPatientById(id);
    }
    @PostMapping("/patients")
    public Patient addPatient(@RequestBody Patient p){
        return service.addPatient(p);
    }

    @DeleteMapping("/patients/{id}")
    public String deletePatientById(@PathVariable long id){
        return service.deletePatientById(id);
    }

    @PutMapping("/patients/{id}")
    public Patient changePatientInfo(@PathVariable long id, @RequestBody Patient p){
        return service.changePatientInfo(id,p);
    }

    //setezi un camp daca in cerere nu e null;
    @PatchMapping("/patients/{id}")
    public Patient changePatientField(@PathVariable long id, @RequestBody Patient p){
        return service.changePatientField(id,p);
    }
}
