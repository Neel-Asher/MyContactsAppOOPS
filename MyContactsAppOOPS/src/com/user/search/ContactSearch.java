package com.user.search;

import java.util.List;

import com.user.contact.Contact;
public interface ContactSearch {
	List<Contact> search(List<Contact> contacts, String keyword);
}
