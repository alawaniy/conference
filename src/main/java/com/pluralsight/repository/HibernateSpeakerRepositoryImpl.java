package com.pluralsight.repository;

import com.pluralsight.model.Speaker;


import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

       @Override
       public List<Speaker> findAll() {

           List<Speaker> speakers = new ArrayList<Speaker>();

           Speaker obj= new Speaker();
           obj.setFirstName("Ankit");
           obj.setLastName("Lawaniya");

           speakers.add(obj);

           return speakers;
       }
}
