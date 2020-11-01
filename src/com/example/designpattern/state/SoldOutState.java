package com.example.designpattern.state;

public class SoldOutState implements State {

    private GumballMachineState gumballMachineState;

    public SoldOutState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cannot eject, you have not inserted a quarter yet");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned but there is no gumball");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
