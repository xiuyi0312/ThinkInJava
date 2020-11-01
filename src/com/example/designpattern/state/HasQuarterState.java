package com.example.designpattern.state;

import java.util.Random;

public class HasQuarterState implements State{
    Random random = new Random(System.currentTimeMillis());

    private GumballMachineState gumballMachineState;

    public HasQuarterState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachineState.setCurrentState(gumballMachineState.getNoQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned...");
        int winner = random.nextInt(10);
        if(winner == 0 && gumballMachineState.getCount() > 1) {
            gumballMachineState.setCurrentState(gumballMachineState.getWinnerState());
        } else {
            gumballMachineState.setCurrentState(gumballMachineState.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
