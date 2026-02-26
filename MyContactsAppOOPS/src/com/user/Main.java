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
 * @version 1.0
 */
import java.util.Scanner;
import com.user.exception.InvalidUserDataException;
import com.user.model.FreeUser;
import com.user.model.PremiumUser;
import com.user.model.User;
import com.user.Validation.Validator;

// main class, start of execution
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
        	// get registration details from user
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
            
            // validate all fields
            Validator.validate(email,password,firstName,lastName);
            User user;
            
            // check if user type is free or premium
            if (typeInput.equals("free")) {
                user = new FreeUser(email,password,firstName,lastName);
            } else if (typeInput.equals("premium")) {
                user = new PremiumUser(email,password,firstName,lastName);
            } else {
                throw new InvalidUserDataException("Invalid user type.");
            }
            
            // display registration details
            System.out.println("\nRegistration Successful!");
            System.out.println("Name: "+user.getFirstName()+" "+user.getLastName());
            System.out.println("Email: "+user.getEmail());
            System.out.println("User Type: "+user.getUserType());

        } catch (InvalidUserDataException e) {
            System.out.println("Registration Failed! "+e.getMessage());
        }
    }
}