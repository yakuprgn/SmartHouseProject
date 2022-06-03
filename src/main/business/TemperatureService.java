package main.business;

public interface TemperatureService {
    void incrementTemperature();
    void decrementTemperature();
    void setTemperature(int temperature);
    int getTemperature();
}
