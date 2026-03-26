package POO.Agregacao.Ex0000;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Connection {
    private String originNumber;
    private String destinationNumber;
    private String callTime;

    public Connection(String originNumber, String destinationNumber) {
        this.originNumber = originNumber;
        this.destinationNumber = destinationNumber;
    }
    public void call(){
        System.out.println("Calling "+originNumber+" to "+destinationNumber);
        System.out.println("Calling...");
        System.out.println("Busy");
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        callTime = dataFormatter.format(now);
    }

    public String getOriginNumber() {
        return originNumber;
    }
    @Override
    public String toString() {
        String information = String.format("Origen: %s\t Destination: %s\t Call Time: %s",
                originNumber,
                destinationNumber,
                callTime);
        return information;
    }


    public void setOriginNumber(String originNumber) {
        this.originNumber = originNumber;
    }
    public String getDestinationNumber() {
        return destinationNumber;
    }
    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

}
