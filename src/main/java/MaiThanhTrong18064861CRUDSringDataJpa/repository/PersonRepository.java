package MaiThanhTrong18064861CRUDSringDataJpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import MaiThanhTrong18064861CRUDSringDataJpa.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
}
