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
    private String immigrantLastName;
    private String immigrantAlienNumber;
    private String relativeFirstName;
    private String relativeLastName;
    private String relativeAlienNumber;
    private String email;

    // Getter methods for accessing form attributes
    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
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

    // Static method to retrieve a form by ID
    public static Form getForm(int id){
        if (!isInteger(id)) {
            throw new IllegalArgumentException("Invalid argument: id must be an integer");
        }

        return forms.get(id);
    }

    // Method for updating the database (placeholder implementation)
    public boolean updateDatabase(){
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