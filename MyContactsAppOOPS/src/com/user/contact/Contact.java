package com.user.contact;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

// contact class for blueprints of a contact
public abstract class Contact {

    private final UUID id;
    private final LocalDateTime createdAt;
    private String name;
    private final List<PhoneNumber> phoneNumbers;
    private final List<EmailAddress> emailAddresses;
    private final List<String> tags; 
    private int contactCount = 0;	

    public Contact(String name) {
        this.id = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
        this.tags = new ArrayList<>();
    }
    
    protected Contact(Contact other) {
    	this.id = other.id;
        this.createdAt = other.createdAt;
        this.name = other.name;

        // Deep copy
        this.phoneNumbers = new ArrayList<>(other.phoneNumbers);
        this.emailAddresses = new ArrayList<>(other.emailAddresses);
        this.tags = new ArrayList<>(other.tags);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    public List<EmailAddress> getEmailAddresses() {
        return new ArrayList<>(emailAddresses);
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void addEmailAddress(EmailAddress emailAddress) {
        emailAddresses.add(emailAddress);
    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    
    public void setPhoneNumbers(List<PhoneNumber> phones) {
        this.phoneNumbers.clear();
        this.phoneNumbers.addAll(phones);
    }

    public void setEmailAddresses(List<EmailAddress> emails) {
        this.emailAddresses.clear();
        this.emailAddresses.addAll(emails);
    }
    
    public void addTag(String tag) {
        if (tag == null || tag.isBlank()) {
            throw new IllegalArgumentException("Tag cannot be empty");
        }
        tags.add(tag);
    }

    public void removeTag(String tag) {
        tags.remove(tag);
    }

    public List<String> getTags() {
        return new ArrayList<>(tags); // defensive copy
    }
    
    public void incrementContactCount() {
        contactCount++;
    }

    public int getContactCount() {
        return contactCount;
    }

    public abstract String getContactType();

    @Override
    public String toString() {
        return """
                ==============================
                Contact Details
                ==============================
                Type: %s
                Name: %s
                Phone Numbers: %s
                Email Addresses: %s
                Created At: %s
                Tags: %s
                ==============================
                """.formatted(getContactType(),name,phoneNumbers,emailAddresses,createdAt,tags);
    }
}