package pl.kurs.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kurs.java.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
