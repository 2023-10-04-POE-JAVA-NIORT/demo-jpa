package com.demo;

import com.demo.jpa.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AddressTest
{
    @Test
    void testAddress(){
        Address address1 = new Address("rue du centre", 33, "Marseille");
        AddressDAO.save(address1);

        Person alain = new Person("Alain", "Dominguez");
        alain.setAddress(address1);
        PersonDAO.save(alain);

    }

    @Test
    void testAddressLecture(){
        Person alain = PersonDAO.findById(1L);
        System.out.println(alain);
    }
}
