package com.company;

import java.util.ArrayList;

public class Account {
    private String name;
    private String password;
    private Incomes incomes;
    private Spendings spendings;
    private Bills bills;

    public void createIncomes() {
        Incomes incomes = new Incomes();
        this.incomes = incomes;
    }

    public void createSpendings() {
        Spendings spendings = new Spendings();
        this.spendings = spendings;
    }

    public void createBills() {
        Bills bills = new Bills();
        this.bills = bills;
    }

    public void changeParametrs(String name, String password) {
    }

    public void download() {
    }

    ;

}
