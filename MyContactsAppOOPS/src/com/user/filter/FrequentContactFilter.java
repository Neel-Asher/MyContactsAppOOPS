package com.user.filter;

import com.user.contact.Contact;

public class FrequentContactFilter implements ContactFilter {

    private final int minimumCount;

    public FrequentContactFilter(int minimumCount) {
        this.minimumCount = minimumCount;
    }

    @Override
    public boolean apply(Contact contact) {
        return contact.getContactCount() >= minimumCount;
    }
}