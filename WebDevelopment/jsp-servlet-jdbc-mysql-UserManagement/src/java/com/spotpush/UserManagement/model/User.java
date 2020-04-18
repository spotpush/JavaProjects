/**
* Model a user entity in the database
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.UserManagement.model;

public class User {

    /**
     * protected allows access within its own package and subclasses of 
     * its class from other packages as opposed to private
    */
    protected int id;
    protected String name;
    protected String email;
    protected String country;
    
    /**
     * Allows easy instantiation of User
     * And prevent constructors with parameters (as specified below) 
     * to over-wright/remove the default constructor should it not
     * be implemented explicitly 
    */
    public User() {} 
    
    public User(String name, String email, String country) {
        super();
        this.name=name;
        this.email=email;
        this.country=country;
    }
    
    public User(int id, String name, String email, String country) {
        super();
        this.id=id;
        this.name=name;
        this.email=email;
        this.country=country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
        
}
