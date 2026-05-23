package pe.edu.vallegrande.hancelcardenasrest.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.hancelcardenasrest.model.Persona;
import pe.edu.vallegrande.hancelcardenasrest.service.PersonaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/personas")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PersonaRest {

    private final PersonaService service;

    @GetMapping
    public Flux<Persona> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Persona> getByID(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Persona> create(@RequestBody Persona persona) {
        return service.create(persona);
    }

    @PutMapping("/{id}")
    public Mono<Persona> update(@PathVariable Long id, @RequestBody Persona persona) {
        return service.update(id, persona);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@PathVariable Long id) { // Cambiado a Mono<Void>
        return service.deleteById(id);
    }
}
