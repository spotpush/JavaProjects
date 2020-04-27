package com.spotpush.users;
/**
 * Model class holding getters, setters and properties
 *
 * @author Stephen Hardy @ spotpush.com
 */
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class UserDetails {

    private final IntegerProperty id;
    private final StringProperty name;
    private final StringProperty email;
    private final StringProperty country;

    /**
     * Default Constructor
     *
     * @param id
     * @param name
     * @param email
     * @param country
     */
    public UserDetails(Integer id, String name, String email, String country) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.country = new SimpleStringProperty(country);
    }

    /**
     * Getters
     * @return 
     */
    public int getId() {
        return id.get();
    }
    
    public String getName() {
        return name.get();
    }

    public String getEmail() {
        return email.get();
    }

    public String getCountry() {
        return country.get();
    }

    /**
     * Setters
     * @param value
     */
    public void setId(int value) {
        id.set(value);
    }
    
    public void setName(String value) {
        name.set(value);
    }

    public void setEmail(String value) {
        email.set(value);
    }

    public void setCountry(String value) {
        country.set(value);
    }
    
    
    /**
     * Property Values
     * @return 
     */
    public IntegerProperty idProperty() {
        return id;
    }
    
    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty emailProperty() {
        return email;
    }

    public StringProperty countryProperty() {
        return country;
    }
       
    public static void main(String[] args) {

    }
}
