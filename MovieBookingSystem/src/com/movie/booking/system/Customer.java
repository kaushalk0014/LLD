package com.movie.booking.system;

import java.util.List;

public class Customer extends Person {
    
    public boolean makeBooking(){
        return true;
    }

    public List<Booking> getBookings(){
        return null;
    }
}
