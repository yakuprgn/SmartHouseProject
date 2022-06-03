package main.business;

public class TemperatureManager implements TemperatureService {

    private int temperature;

    public TemperatureManager(){
        this.temperature = 20;
    }

    public TemperatureManager(int temperature){
        this.temperature = temperature;
    };

    public void incrementTemperature() {
        this.temperature += 1;
    }

    public void decrementTemperature() {
        this.temperature -= 1;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }
}
