package com.intropro.blablacar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

/**
 * Created by Viktoriia on 02.06.15.
 */
public class RideListTest {

    @Test
    public void testCreateRide() {

        String start = "Cristal";
        String finish = "Grigorenko";
        Date date = new Date();
        Profile profile = new Profile("Ivanov", "Ivan");
        RideList rideList = new RideList();

        Ride ride = rideList.createRide(start, finish, date, profile);

        assertNotNull(ride);
        assertFalse(rideList.getRides().isEmpty());
        assertEquals(ride, rideList.getRides().get(0));

        Ride ride2 = rideList.createRide(start, finish, date, profile);

        assertEquals(2, rideList.getRides().size());
        assertEquals(ride2, rideList.getRides().get(1));
    }

    @Test
    public void testSearchEmptyRide(){

    }

    @Test
    public void testSearchByStart(){

    }

    @Test
    public void testSearchByFrom(){

    }


}
