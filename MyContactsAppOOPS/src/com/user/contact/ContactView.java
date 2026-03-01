package com.user.contact;

import java.time.LocalDateTime;
import java.util.*;
public final class ContactView {
	
	private final UUID id;
	private final String type;
	private final String name;
	private final LocalDateTime createdAt;
	private final List<String> phones;
	private final List<String> emails;
	private final List<String> tags;
	
	public ContactView(UUID id,String type,String name,LocalDateTime createdAt,List<String> phones,List<String> emails,List<String> tags) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.createdAt = createdAt;
		this.phones = phones;
		this.emails = emails;
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return String.format("Contact ID: %s%nType: %s%nName: %s%nCreated At: %s%nPhones: %s%nEmails: %s%nTags: %s",id,type,name,createdAt,phones,emails,tags);
	}
}