package nl.martijnhiemstra.angular.backend.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.martijnhiemstra.angular.backend.dao.IPersonDAO;
import nl.martijnhiemstra.angular.backend.model.Person;

@Service
@Transactional
public class PersonService implements IPersonService {

	@Autowired
	private IPersonDAO iPersonDAO;

	@Override
	public Optional<Person> findOne(Long id) {
		return Optional.ofNullable(iPersonDAO.findOne(id));
	}

	@Override
	public List<Person> findAll() {
		return this.iPersonDAO.findAll();
	}

	@Override
	public Person create(Person person) {
		return this.iPersonDAO.save(person);
	}

	@Override
	public void update(Person person) {
		this.iPersonDAO.save(person);
	}

	@Override
	public void delete(Person person) {
		this.iPersonDAO.delete(person);
	}

}