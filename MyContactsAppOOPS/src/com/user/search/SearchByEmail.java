package com.user.search;

import java.util.ArrayList;
import java.util.List;

import com.user.contact.Contact;
import com.user.contact.EmailAddress;

public class SearchByEmail implements ContactSearch {

    @Override
    public List<Contact> search(List<Contact> contacts, String keyword) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            for (EmailAddress email : contact.getEmailAddresses()) {
                String value = email.getEmail();
                if (value.equalsIgnoreCase(keyword) ||value.toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(contact);
                    break;
                }
            }
        }
        return result;
    }
}