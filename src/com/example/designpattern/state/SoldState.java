package com.example.designpattern.state;

public class SoldState implements State {

    private GumballMachineState gumballMachineState;

    public SoldState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Turning twice does not get you another gumball");
        return false;
    }

    @Override
    public void dispense() {
        gumballMachineState.releaseBall();
        if (gumballMachineState.getCount() == 0) {
            gumballMachineState.setCurrentState(gumballMachineState.getSoldOutState());
            System.out.println("Oops, out of gumballs");
        } else {
            gumballMachineState.setCurrentState(gumballMachineState.getNoQuarterState());
        }
    }
}
