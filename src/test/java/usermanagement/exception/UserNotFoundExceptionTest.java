package usermanagement.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserNotFoundExceptionTest {
    @Test
    public void test_exception_create()
    {
        UserNotFoundException eTest = new UserNotFoundException("msg", 96110056);

        assertEquals("msg", eTest.getMessage());
        assertEquals(96110056, eTest.getUserId(), 1e-6);
    }
}
