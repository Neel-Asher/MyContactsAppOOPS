package com.user.filter;

import com.user.contact.Contact;
public class TagFilter implements ContactFilter {

    private final String tag;

    public TagFilter(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean apply(Contact contact) {
        return contact.getTags()
                .stream()
                .anyMatch(t -> t.equalsIgnoreCase(tag));
    }
}