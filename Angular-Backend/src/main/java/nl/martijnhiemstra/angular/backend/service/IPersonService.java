package nl.martijnhiemstra.angular.backend.service;

import java.util.List;
import java.util.Optional;

import nl.martijnhiemstra.angular.backend.model.Person;

public interface IPersonService {

	Optional<Person> findOne( Long id );

	List<Person> findAll();

	Person create(Person person);

	void update(Person person);

	void delete(Person person);

}