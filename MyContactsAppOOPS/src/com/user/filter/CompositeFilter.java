package com.user.filter;

import java.util.ArrayList;
import java.util.List;
import com.user.contact.Contact;

public class CompositeFilter implements ContactFilter {

    private final List<ContactFilter> filters = new ArrayList<>();

    public void addFilter(ContactFilter filter) {
        filters.add(filter);
    }

    @Override
    public boolean apply(Contact contact) {
        return filters.stream()
                .allMatch(filter -> filter.apply(contact));
    }
}