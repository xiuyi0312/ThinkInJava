package com.example.chapter10innerclass;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatDay(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOff(600),
                gc.new WaterOff(800),
                gc.new ThermostatNight(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));

        gc.addEvent(new GreenhouseControls.Terminate(30000));
        gc.run();

    }
}
