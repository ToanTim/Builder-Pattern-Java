package com.mycompany.app;

import java.util.Date;

abstract class AbstractBuilder {
    abstract VacationBuilder buildDay(Date date);

    abstract VacationBuilder addHotel(String hotelname);

    abstract VacationBuilder addReservation(String reservationName);

    abstract VacationBuilder addSpecialEvent(String eventName);

    abstract VacationBuilder addTickets(String ticketName);

    abstract Vacation getVacationPlanner();
}
