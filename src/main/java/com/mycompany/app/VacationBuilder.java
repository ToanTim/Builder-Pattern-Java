package com.mycompany.app;

import java.util.Date;

class VacationBuilder extends AbstractBuilder {

    private Vacation vacation = new Vacation();

    public VacationBuilder buildDay(Date date) {
        vacation.setDate(date);
        return this;
    };

    public VacationBuilder addHotel(String hotelName) {
        vacation.setHotelName(hotelName);
        return this;
    };

    public VacationBuilder addReservation(String reservationName) {
        vacation.setReservationName(reservationName);
        return this;
    };

    public VacationBuilder addSpecialEvent(String eventName) {
        vacation.setEventName(eventName);
        return this;
    };

    public VacationBuilder addTickets(String ticketName) {
        vacation.setTicketName(ticketName);
        return this;
    };

    public Vacation getVacationPlanner() {
        return this.vacation;
    }

    public VacationBuilder addDate(Date currentDate) {
        return null;
    };
}