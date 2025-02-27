package com.movie.booking.system;

import com.movie.booking.system.enums.AccountStatus;

public class Account {
    private String  id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword(){
        return true;
    }
}
