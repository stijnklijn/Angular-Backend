package nl.martijnhiemstra.angular.backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.martijnhiemstra.angular.backend.dto.PersonDto;
import nl.martijnhiemstra.angular.backend.exception.ObjectNotFoundException;
import nl.martijnhiemstra.angular.backend.model.Person;
import nl.martijnhiemstra.angular.backend.service.IPersonService;

@RestController
public class PersonController {

	@Autowired
	private IPersonService iPersonService;

	@GetMapping("/api/person/{id:[0-9]+}")
	public PersonDto findOne(@PathVariable("id") Long id ) {
		Optional<Person> personOpt = this.iPersonService.findOne(id);

		if (personOpt.isPresent())
			return PersonDto.buildFromPerson(personOpt.get());

		throw new ObjectNotFoundException();
	}

}