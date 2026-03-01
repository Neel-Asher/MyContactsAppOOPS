package com.user.search;

import java.util.ArrayList;
import java.util.List;
import com.user.contact.Contact;

public class SearchByName implements ContactSearch {
    @Override
    public List<Contact> search(List<Contact> contacts, String keyword) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            String name = contact.getName();
            if (name.equalsIgnoreCase(keyword) ||name.toLowerCase().contains(keyword.toLowerCase())) {

                result.add(contact);
            }
        }
        return result;
    }
}