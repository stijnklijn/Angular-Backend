package nl.martijnhiemstra.angular.backend.dto;

import nl.martijnhiemstra.angular.backend.model.Person;

public class PersonDto {

	private Long id;

	private String name;

	private int age;
	
	public PersonDto() {
		
	}
	
	public PersonDto(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static final PersonDto buildFromPerson(Person person) {
		return new PersonDto(person.getId(), person.getFirstName() + " " + person.getLastName(), person.getAge());
	}

}