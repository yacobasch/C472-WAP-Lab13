
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.model;

import java.time.LocalDate;

public class CreditCard {

    private String card;
    private String ccv;
    private String address;
    private String zip;
    private LocalDate expdate;

    public CreditCard(){

    }

    public CreditCard(String card, String ccv, String address, String zip, LocalDate expdate) {
        this.card = card;
        this.ccv = ccv;
        this.address = address;
        this.zip = zip;
        this.expdate = expdate;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public LocalDate getExpdate() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
        this.expdate = expdate;
    }
}
