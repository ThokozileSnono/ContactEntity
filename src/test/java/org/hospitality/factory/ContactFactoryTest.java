package org.hospitality.factory;

import org.hospitality.entity.Contact;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactFactoryTest {

    @Test
    public void createContact() {
        Contact contact = ContactFactory.createContact("thokozile@gmail.com", "073");
        System.out.println(contact);
    }
}