package de.dhbw.light;

public class OffState implements TrafficLightState{
    @Override
    public void nextColor(TrafficLight light) {
        System.out.println("Traffic light is disabled!");
    }

    @Override
    public String getActualColor() {
        return "Traffic light is disabled!";
    }

    @Override
    public void switchOn(TrafficLight light) {
        light.setState(new RedState());
    }

    @Override
    public void switchOff(TrafficLight light) {
        throw new UnsupportedOperationException("Traffic light is already disabled!");
    }

}
