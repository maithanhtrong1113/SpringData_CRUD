package MaiThanhTrong18064861CRUDSringDataJpa.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import MaiThanhTrong18064861CRUDSringDataJpa.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	List<Person> findByName(String name);
}
