package com.nology;

import java.util.ArrayList;

public class OfficeSupplies implements StockControl {

    public int pens;
    public int staplers;
    public int staples;
    public int rulers;
    public int A4Booklets;

//    hey currently have 1000 pens, 200 staplers, 8000 staples, 50 rulers and 300
//    A4 Booklets.


    public OfficeSupplies(int pens, int staplers, int staples, int rulers, int a4Booklets) {
        this.pens = pens;
        this.staplers = staplers;
        this.staples = staples;
        this.rulers = rulers;
        this.A4Booklets = a4Booklets;
    }

    public OfficeSupplies(){

    }

    public int getPens() {
        return pens;
    }

    public int getStaplers() {
        return staplers;
    }

    public int getStaples() {
        return staples;
    }

    public int getRulers() {
        return rulers;
    }

    public int getA4Booklets() {
        return A4Booklets;
    }

    public int addPen (int amount) {
        pens +=amount;
        return pens;
    }

    public int removePen (int amount) {
        pens -=amount;
        return pens;
    }

    public int removeStaples (int amount) {
        if(amount > staples) {
            throw new IllegalArgumentException("you do not have enough staples");
        }
        staples -=amount;
        return staples;
    }


}


