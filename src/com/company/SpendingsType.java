package com.company;

import java.util.ArrayList;

public class SpendingsType extends Type {
    private ArrayList<Operation> operations;
    private double limit;
    private String name;
    private String sum;
    private String icon;

    public void addOperation() {
    }

    public void deleteOperation(Operation operation) {
    }

    public void changeOperation(Operation operation) {
    }

    public boolean checkLimit() {
        return false;
    }

    public void changeName(String name){}
    public void changeIcon(String icon){}
    public void sumCounting(){}

}
