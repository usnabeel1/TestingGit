package com.company;

public class Family {

    private String Firstname;
    private String LastName;

    public Family(String firstname, String lastName)
    {
        this.Firstname = firstname;
        this.LastName = lastName;
    }

    public String Get_FirstName()
    {
        return Firstname;
    }

    public String Get_LastName()
    {
        return LastName;
    }
}
