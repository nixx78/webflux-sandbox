package lv.nixx.poc.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Flux<PersonDTO> getAllUsers() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Mono<PersonDTO> getUserById(@PathVariable Long id) {
        return Mono.just(personService.getById(id));
    }

}
