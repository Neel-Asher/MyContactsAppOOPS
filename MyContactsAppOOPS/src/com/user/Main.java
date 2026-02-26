package com.user;
/*
 * This module implements user registration for MyContactsApp.
 * User provides: email, password, first name, last name, and user type (FREE or PREMIUM).
 * Input is validated using regex (email format) and basic rules (minimum password length, non-empty fields).
 * Invalid input throws a custom InvalidUserDataException.
 * An abstract User class defines common attributes and behavior.
 * FreeUser and PremiumUser extend User using inheritance.
 * PremiumUser includes a premium flag to distinguish premium accounts. 
 * The Main class handles console input, validation, object creation, and displays the registration result.
 * 
 * @author Neel Asher
 * @version 2.0
 */
import java.util.Optional;
import java.util.Scanner;
import com.user.auth.Authentication;
import com.user.auth.BasicAuth;
import com.user.encryption.PasswordHashing;
import com.user.exception.InvalidUserDataException;
import com.user.model.FreeUser;
import com.user.model.PremiumUser;
import com.user.model.User;
import com.user.repository.UserRepository;
import com.user.session.SessionManager;
import com.user.Validation.Validator;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserRepository repository = new UserRepository();
        Authentication auth = new BasicAuth(repository);
        SessionManager session = new SessionManager();

        while (true) {

            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(sc.nextLine());

            try {
                if (choice == 1) {
                    System.out.print("Enter first name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Enter last name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    System.out.print("Enter user type (free/premium): ");
                    String typeInput = sc.nextLine().toLowerCase();

                    Validator.validate(email, password, firstName, lastName);

                    String hashedPassword = PasswordHashing.hashPassword(password);

                    User user;

                    if (typeInput.equals("free")) {
                        user = new FreeUser(email, hashedPassword, firstName, lastName);
                    } else if (typeInput.equals("premium")) {
                        user = new PremiumUser(email, hashedPassword, firstName, lastName);
                    } else {
                        throw new InvalidUserDataException("Invalid user type.");
                    }

                    repository.save(user);

                    System.out.println("Registration Successful!");

                } else if (choice == 2) {
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    Optional<User> loggedInUser = auth.login(email, password);

                    if (loggedInUser.isPresent()) {
                        session.login(loggedInUser.get());
                        System.out.println("Login Successful!");
                        System.out.println("Welcome " + session.getCurrentUser().getFirstName());
                    } else {
                        System.out.println("Invalid credentials.");
                    }

                } else if (choice == 3) {
                    System.out.println("Exiting...");
                    break;
                }
            } catch (InvalidUserDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}