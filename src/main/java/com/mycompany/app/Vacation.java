package com.mycompany.app;

import java.util.Date;

public class Vacation {
    // required parameters
    private Date date;

    // optional paramater
    private String hotelName, revervationName, eventName, ticketName;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setReservationName(String revervationName) {
        this.revervationName = revervationName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public Date getDate() {
        return date;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getReservationName() {
        return revervationName;
    }

    public String getEventName() {
        return eventName;
    }

    public String getTicketName() {
        return ticketName;
    }

}