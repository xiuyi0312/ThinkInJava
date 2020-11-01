package com.example.designpattern.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();

}
