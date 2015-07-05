package com.intropro.blablacar;

import org.junit.Test;

import java.util.Date;
import static org.junit.Assert.*;

/**
 * Created by Viktoriia on 02.06.15.
 */
public class RideTest {

    @Test
    public void testCreateRide() {

        String start = "Cristal";
        String finish = "Grigorenko";
        Date date = new Date();
        Profile profile = new Profile("Potapov", "Ivan");

        Ride ride = Ride.createRide(start, finish, date, profile);

        assertNotNull(ride);
    }
}
