package com.movie.booking.system;

import java.util.Date;
import java.util.List;

import com.movie.booking.system.enums.BookingStatus;

public class Booking {
    
    private String bookingId;
    private int numberOfSeats;;
    private Date createdOn;

    private BookingStatus status;
    private Show show;
    private List<ShowSeat> seats;

}
