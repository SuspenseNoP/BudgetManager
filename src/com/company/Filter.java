package com.company;

import javax.xml.crypto.Data;

public class Filter {
    private String type;
    private Data beginData;
    private Data endData;

    public Incomes[] filterIncomes(Account account, Data beginData, Data endData, String type) {
        Incomes[] in = new Incomes[6];
        return in;
    }

    public Spendings[] filterSpendings(Account account, Data beginData, Data endData, String type) {
        Spendings[] sp = new Spendings[6];
        return sp;
    }


}
