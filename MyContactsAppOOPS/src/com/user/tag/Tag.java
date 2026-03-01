package com.user.tag;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.user.contact.Contact;

// Represents a custom tag for organizing contacts
public class Tag {

    private final String name;
    private final Set<Contact> contacts = new HashSet<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public Set<Contact> getContacts() {
        return new HashSet<>(contacts);
    }

    public Tag(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Tag name cannot be empty");
        }
        this.name = name.trim().toLowerCase();
    }

    public String getName() {
        return name;
    }

    // Tags are equal if their names are equal (case-insensitive handled in constructor)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Tag other)) return false;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}