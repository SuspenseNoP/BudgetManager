package com.company;

import java.util.ArrayList;

public class Spendings extends BillsIncomesSpendings{
    private ArrayList<SpendingsType> spendingsTypes;
    private Double balance;
    private Double limit;
    private Boolean limitExist;


    public void countAllBalance(ArrayList<SpendingsType> spendingsTypes){}

    public void addType() {
    }

    public void deleteType(SpendingsType spendingsType) {
    }

    public void changeType(SpendingsType spendingsType) {
    }
    public void changeLimit(double newlimit){
        this.limit=newlimit;
    }
public boolean checkLimit(){
        return false;
}
    public void addLimit(double newLimit){
        limitExist=true;
        this.limit=newLimit;
    }
}
