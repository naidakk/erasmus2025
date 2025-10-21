//PersonDao = Person Data Access Object
//It's the interface between your application and the database. It allows you to:
//
//        Save people to the database
//        Find people in the database
//        Update people
//        Delete people
package si.um.feri.qa.people.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import si.um.feri.qa.people.vao.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, String> {
}
//This is the magic of Spring Data JPA!
//Even though the interface is empty, Spring automatically implements it for you at runtime with all these methods:


//data access object