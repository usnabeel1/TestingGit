package com.company;

public class Family {

    private String Firstname;
    private String LastName;
    private String MiddleName;

    public Family(String firstname, String lastName, String MiddleName)
    {
        this.Firstname = firstname;
        this.LastName = lastName;
        this.MiddleName = MiddleName;
    }

    public String Get_FirstName()
    {
        return Firstname;
    }

    public String Get_LastName()
    {
        return LastName;
    }
    public String Get_MiddleName()
    {
        return MiddleName;
    }
}// usnabeel1 edited and added Methods for MiddleName
