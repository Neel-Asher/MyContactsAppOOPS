package com.user.contact;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import com.user.tag.Tag;
import com.user.tag.PredefinedTag;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import java.util.EnumSet;

// contact class for blueprints of a contact
public abstract class Contact {

    private final UUID id;
    private final LocalDateTime createdAt;
    private String name;
    private final List<PhoneNumber> phoneNumbers;
    private final List<EmailAddress> emailAddresses;
    private final Set<Tag> tags;
    private final Set<PredefinedTag> predefinedTags;
    private int contactCount = 0;	

    public Contact(String name) {
        this.id = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
        this.tags = new HashSet<>();
        this.predefinedTags = new HashSet<>();
    }
    
    protected Contact(Contact other) {
    	this.id = other.id;
        this.createdAt = other.createdAt;
        this.name = other.name;

        // Deep copy
        this.phoneNumbers = new ArrayList<>(other.phoneNumbers);
        this.emailAddresses = new ArrayList<>(other.emailAddresses);
        this.tags = new HashSet<>(other.tags);
        this.predefinedTags = EnumSet.copyOf(other.predefinedTags);
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
    
    // Custom Tags
    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
    }

    public Set<Tag> getTags() {
        return new HashSet<>(tags);
    }

    // Predefined Tags
    public void addPredefinedTag(PredefinedTag tag) {
        predefinedTags.add(tag);
    }

    public void removePredefinedTag(PredefinedTag tag) {
        predefinedTags.remove(tag);
    }

    public Set<PredefinedTag> getPredefinedTags() {
        return EnumSet.copyOf(predefinedTags);
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
                Predefined Tags: %s
                ==============================
                """.formatted(getContactType(),name,phoneNumbers,emailAddresses,createdAt,tags,predefinedTags);
    }
}