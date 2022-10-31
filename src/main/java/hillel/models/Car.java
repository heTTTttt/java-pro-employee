package hillel.models;

public class Car {
    public void start(){
        setStartCommand();
        setStartElectricity();
        setStartFuelSystem();
        System.out.println(getStartElectricity());
        System.out.println(getStartCommand());
        System.out.println(getStartFuelSystem());
    }
    private String startElectricity;

    private String startCommand;

    private String startFuelSystem;

    public Car() {
        this.startElectricity = "startElectricity";
        this.startCommand = "startCommand";
        this.startFuelSystem = "startFuelSystem";
    }

    private String getStartElectricity() {
        return startElectricity;
    }

    private void setStartElectricity() {
        this.startElectricity = "startElectricity";
    }

    private String getStartCommand() {
        return startCommand;
    }

    private void setStartCommand() {this.startCommand = "startCommand";}

    private String getStartFuelSystem() {
        return startFuelSystem;
    }

    private void setStartFuelSystem() {this.startFuelSystem = "startFuelSystem";}
}