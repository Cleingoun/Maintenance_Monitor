package at.fhtw.appelkaipel.maintenancemonitor.controller;

import at.fhtw.appelkaipel.maintenancemonitor.service.MaintenanceMonitorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceMonitorControllerTests {
    private final MaintenanceMonitorService monitorService = new MaintenanceMonitorService();
    private final MaintenanceMonitorController controller = new MaintenanceMonitorController(monitorService);

    @Test
    void contextLoads() {
    }

    @Test
    void testHome() {
        assertEquals("home", controller.home());
    }

}

