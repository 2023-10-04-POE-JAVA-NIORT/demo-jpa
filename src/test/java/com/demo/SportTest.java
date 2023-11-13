package com.demo;

import com.demo.jpa.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class SportTest
{
    @Test
    void testSport1(){
       Person sportif1 = PersonDAO.findById(1L);
       Person sportif2 = PersonDAO.findById(2L);

        Sport foot = new Sport("Football");
        foot.addSportif(sportif1);
        SportDAO.save(foot);
    }

    @Test
    void testSport2(){
        Sport foot = SportDAO.findById(1L);
        List<Person> sportifs = foot.getSportifs();
        for(Person p : sportifs){
            System.out.println(p);
        }
    }

    @Test
    void testSport3(){
        Sport foot = SportDAO.findById(1L);
        foot.addSportif(PersonDAO.findById(2L));
        SportDAO.update(1L, foot);
    }

    @Test
    void testSport4(){
        Person sportif2 = PersonDAO.findById(2L);

        Sport rugby = new Sport("Rugby");
        rugby.addSportif(sportif2);
        SportDAO.save(rugby);
    }

}
