package MaiThanhTrong18064861CRUDSringDataJpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MaiThanhTrong18064861CRUDSringDataJpa.repository.PersonRepository;

@SpringBootTest
public class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;
	
	@Test
	public void getAll() {

		System.out.println("getAll: " + personRepository.getAll());
		System.out.println("getListByName: " + personRepository.getListByName("Trong"));
	}

	@Test
	public void add() {

		personRepository.addPerson("Trong123");
	}

	@Test
	public void update() {

		personRepository.updatePerson(1, "Trongasd");
	}

	@Test
	public void delete() {

		personRepository.deletePersonById(1);
	}
}
