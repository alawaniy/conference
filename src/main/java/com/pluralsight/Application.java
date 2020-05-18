package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {

    public static void main(String args[])
    {
        SpeakerService sc = new SpeakerServiceImpl();

        System.out.println(sc.findAll().get(0).getFirstName());
        System.out.println(sc.findAll().get(0).getLastName());
    }
}
