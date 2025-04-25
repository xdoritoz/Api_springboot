package com.example.consultoriomedico.repository;

import com.example.consultoriomedico.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
