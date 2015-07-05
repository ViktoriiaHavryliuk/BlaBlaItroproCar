package com.intropro.blablacar;

import com.intropro.dao.DBConnection;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Viktoriia on 02.06.15.
 */
public class Ride {

    private String start;
    private String finish;
    private Date date;
    private String status;
    private Profile owner;
    private List <Comment> comments;
    private List<Request> requests;


    private Ride() {

    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Profile getOwner() {
        return owner;
    }

    public void setOwner(Profile owner) {
        this.owner = owner;
    }

    public void delete(Ride ride) throws SQLException {
        DBConnection db = new DBConnection();
        //int id = db.queryExecutor("SELECT id FROM ride WHERE")
        //db.
        db.queryExecutor("DELETE FROM Ride WHERE owner ="+ride.getOwner());



    }

    public static Ride createRide(String start, String finish, Date date, Profile owner){

        Ride ride = new Ride();
        ride.setStart(start);
        ride.setFinish(finish);
        ride.setDate(date);
        ride.setOwner(owner);
        ride.setStatus("active");
        return ride;
    }

    public void viewRide(Ride ride) {
        System.out.println(ride.toString());
    }

    public void deleteRide(Ride ride) {


    }
    public void updateRide(Ride ride) {
        Scanner sc = new Scanner(System.in);
        String answer = "y";
        System.out.println("Do you want to update owner of the current ride\nType \"y\"/\"n\"");
        if (sc.nextLine().equals(answer)){
            System.out.println("Type new owner");
            ride.setOwner(new Profile(sc.next(".* "), sc.next(" .*")));
        }
        System.out.println("Ride's owner updated");
        sc.close();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ride)) return false;

        Ride ride = (Ride) o;

        if (date != null ? !date.after(ride.date)|| !date.equals(ride.date) : ride.date != null) return false;
        if (finish != null ? !finish.equals(ride.finish) : ride.finish != null) return false;
        if (owner != null ? !owner.equals(ride.owner) : ride.owner != null) return false;
        if (start != null ? !start.equals(ride.start) : ride.start != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (finish != null ? finish.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "start='" + start + '\'' +
                ", finish='" + finish + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", owner=" + owner +
                '}';
    }
}
