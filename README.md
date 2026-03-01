# MyContactsAppOOPS
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design, design patterns, and core Java concepts through a contact management system.

## UC-01: User Registration – 26.02.2026

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

## UC-03: Profile Management – 26.02.2026

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

## UC-05: Add & View Contacts - 27.02.2026

+ Allows a logged-in user to add new contacts (Person or Organization).
+ User provides contact name, phone numbers, and email addresses.
+ Supports multiple phone numbers per contact.
+ Supports multiple email addresses per contact.
+ Each contact is assigned a unique UUID and creation timestamp.
+ Contacts are stored in the user’s ContactRepository.
+ Users can view a list of all saved contacts.
+ Users can select a contact to see full details.
+ Contact details include ID, type, name, phones, emails, and created date.
+ Feature is accessible only after successful authentication.

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

## UC-08: Bulk Operations - 27.02.2026

+ Allows a logged-in user to perform operations on multiple contacts at once.
+ User can delete selected contacts using their index numbers.
+ System supports deleting all contacts of a specific type (Person or Organization).
+ Contacts are retrieved and processed using collection operations.
+ Bulk actions are executed through repository-level methods.
+ Filtering is implemented using Predicate<Contact>.
+ Java Streams API is used for processing collections.
+ Lambda expressions enable dynamic filtering logic.
+ Method references are used for cleaner stream operations.
+ Demonstrates batch processing and functional programming concepts in Java.

## UC-09: Search Contacts - 01.03.2026

+ Allows a logged-in user to search contacts by name, phone number, email, or tags.
+ User enters a search keyword through the menu interface.
+ System checks all stored contacts for matching fields.
+ Search functionality is abstracted using a dedicated interface.
+ Different search types are handled through separate methods or classes.
+ String comparison methods like equals(), equalsIgnoreCase(), and contains() are used.
+ Iteration through collections is done using loops.
+ Conditional statements (if-else) determine matching criteria.
+ Matching contacts are displayed to the user.
+ Demonstrates abstraction, modular design, and basic string processing in Java.

## UC-10: Advanced Filtering - 01.03.2026

+ Actor: Logged-in User
+ Applies multiple filters to narrow contact results
+ Filters include tag, date added, and frequently contacted
+ Supports combining multiple filters at once
+ Uses a Filter interface hierarchy
+ Each filter type implements a common interface
+ Composite Filter pattern allows chaining filters
+ Java Streams API used for multi-level filtering
+ Comparator used for sorting by date or frequency
+ Lambda expressions and functional interfaces used for clean implementation

## UC-11: Create and Manage Tags - 01.03.2026

+ User creates custom tags to organize contacts
+ Predefined tags supported using PredefinedTag enum
+ Tag class includes validation for non-empty names
+ equals() and hashCode() implemented for uniqueness
+ Set<Tag> used to prevent duplicate custom tags
+ EnumSet<PredefinedTag> used for predefined tags
+ Many-to-many relationship between Contact and Tag
+ Defensive copies returned in getters for encapsulation
+ Follows OOP principles of encapsulation and data integrity

## UC-12: Apply Tags to Contacts - 01.03.2026

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
