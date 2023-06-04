package io.github.pellse.example.patientobservation.patient;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Flux<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    public Flux<Patient> findPatientsByHealthCardNumber(List<String> healthCardNumbers) {
        return patientRepository.findAllByHealthCardNumberIn(healthCardNumbers);
    }
}
