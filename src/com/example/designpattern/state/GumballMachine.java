package com.example.designpattern.state;

/**
 * bad practice because every time a new feature is added to this system,
 * all the codes need to be checked and modified
 */
@Deprecated
public class GumballMachine {
    private static final int SOLD_OUT = 0;
    private static final int NO_QUARTER = SOLD_OUT + 1;
    private static final int HAS_QUARTER = NO_QUARTER + 1;
    private static final int SOLD = HAS_QUARTER + 1;

    int state = SOLD_OUT;
    int count = 0;

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(20);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        // error
        gumballMachine.turnCrank();

        // error
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();


    }

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            print("You cannot insert another quarter");
        } else if (NO_QUARTER == state) {
            state = HAS_QUARTER;
            print("You insert a quarter");
        } else if (SOLD_OUT == state) {
            print("You cannot insert a quarter, the machine is sold out");
        } else if (SOLD == state) {
            print("Please wait, we are already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (HAS_QUARTER == state) {
            print("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            print("You have not inserted a quarter yet");
        } else if (state == SOLD) {
            print("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            print("You cannot eject, you have not inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            state = SOLD;
            print("You turned...");
            dispense();
        } else if (state == NO_QUARTER) {
            print("You turned but there is no quarter");
        } else if (state == SOLD_OUT) {
            print("You turned but there is no gumball");
        } else if (state == SOLD) {
            print("Turning twice does not get you another gumball");
        }
    }

    private void dispense() {
        if (state == SOLD) {
            print("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                state = SOLD_OUT;
                print("Oops, out of gumballs");
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            print("You need to pay first");
        } else if (state == HAS_QUARTER) {
            print("No gumball dispensed");
        } else if (state == SOLD_OUT) {
            print("No gumball dispensed");
        }
    }

    private void print(String info) {
        System.out.println(info);
    }
}
