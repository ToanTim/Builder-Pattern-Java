package com.mycompany.app;

import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Date currentDate = new Date();
        // Create a Calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Add one day to the current date
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        // Get tomorrow's date
        Date tomorrowDate = calendar.getTime();
        Vacation planOne = new VacationBuilder().buildDay(currentDate).addHotel("Morning Glory")
                .addReservation("Candy Park")
                .getVacationPlanner();
        Vacation planTwo = new VacationBuilder().buildDay(tomorrowDate).addHotel("Afternoon Glory")
                .addTickets("Car Park").addSpecialEvent("Vappu")
                .getVacationPlanner();
        System.out.println("Plan for day " + planOne.getDate());
        System.out.println("Hotel name " + planOne.getHotelName());
        System.out.println("Reservation name " + planOne.getReservationName());
        System.out.println();
        System.out.println("Plan for day " + planTwo.getDate());
        System.out.println("Hotel name " + planTwo.getHotelName());
        System.out.println("Ticket name " + planTwo.getTicketName());
        System.out.println("Event name " + planTwo.getEventName());
    }
}
