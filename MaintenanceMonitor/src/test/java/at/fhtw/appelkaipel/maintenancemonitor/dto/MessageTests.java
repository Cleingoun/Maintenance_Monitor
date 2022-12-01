package at.fhtw.appelkaipel.maintenancemonitor.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MessageTests {

    private final Message message = new Message();

    @Test
    void contextLoads() {
    }

    @Test
    void testGettingMessage() {
        assertEquals("Stored Message", message.getMes());
    }

    @Test
    void testSettingMessage() {
        message.setMes("Test");
        assertEquals("Test", message.getMes());
    }

    @Test
    void testReset() {
        message.setMes("Test");
        message.resetMes();
        assertEquals("", message.getMes());
    }
}
