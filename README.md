# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-04: Add Contact – 26.02.2026

+ Allows a logged-in user to add new contacts to their contact list.
+ Supports two contact types: Person and Organization using inheritance.
+ Each contact is assigned a unique UUID automatically.
+ Contact creation timestamp stored using LocalDateTime.
+ Demonstrates composition (Contact has PhoneNumber and EmailAddress).
+ Supports multiple phone numbers and email addresses using List collections.
+ Each user maintains a personal ContactRepository.
+ Encapsulates contact data inside domain classes.
+ Uses polymorphism through getContactType().
+ Designed for future extension (update, delete, search contacts).
