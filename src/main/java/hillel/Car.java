package hillel;

public class Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
    public void start(){
        setStartElectricity("Turn on Electricity");
        System.out.println((getStartElectricity()));
        setStartCommand("System get command");
        System.out.println((getStartCommand()));
        setStartFuelSystem("Launch fuel system");
        System.out.println((getStartFuelSystem()));
    }
    private String startElectricity;

    private String startCommand;

    private String startFuelSystem;

    public void Car(String startElectricity, String startCommand, String startFuelSystem) {
        this.startElectricity = startElectricity;
        this.startCommand = startCommand;
        this.startFuelSystem = startFuelSystem;
    }

    public String getStartElectricity() {
        return startElectricity;
    }

    public void setStartElectricity(String startElectricity) {
        this.startElectricity = startElectricity;
    }

    public String getStartCommand() {
        return startCommand;
    }

    public void setStartCommand(String startCommand) {
        this.startCommand = startCommand;
    }

    public String getStartFuelSystem() {
        return startFuelSystem;
    }

    public void setStartFuelSystem(String startFuelSystem) {
        this.startFuelSystem = startFuelSystem;
    }
}