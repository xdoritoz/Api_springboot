package com.example.consultoriomedico.repository;

import com.example.consultoriomedico.Entities.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}
