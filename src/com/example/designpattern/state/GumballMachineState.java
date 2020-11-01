package com.example.designpattern.state;

public class GumballMachineState {
    private State currentState;
    private State soldOutState;
    private State soldState;
    private State noQuarterState;
    private State hasQuarterState;
    private State winnerState;
    private int count;

    public static void main(String[] args) {
        GumballMachineState gumballMachineState = new GumballMachineState(100);
        gumballMachineState.insertQuarter();
        gumballMachineState.ejectQuarter();

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();

        gumballMachineState.ejectQuarter();

        gumballMachineState.turnCrank();

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();

        gumballMachineState.insertQuarter();
        gumballMachineState.turnCrank();


    }

    public GumballMachineState(int count) {

        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) {
            currentState = noQuarterState;
        } else {
            currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        boolean result = currentState.turnCrank();
        if (result) {
            currentState.dispense();
        }
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    void releaseBall() {
        if (count > 0) {
            count--;
            System.out.println("A gumball comes rolling out the slot");
        }
    }
}
