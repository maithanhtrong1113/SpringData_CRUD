package MaiThanhTrong18064861CRUDSringDataJpa.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import MaiThanhTrong18064861CRUDSringDataJpa.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	@Query(value = "select * from person", nativeQuery = true)
	List<Person> getAll();
	
	@Query(value = "select * from person where name = ?1", nativeQuery = true)
	List<Person> getListByName(String name);
	
	@Transactional
	@Modifying
	@Query(value = "insert into person(name) values(?1)", nativeQuery = true)
	void addPerson(String name);
	
	@Transactional
	@Modifying
	@Query(value = "update person set name = ?2 where id = ?1", nativeQuery = true)
	void updatePerson(Integer id, String name);
	
	@Transactional
	@Modifying
	@Query(value = "delete from person where id = ?1", nativeQuery = true)
	void deletePersonById(Integer id);
}
