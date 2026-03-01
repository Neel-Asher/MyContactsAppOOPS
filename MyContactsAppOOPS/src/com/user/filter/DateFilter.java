package com.user.filter;

import java.time.LocalDateTime;
import com.user.contact.Contact;
public class DateFilter implements ContactFilter {

    private final LocalDateTime after;

    public DateFilter(LocalDateTime after) {
        this.after = after;
    }

    @Override
    public boolean apply(Contact contact) {
        return contact.getCreatedAt().isAfter(after);
    }
}