package com.demo;


import com.demo.jpa.Person;
import com.demo.jpa.PersonDAO;

public class App
{
    public static void main( String[] args )
    {
        /*
        Person alain = new Person("Alain", "Delon");
        PersonDAO.save(alain);

        Person marie = new Person("Marie", "Dufour");
        PersonDAO.save(marie);
       */

        Person p = PersonDAO.findById(3L);
        System.out.println(p);

    }

}
