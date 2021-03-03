package pl.kurs.java.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kurs.java.model.Person;
import pl.kurs.java.model.request.RequestPeerson;
import pl.kurs.java.repository.PersonRepository;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;
    /**
     * test
     */
    @GetMapping("/add")
    public ResponseEntity<Person> add(@ModelAttribute RequestPeerson request){
        Person person = Person.builder().name(request.getName()).lastName(request.getLastName()).pesel(request.getPesel()).build();
        personRepository.saveAndFlush(person);

        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

}
