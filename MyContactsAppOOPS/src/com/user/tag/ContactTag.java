package com.user.tag;

import com.user.contact.Contact;
import java.util.Objects;

public class ContactTag {

    private final Contact contact;
    private final Tag tag;

    public ContactTag(Contact contact, Tag tag) {
        if (contact == null || tag == null) {
            throw new IllegalArgumentException("Contact and Tag cannot be null");
        }
        this.contact = contact;
        this.tag = tag;
    }

    public Contact getContact() {
        return contact;
    }

    public Tag getTag() {
        return tag;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ContactTag other)) return false;
        return contact.getId().equals(other.contact.getId())
                && tag.equals(other.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact.getId(), tag);
    }
}