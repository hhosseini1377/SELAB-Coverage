package usermanagement.service;

import org.junit.Test;

import usermanagement.entity.Person;
import static org.junit.Assert.assertEquals;

public class TransformServiceTest {
    @Test
    public void test_toUserDomain() {
        Person person = new Person();

        person.setCompanyName("companyName1");
        person.setPersonId(96110056);
        person.setfName("fName1");
        person.setlName("lName1");

        TransformService service = new TransformService();
        User user = service.toUserDomain(person);

        assertEquals("companyName1", user.getCompanyName());
        assertEquals(96110056, user.getUserId(), 1e-6);
        assertEquals("fName1", user.getFirstName());
        assertEquals("lName1", user.getLastName());
    }

    @Test
    public void test_toUserEntity() {
        User user = new User();
        user.setCompanyName("companyName1");
        user.setFirstName("fName1");
        user.setLastName("lName1");

        TransformService service = new TransformService();
        Person person = service.toUserEntity(user);
        assertEquals("companyName1", person.getCompanyName());
        assertEquals("fName1", person.getfName());
        assertEquals("lName1", person.getlName());
        assertEquals(0, person.getPersonId(), 1e-6);

        user.setUserId(96110056);
        person = service.toUserEntity(user);
        assertEquals(96110056, person.getPersonId(), 1e-6);
    }
}
