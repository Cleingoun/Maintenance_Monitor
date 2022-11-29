package at.fhtw.appelkaipel.maintenancemonitor.service;

import at.fhtw.appelkaipel.maintenancemonitor.dto.Message;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceMonitorService {
    private final Message message = new Message();

    public void resetMessage() {
        message.resetMes();
    }

    public String getMessage() {
        return message.getMes();
    }

    public void setMessage(String mes) {
        message.setMes(mes);
    }
}