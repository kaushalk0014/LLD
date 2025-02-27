package com.hotal.management.system.entiry;

import java.util.Date;
import java.util.List;

import com.hotal.management.system.enums.RoomStatus;
import com.hotal.management.system.enums.RoomStyle;
import com.hotal.management.system.enums.RoomType;

public class Room implements Search{

    private String roomNumber;
    private RoomStyle roomStyle;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private double price;
    private boolean isBooked;
    private boolean isRoomAvailable(){ return false;}

    @Override
    public List<Room> search(Date startDate, Date endDate, RoomType roomType, int numberOfRooms) {
        // TODO Auto-generated method stub
        return null;
    }
}
