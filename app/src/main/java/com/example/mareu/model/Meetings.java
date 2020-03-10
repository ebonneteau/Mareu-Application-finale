package com.example.mareu.model;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Meetings {


    /** Identifier */
    private Integer id;

    /** Meeting object */
    private String object;

    /** StartTime */
    private String startTime;

    /** EndTime */
    private String endTime;


    /** Place */
    private String place;

    /** Attendees */
    private List<Attendees> attendees;

    /**
     * Constructor
     * @param id
     * @param object
     * @param startTime
     * @param endTime
     * @param place
     * @param attendees
     */

    public Meetings(Integer id, String object, String startTime,String endTime, String place, List<Attendees> attendees) {
        this.id = id;
        this.object = object;
        this.startTime = startTime;
        this.endTime = endTime;
        this.place = place;
        this.attendees = new ArrayList<>();
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String subject) {
        this.object = subject;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }


    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meetings attendees = (Meetings) o;
        return Objects.equals(id, attendees.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
