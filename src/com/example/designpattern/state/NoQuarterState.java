package com.example.designpattern.state;

public class NoQuarterState implements State {

    GumballMachineState gumballMachine;

    public NoQuarterState(GumballMachineState gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted a quarter yet");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned but there is no quarter");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
