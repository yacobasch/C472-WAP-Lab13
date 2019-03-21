
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.model;

import java.time.LocalDate;

public class User {
    private String name;
    private String usernName;
    private String password;
    private String email;
    private LocalDate dob;
    private CreditCard creditCard;

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public User(){}

    public User( String usernName, String password) {
        this.usernName = usernName;
        this.password = password;
    }

    public User(String usernName, String password, String email) {
        this.usernName = usernName;
        this.password = password;
        this.email = email;
    }

    public User( String name, String usernName, String password, String email, LocalDate dob, CreditCard creditCard) {
        this.name = name;
        this.usernName = usernName;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.creditCard = creditCard;
    }

    public User( String name, String usernName, String password, String email, LocalDate dob) {
        this.name = name;
        this.usernName = usernName;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsernName() {
        return usernName;
    }

    public void setUsernName(String usernName) {
        this.usernName = usernName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

}
