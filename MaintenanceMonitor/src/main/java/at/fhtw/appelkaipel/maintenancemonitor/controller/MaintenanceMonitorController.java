package at.fhtw.appelkaipel.maintenancemonitor.controller;

import at.fhtw.appelkaipel.maintenancemonitor.service.MaintenanceMonitorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MaintenanceMonitorController {

    private final MaintenanceMonitorService monitorService;

    public MaintenanceMonitorController(MaintenanceMonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/message")
    String getMes(Model model) {
        String message = monitorService.getMessage();
        model.addAttribute("message", message);

        return "mes";
    }

    @GetMapping("/message/{message}")
    String setMes(@PathVariable String message) {
        if (!message.equals("reset")){
            monitorService.setMessage(message);
        }else{
            monitorService.resetMessage();
        }
        return monitorService.getMessage();
    }

}