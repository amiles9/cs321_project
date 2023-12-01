package com.example;

import java.util.HashMap;

public class Form{
    static int idCounter = 1;
    static HashMap<Integer, Form> forms = new HashMap<>();
    private int id;
    private String status;
    private String immigrantFirstName;
    private String immigrantLastName;
    private String immigrantAlienNumber;
    private String relativeFirstName;
    private String relativeLastName;
    private String relativeAlienNumber;
    private String email;

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

    public static Form getForm(int id){
        return forms.get(id);
    }

    public boolean updateDatabase(){
        return true;
    }
}