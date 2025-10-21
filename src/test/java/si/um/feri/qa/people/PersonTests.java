package si.um.feri.qa.people;

import jakarta.validation.constraints.AssertFalse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import si.um.feri.qa.people.dao.PersonDao;
import si.um.feri.qa.people.vao.Person;

public class PersonTests {

    @Test
    public void testRelatedMethod() {
        Assertions.assertFalse(
            new Person("","Jackson","").isRelatedTo(new Person("","Clinton",""))
        );
        Assertions.assertFalse(
            new Person("",null,"").isRelatedTo(new Person("","Novak",""))
        );
        Assertions.assertTrue(
            new Person("","Novak","").isRelatedTo(new Person("","NOVAK",""))
        );
        Assertions.assertFalse(
            new Person("",null,"").isRelatedTo(new Person("",null,""))
        );
        Assertions.assertFalse(
            new Person("","123","").isRelatedTo(new Person("","456",""))
        );
        Assertions.assertFalse(
            new Person("","123","").isRelatedTo(new Person("","123",""))
        );
        Assertions.assertTrue(
            new Person("","Pavlič","").isRelatedTo(new Person("","PAVLIČ",""))
        );

        Assertions.assertFalse(
                new Person("","Kaljanac", "" ).isRelatedTo(new Person("", "Kaljanać", ""))
        );
    }


}
