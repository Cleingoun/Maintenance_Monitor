package at.fhtw.appelkaipel.maintenancemonitor.controller;

import at.fhtw.appelkaipel.maintenancemonitor.service.MaintenanceMonitorService;
import org.springframework.stereotype.Controller;

@Controller
public class MaintenanceMonitorController {

    private final MaintenanceMonitorService monitorService;

    public MaintenanceMonitorController(MaintenanceMonitorService monitorService) {
        this.monitorService = monitorService;
    }

}




