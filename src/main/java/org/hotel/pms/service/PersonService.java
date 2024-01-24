package org.hotel.pms.service;

import lombok.AllArgsConstructor;
import org.hotel.pms.model.Person;
import org.hotel.pms.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    @Transactional(readOnly = true)
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Transactional
    public Person updatePerson(Long id, Person updatedPerson) {
        return personRepository.findById(id)
                .map(person -> {
                    person.setName(updatedPerson.getName());
                    person.setPhoneNumber(updatedPerson.getPhoneNumber());
                    person.setDateOfBirth(updatedPerson.getDateOfBirth());
                    person.setAddresses(updatedPerson.getAddresses());
                    return personRepository.save(person);
                })
                .orElseThrow(() -> new RuntimeException("Person not found with id " + id));
    }

    @Transactional
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}