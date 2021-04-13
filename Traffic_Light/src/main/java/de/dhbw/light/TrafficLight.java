package de.dhbw.light;

public class TrafficLight {

    private TrafficLightState state = new RedState();

    protected TrafficLightState getState() {
        return state;
    }

    protected void setState(TrafficLightState state) {
        this.state = state;
    }

    public String getActualColor(){
        return state.getActualColor();
    }

    public void nextColor(){
        state.nextColor(this);
    }

    public void switchOn() {
        state.switchOn(this);
    }

    public void switchOff() {
        state.switchOff(this);
    }

}
