package nl.martijnhiemstra.angular.backend.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.martijnhiemstra.angular.backend.model.Person;

public interface IPersonDAO extends CrudRepository<Person, Long>{

	List<Person> findAll();

}