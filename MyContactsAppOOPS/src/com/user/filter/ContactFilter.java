package com.user.filter;

import com.user.contact.Contact;

@FunctionalInterface
public interface ContactFilter {
    boolean apply(Contact contact);
}