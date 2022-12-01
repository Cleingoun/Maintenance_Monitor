package at.fhtw.appelkaipel.maintenancemonitor.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MaintenanceMonitorServiceTests {
    private final MaintenanceMonitorService monitorService = new MaintenanceMonitorService();

    @Test
    void contextLoads() {
    }

    @Test
    void testGettingMessage() {
        assertEquals("Stored Message", monitorService.getMessage());
    }

    @Test
    void testSettingMessage() {
        monitorService.setMessage("Test");
        assertEquals("Test", monitorService.getMessage());
    }

    @Test
    void testReset() {
        monitorService.setMessage("Test");
        monitorService.resetMessage();
        assertEquals("", monitorService.getMessage());
    }
}
