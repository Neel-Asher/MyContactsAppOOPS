# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-03: Profile Management – MyContactsApp

+ Allows a logged-in user to update profile details and manage account settings.
+ Users can update first name and last name with validation inside the User class.
+ Password change requires old password verification and uses SHA-256 hashing.
+ Introduces a Preferences class for managing user settings.
+ Demonstrates composition (User has-a Preferences).
+ Preferences include options like Dark Mode and Email Notifications.
+ Validation logic is encapsulated within domain classes.
+ Session-based access ensures only logged-in users can modify data.
+ Reinforces encapsulation and controlled state mutation.
+ Designed for scalability to support additional user settings in future.
