package at.fhtw.appelkaipel.maintenancemonitor.dto;

public class Message {
    private String mes = "Stored Message";

    public String getMes() { return mes; }

    public void setMes(String message) {
        mes = message;
    }

    public void resetMes() { mes = "";}

}