package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesignParkingSystem1603Test {

    @Test
    public void testAdd() {
        DesignParkingSystem1603 parkingSystem = new DesignParkingSystem1603(1, 1, 0);
        // return true because there is 1 available slot for a big car
        assertEquals(true, parkingSystem.addCar(1));
        // return true because there is 1 available slot for a medium car
        assertEquals(true, parkingSystem.addCar(2));
        // return false because there is no available slot for a small car
        assertEquals(false, parkingSystem.addCar(3));
        // return false because there is no available slot for a big car. It is already occupied.
        assertEquals(false, parkingSystem.addCar(1));
    }

}