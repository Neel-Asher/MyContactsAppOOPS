package com.user.search;

import java.util.ArrayList;
import java.util.List;
import com.user.contact.Contact;

public class SearchByTag implements ContactSearch {
    @Override
    public List<Contact> search(List<Contact> contacts, String keyword) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            for (String tag : contact.getTags()) {
                if (tag.equalsIgnoreCase(keyword) || tag.toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(contact);
                    break;
                }
            }
        }
        return result;
    }
}