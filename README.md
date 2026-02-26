# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-02: User Authentication – 26.02.2026

+ Allows registered users to log in using email and password.
+ Uses Authentication interface to define login behavior.
+ BasicAuth class implements authentication using polymorphism.
+ Passwords are hashed using SHA-256 (MessageDigest).
+ Optional<User> is used to safely handle login results.
+ UserRepository simulates database storage using HashMap.
+ SessionManager maintains the currently logged-in user.
+ Ensures passwords are never stored in plain text.
+ Demonstrates abstraction, encapsulation, and interface usage.
+ Designed to support future authentication methods like OAuth.
