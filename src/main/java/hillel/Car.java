package hillel;

public class Car {
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

    public Car(String startElectricity, String startCommand, String startFuelSystem) {
        this.startElectricity = startElectricity;
        this.startCommand = startCommand;
        this.startFuelSystem = startFuelSystem;
    }

    private String getStartElectricity() {
        return startElectricity;
    }

    private void setStartElectricity(String startElectricity) {
        this.startElectricity = startElectricity;
    }

    private String getStartCommand() {
        return startCommand;
    }

    private void setStartCommand(String startCommand) {
        this.startCommand = startCommand;
    }

    private String getStartFuelSystem() {
        return startFuelSystem;
    }

    private void setStartFuelSystem(String startFuelSystem) {
        this.startFuelSystem = startFuelSystem;
    }
}