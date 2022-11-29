package at.fhtw.appelkaipel.maintenancemonitor.dto;

public class Message {
    private String mes = "";

    public String getMes() { return mes; }

    public void setMes(String message) {
        mes = message;
    }

    public void resetMes() { mes = "";}

}
