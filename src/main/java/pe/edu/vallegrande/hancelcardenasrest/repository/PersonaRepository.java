package pe.edu.vallegrande.hancelcardenasrest.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.hancelcardenasrest.model.Persona;

public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {
}
