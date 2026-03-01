package com.user.tag;

import java.util.Objects;

// Represents a custom tag for organizing contacts
public class Tag {

    private final String name;

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