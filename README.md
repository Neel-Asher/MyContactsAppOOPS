# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-11: Create and Manage Tags

Actor: Logged-in User

+ User creates custom tags to organize contacts
+ Predefined tags supported using PredefinedTag enum
+ Tag class includes validation for non-empty names
+ equals() and hashCode() implemented for uniqueness
+ Set<Tag> used to prevent duplicate custom tags
+ EnumSet<PredefinedTag> used for predefined tags
+ Many-to-many relationship between Contact and Tag
+ Defensive copies returned in getters for encapsulation
+ Follows OOP principles of encapsulation and data integrity
