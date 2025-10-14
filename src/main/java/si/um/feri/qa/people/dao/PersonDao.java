package si.um.feri.qa.people.dao;

import org.springframework.data.repository.CrudRepository;
import si.um.feri.qa.people.vao.Person;

public interface PersonDao extends CrudRepository<Person, String> {
}
