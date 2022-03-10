package com.nology;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class OfficeTest {

    private OfficeSupplies supplies;

    @Before
    public void setup(){
        supplies = new OfficeSupplies(1000,200,8000,50,300);
    }

    @org.junit.Test
    public void GetAmount_RemoveAmount_ReturnsUpdatedAmount() {
        //Act
        supplies.removePen(258);
        //Assert
        assertEquals(742,supplies.getPens(),0);
    }

    @org.junit.Test
    public void GetAmount_AddAmount_ReturnsUpdatedAmount() {
        //Act
        supplies.addPen(1500);
        //Assert
        assertEquals(2500,supplies.getPens(),0);
    }

    @org.junit.Test
    public void GetAmount_RemoveAmountStaples_ReturnsUpdatedAmount() {
        //Act

        supplies.removeStaples(18400);
    }

}
