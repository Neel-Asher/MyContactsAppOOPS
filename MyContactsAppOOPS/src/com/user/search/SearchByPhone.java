package com.user.search;

import java.util.ArrayList;
import java.util.List;
import com.user.contact.Contact;
import com.user.contact.PhoneNumber;

public class SearchByPhone implements ContactSearch {

    @Override
    public List<Contact> search(List<Contact> contacts, String keyword) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            for (PhoneNumber phone : contact.getPhoneNumbers()) {
                String number = phone.getNumber();
                if (number.equals(keyword) ||number.contains(keyword)) {
                    result.add(contact);
                    break; // stop checking this contact
                }
            }
        }
        return result;
    }
}