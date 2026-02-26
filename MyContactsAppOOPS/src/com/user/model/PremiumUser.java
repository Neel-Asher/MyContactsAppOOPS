package com.user.model;

// child class of User -> Premium
public class PremiumUser extends User {
	
	private final boolean premium;

    public PremiumUser(String email,String password,String firstName,String lastName) {
        super(email,password, firstName, lastName);
        this.premium = true;
    }

    public boolean isPremium() {
        return premium;
    }

    @Override
    public UserType getUserType() {
        return UserType.premium;
    }
}