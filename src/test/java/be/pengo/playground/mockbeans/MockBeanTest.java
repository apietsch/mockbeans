package be.pengo.playground.mockbeans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootTest
public class MockBeanTest {

    @MockBean
    private ExampleService exampleService;

    @Autowired
    UserOfService userOfService;

    @Test
    void testOfUserService() {
        BDDMockito.given(exampleService.createExample()).willReturn("Hello");
        String actual = this.userOfService.useExampleService();    
        assertEquals("Hello", actual);
    }

    @Configuration
    @Import(UserOfService.class)  // Import the UserOfService bean into the Spring context for this test
    static class Config {
    }
}
