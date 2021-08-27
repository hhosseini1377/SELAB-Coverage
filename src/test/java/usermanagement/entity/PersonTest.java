package usermanagement.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test_person_default_constructor() {
		Person testClass = new Person();

		testClass.setmName("mName1");
		assertEquals("mName1", testClass.getmName());

		testClass.setfName("fName1");
		assertEquals("fName1", testClass.getfName());

		testClass.setlName("lName1");
		assertEquals("lName1", testClass.getlName());

		testClass.setCompanyName("companyName1");
		assertEquals("companyName1", testClass.getCompanyName());

		testClass.setPersonId(96110056);
		assertEquals(96110056, testClass.getPersonId(), 1e-6);
	}
}
