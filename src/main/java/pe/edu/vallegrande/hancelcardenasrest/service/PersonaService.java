package pe.edu.vallegrande.hancelcardenasrest.service;

import pe.edu.vallegrande.hancelcardenasrest.model.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaService {

    Flux<Persona> findAll();

    Mono<Persona> findById(Long id);

    Mono<Persona> create(Persona persona);

    Mono<Persona> update(Long id, Persona persona);

    Mono<Void> deleteById(Long id);

}
