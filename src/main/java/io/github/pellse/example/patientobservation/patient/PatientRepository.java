package io.github.pellse.example.patientobservation.patient;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface PatientRepository extends R2dbcRepository<Patient, Integer> {

    Flux<Patient> findAllByHealthCardNumberIn(List<String> healthCardNumbers);
}
