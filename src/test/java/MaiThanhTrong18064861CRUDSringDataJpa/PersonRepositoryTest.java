package MaiThanhTrong18064861CRUDSringDataJpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MaiThanhTrong18064861CRUDSringDataJpa.entity.Person;
import MaiThanhTrong18064861CRUDSringDataJpa.repository.PersonRepository;

@SpringBootTest
public class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;

	@Test
	public void getAll() {

		System.out.println("getAll: " + personRepository.findAll());
		System.out.println("getListByName: " + personRepository.findByName("Tien"));
	}

	@Test
	public void add() {

		Person person = Person.builder().name("Tien Huynh 123").build();
		System.out.println("Save Person: " + personRepository.save(person));
	}

	@Test
	public void update() {

		Person person = Person.builder().id(1).name("Tien Doi Ten").build();
		System.out.println("Update Person: " + personRepository.save(person));
	}

	@Test
	public void delete() {

		personRepository.deleteById(1);
	}

	
}
