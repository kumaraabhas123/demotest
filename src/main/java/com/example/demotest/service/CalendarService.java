package com.example.demotest.service;

import com.example.demotest.model.Calendar;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;


@Service
public class CalendarService {
    private static final ArrayList<Calendar> CalendarList = new ArrayList<>();
    private static final ArrayList<Calendar> AvaialbilityList = new ArrayList<>();

    public void addRecord(){
        CalendarList.add(new Calendar("STORE001", "ALL", LocalTime.of(13,30)));
        CalendarList.add(new Calendar("STORE002", "SUNDAY", LocalTime.of(13,30)));
        CalendarList.add(new Calendar("STORE003", "MONDAY", LocalTime.of(13,30)));

    }

    public String findStore(String StoreID, LocalDateTime requestDate){
        LocalDate date= requestDate.toLocalDate();
        LocalTime time= requestDate.toLocalTime();
        java.time.DayOfWeek dayOfWeek= date.getDayOfWeek();


        String result = null;
        result = CalendarList.stream().filter(i -> i.getStoreID().equals(StoreID)
                && i.getDay().equals(dayOfWeek) && i.getCutOffTime().isAfter(time)).toString();
        if(result != null)
        {
            return "Available";
        }
        else
            return "Not Available";

    }
}

