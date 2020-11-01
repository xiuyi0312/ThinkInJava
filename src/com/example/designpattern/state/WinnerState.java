package com.example.designpattern.state;

public class WinnerState implements State {
    private GumballMachineState gumballMachineState;

    public WinnerState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are already giving you two gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Turning twice does not get you more gumballs");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("YOU WIN, You get two gumballs for your quarter");
        gumballMachineState.releaseBall();
        gumballMachineState.releaseBall();
        if (gumballMachineState.getCount() == 0) {
            gumballMachineState.setCurrentState(gumballMachineState.getSoldOutState());
            System.out.println("Oops, out of gumballs");
        } else {
            gumballMachineState.setCurrentState(gumballMachineState.getNoQuarterState());
        }
    }
}
