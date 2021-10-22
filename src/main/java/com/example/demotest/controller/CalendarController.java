package com.example.demotest.controller;

import com.example.demotest.model.CalendarInput;
import com.example.demotest.model.CalendarResponse;
import com.example.demotest.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @PostMapping("/findStoreAvailability")
    public CalendarResponse getAvailability(@RequestBody CalendarInput calendarInput){
        calendarService.addRecord();
        String status= calendarService.findStore(calendarInput.getStoreID(),calendarInput.getRequestDate());

        if(status == "Available"){
            CalendarResponse calendarResponse = new CalendarResponse(calendarInput.getStoreID(), calendarInput.getRequestDate(), status);
            return calendarResponse;
        }
        else
        {
            CalendarResponse calendarResponse = new CalendarResponse(calendarInput.getStoreID(), calendarInput.getRequestDate(), status);
            return calendarResponse;

        }

    }

}
