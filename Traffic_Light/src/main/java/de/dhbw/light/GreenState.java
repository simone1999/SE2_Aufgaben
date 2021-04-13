package de.dhbw.light;

public class GreenState implements TrafficLightState {
    @Override
    public void nextColor(TrafficLight light) {
        light.setState(new RedState());
    }

    @Override
    public String getActualColor() {
        return "Traffic light is green!";
    }

    @Override
    public void switchOn(TrafficLight light) {
        System.out.println("Traffic light is already enabled!");
    }

    @Override
    public void switchOff(TrafficLight light) {
        light.setState(new OffState());
    }

}
