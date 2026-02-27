# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-07: Delete Contact - 27.02.2026

+ Allows a logged-in user to remove a contact from their contact list.
+ User selects a contact from the displayed list of saved contacts.
+ System prompts for confirmation before deletion.
+ Contact is permanently removed using the repository delete() method (hard delete).
+ Exception handling ensures errors are managed if the contact does not exist.
+ Demonstrates lifecycle management of entities (create → update → delete).
+ Prevents accidental deletion through confirmation dialog.
+ Maintains separation of concerns via repository pattern.
+ Illustrates the concept of hard delete vs soft delete in system design.
+ Ensures safe and controlled removal of contact data.
