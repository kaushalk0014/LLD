package com.movie.booking.system;

import java.util.Date;

import com.movie.booking.system.enums.PaymentStatus;

public class Payment {
        private double amount;
        private PaymentStatus status;
        private int transactionId;
        private Date createdOn;
}
