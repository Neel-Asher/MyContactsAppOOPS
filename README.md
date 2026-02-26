# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-01: User Registration – MyContactsApp

+ Allows new users to register with email, password, first name, and last name.
+ Implements an abstract User class for common user attributes.
+ FreeUser and PremiumUser extend User using inheritance.
+ Demonstrates encapsulation with private fields and getters.
+ Uses regex for email validation.
+ Validates password length and non-empty fields.
+ Custom InvalidUserDataException handles invalid input.
+ Password hashing implemented using SHA-256 (MessageDigest).
+ Demonstrates abstraction, inheritance, and polymorphism.
+ Designed for scalability to support additional user types.
