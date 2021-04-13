package de.dhbw.client;

import de.dhbw.light.TrafficLight;

/**
 * TrafficLight - 12.04.2021 - TINF18IT2 SE2
 * Maurice Gaster
 * Marvin Kohlmann
 * Simon Klein
 * Luca Steinke
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        TrafficLight l1 = new TrafficLight();
        System.out.println(l1.getActualColor());
        l1.nextColor();
        System.out.println(l1.getActualColor());
        l1.nextColor();
        System.out.println(l1.getActualColor());
        l1.switchOff();
        System.out.println(l1.getActualColor());
        l1.switchOn();
        System.out.println(l1.getActualColor());
    }
}
