package com.demo;


import com.demo.jpa.Person;
import com.demo.jpa.PersonDAO;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        /*
        Person alain = new Person("Alain", "Delon");
        PersonDAO.save(alain);

        Person marie = new Person("Marie", "Dufour");
        PersonDAO.save(marie);*/

/*
        Person p = PersonDAO.findById(3L);
        System.out.println(p);
        */

/*
        List<Person> people = PersonDAO.findAll();
        for (Person p : people){
            System.out.println(p);
        }

        Person p = PersonDAO.findById(2L);
        PersonDAO.delete(p);

 */
        //PersonDAO.deleteById(4L);
        //PersonDAO.deleteById_v2(1L);

        Person persontToUpdate = new Person();
        persontToUpdate.setFirstName("Alex");
        PersonDAO.update(2L, persontToUpdate);

    }

}
