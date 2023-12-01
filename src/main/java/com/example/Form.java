package com.example;

import java.util.HashMap;

public class Form{
    // Static variables to manage unique IDs and store forms
    static int idCounter = 1;
    static HashMap<Integer, Form> forms = new HashMap<>();

    // Instance variables for form attributes
    private int id;
    private String status;
    private String immigrantFirstName;
    public void setImmigrantFirstName(String immigrantFirstName) {
        this.immigrantFirstName = immigrantFirstName;
    }

    private String immigrantLastName;
    public void setImmigrantLastName(String immigrantLastName) {
        this.immigrantLastName = immigrantLastName;
    }

    private String immigrantAlienNumber;
    public void setImmigrantAlienNumber(String immigrantAlienNumber) {
        this.immigrantAlienNumber = immigrantAlienNumber;
    }

    private String relativeFirstName;
    public void setRelativeFirstName(String relativeFirstName) {
        this.relativeFirstName = relativeFirstName;
    }

    private String relativeLastName;
    public void setRelativeLastName(String relativeLastName) {
        this.relativeLastName = relativeLastName;
    }

    private String relativeAlienNumber;
    public void setRelativeAlienNumber(String relativeAlienNumber) {
        this.relativeAlienNumber = relativeAlienNumber;
    }

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter methods for accessing form attributes
    public int getID() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getImmigrantFirstName() {
        return immigrantFirstName;
    }

    public String getImmigrantLastName() {
        return immigrantLastName;
    }

    public String getImmigrantAlienNumber() {
        return immigrantAlienNumber;
    }

    public String getRelativeFirstName() {
        return relativeFirstName;
    }

    public String getRelativeLastName() {
        return relativeLastName;
    }

    public String getRelativeAlienNumber() {
        return relativeAlienNumber;
    }

    public String getEmail() {
        return email;
    }

    // Constructor for creating a new form
    public Form(String immigrantFirstName, String immigrantLastName, String immigrantAlienNumber,
                String relativeFirstName, String relativeLastName, String relativeAlienNumber) {
        this.immigrantFirstName = immigrantFirstName;
        this.immigrantLastName = immigrantLastName;
        this.immigrantAlienNumber = immigrantAlienNumber;
        this.relativeFirstName = relativeFirstName;
        this.relativeLastName = relativeLastName;
        this.relativeAlienNumber = relativeAlienNumber;
        id = idCounter++;
        forms.put(id, this);
    }

    public Form(){
        
    }

    // Static method to retrieve a form by ID
    public static Form getForm(int id){
        if (id < 0) {
            throw new IllegalArgumentException("Invalid argument: id must be a positive integer");
        }

        return forms.get(id);
    }

    // Method for updating the database (placeholder implementation)
    public boolean updateDatabase(){
        forms.put(id, this);
        return true;
    }

    // Private helper method to check if a value is an integer
    private static boolean isInteger(int value) {
        try {
            Integer.parseInt(String.valueOf(value));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}