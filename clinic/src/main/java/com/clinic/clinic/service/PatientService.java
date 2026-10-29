package com.clinic.clinic.service;

import com.clinic.clinic.entity.Patient;
import com.clinic.clinic.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
  private final PatientRepository repo;

  public PatientService(PatientRepository repo) {
    this.repo = repo;
  }

  public List<Patient> seeAllPatients() {
    return repo.getListPatients();
  }

  public Patient addPatient(Patient p) {
    repo.addPatient(p);
    return p;
  }

  public Patient findPatientById(long id) throws RuntimeException{
    for (Patient p : repo.getListPatients()) {
      if (p.getId() == id) {
        return p;
      }
    }
    throw new RuntimeException("Patient not found");
  }

  public String deletePatientById(long id){
    for(Patient p:repo.getListPatients()){
      if(p.getId() == id){
        repo.deletePatient(p);
        return "Pacient deleted succesfully.";

      }
    }
    return "The pacient with the id " + id + " doesn't exist!";
  }

  public Patient changePatientInfo(long id,Patient p) throws RuntimeException{
    for(Patient pat : repo.getListPatients()){
      if(pat.getId() == id){
        pat.setCnp(p.getCnp());
        pat.setEmail(p.getEmail());
        pat.setBirthDate(p.getBirthDate());
        pat.setPhoneNumber(p.getPhoneNumber());
        pat.setFirstName(p.getFirstName());
        pat.setLastName(p.getLastName());
        return pat;
      }
    }
    throw new RuntimeException("The Patient with id "+ id + " doesn't exists!");
  }

  public Patient changePatientField(long id, Patient p) throws RuntimeException{
    for(Patient pat : repo.getListPatients()){
      if(pat.getId() == id){
        //daca campul nu e null in inlocuiesc, altfel o las asa;
        if (p.getFirstName() != null) {
          pat.setFirstName(p.getFirstName());
        }
        if (p.getLastName() != null) {
          pat.setLastName(p.getLastName());
        }
        if (p.getPhoneNumber() != null) {
          pat.setPhoneNumber(p.getPhoneNumber());
        }
        if (p.getCnp() != null) {
          pat.setCnp(p.getCnp());
        }
        if (p.getEmail() != null) {
          pat.setEmail(p.getEmail());
        }
        if (p.getBirthDate() != null) {
          pat.setBirthDate(p.getBirthDate());
        }
        return pat;
      }
    }

    throw new RuntimeException("The Patient with id " + id +" doesn't exist!");
  }
}
