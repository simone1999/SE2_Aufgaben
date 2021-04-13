package de.dhbw.light;

public interface TrafficLightState {

    void nextColor(TrafficLight light);
    String getActualColor();

    void switchOn(TrafficLight light);
    void switchOff(TrafficLight light);
}
