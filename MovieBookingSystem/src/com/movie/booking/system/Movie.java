package com.movie.booking.system;

import java.util.Date;
import java.util.List;

public class Movie {
    private String movieName;
    private String description;
    private int durationInMin;
    private String language;
    private String country;
    private Date relaaseDate;
 
    private List<Show> shows;

    public List<Show> getShow(){
        return null;
    }

}
