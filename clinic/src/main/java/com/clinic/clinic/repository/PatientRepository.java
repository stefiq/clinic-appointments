package com.clinic.clinic.repository;

import com.clinic.clinic.entity.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientRepository {
    private List<Patient> listPatients;

    public List<Patient> getListPatients() {
        return this.listPatients;
    }

    public void addPatient(Patient p){
        listPatients.add(p);
    }
}
