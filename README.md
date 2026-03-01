# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-12: Apply Tags to Contacts = 01.03.2026

+ Actor: Logged-in User
+ User assigns one or multiple tags to a contact
+ Association class ContactTag manages Contact–Tag relationship
+ Supports many-to-many bidirectional mapping
+ Tag maintains reference to associated contacts
+ Contact maintains reference to assigned tags
+ Set operations used for add/remove tag management
+ Ensures bidirectional consistency when assigning/removing tags
+ Prevents duplicate tag assignments using Set
+ Demonstrates association modeling and relationship management in OOP
