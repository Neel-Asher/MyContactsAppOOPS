# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-06: Edit Contact - 27.02.2026

+ Allows a logged-in user to modify existing contact information.
+ User selects a contact from their saved contact list.
+ A deep copy of the selected contact is created using a copy constructor.
+ Updates are applied to the copied object, not the original reference.
+ User can edit name, phone numbers, or email addresses.
+ Setter methods perform validation before changing state.
+ Phone and email lists are replaced using defensive copying.
+ Repository update() method replaces the old contact with the modified version
+ Prevents shallow copy issues and unintended shared references.
+ Ensures safe, controlled mutation of contact data following OOP principles.
