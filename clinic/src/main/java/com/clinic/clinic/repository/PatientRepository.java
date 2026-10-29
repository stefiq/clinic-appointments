package com.clinic.clinic.repository;

import com.clinic.clinic.entity.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepository {
    private List<Patient> listPatients = new ArrayList<>();

    public List<Patient> getListPatients() {
        return this.listPatients;
    }

    public void addPatient(Patient p){
        listPatients.add(p);
    }

    public void deletePatient(Patient p){
        listPatients.remove(p);
    }
}
