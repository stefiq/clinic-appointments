package com.clinic.clinic.service;

import com.clinic.clinic.entity.Patient;
import com.clinic.clinic.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository repo;

    public PatientService(PatientRepository repo){
        this.repo = repo;
    }

    public List<Patient> seeAllPatients(){
        return repo.getListPatients();
    }

    public Patient addPatient(Patient p){
        repo.addPatient(p);
        return p;
    }
}
