package MaiThanhTrong18064861CRUDSringDataJpa.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import MaiThanhTrong18064861CRUDSringDataJpa.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	@Query("select p from Person p")
	List<Person> getAll();

	@Query("select p from Person p where p.name = ?1")
	List<Person> getListByName(String name);

	@Transactional
	@Modifying
	@Query(value = "insert into person(name) values(?1)", nativeQuery = true)
	void addPerson(String name);

	@Transactional
	@Modifying
	@Query(value = "update Person p set p.name = ?2 where p.id = ?1")
	void updatePerson(Integer id, String name);

	@Transactional
	@Modifying
	@Query("delete from Person p where p.id = ?1")
	void deletePersonById(Integer id);
}
