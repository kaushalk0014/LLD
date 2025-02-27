package com.hotal.management.system.entiry;
import java.util.Date;
import java.util.List;

import com.hotal.management.system.enums.RoomType;

public interface Search {
    
    public List<Room> search(Date startDate, Date endDate, RoomType roomType, int numberOfRooms);
}
