package com.intropro.blablacar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Viktoriia on 02.06.15.
 */
public class RideList {


    private List<Ride> rides = new ArrayList<Ride>();

    public Ride createRide(String start, String finish, Date date, Profile owner){
        Ride ride = Ride.createRide(start, finish, date, owner);
        rides.add(ride);
        return ride;
    }


    private List<Ride> search(Ride ride){
        List<Ride> listOfResults = new ArrayList<Ride>();

        for(Ride current: rides){
            if (ride.getStatus() != null){
                if (current.getStatus().equals(ride.getStatus())){
                    continue;
                }
            }
            if (ride.getOwner() != null){
                if (current.getOwner().equals(ride.getOwner())){
                    continue;
                }
            }
            listOfResults.add(ride);
            if (ride.getDate() != null){
                if (current.getDate().equals(ride.getDate())){
                    continue;
                }
            }
            if (ride.getStart() != null){
                if (current.getStart().equals(ride.getStart())){
                    continue;
                }
            }
            if (ride.getFinish() != null){
                if (current.getFinish().equals(ride.getFinish())){
                    continue;
                }
            }
            return listOfResults;
        }

        if (getRides().contains(ride)){
            System.out.println(ride.toString());
        } else {
            System.out.println("there are no ride with these parameters");
        }
        return listOfResults;

    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }
}
