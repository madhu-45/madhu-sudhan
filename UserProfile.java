package com.example.android.logindemo;
//this is the model class.
public class UserProfile {
    public String orderid1;
    public String orderid2;

    public UserProfile(){
    }

    public UserProfile(String orderid1, String orderid2) {
        this.orderid1 = orderid1;
        this.orderid2 = orderid2;
    }

    public String getorderid1() {
        return order1;
    }

    public void setorderid1(String orderid1) {
        this.orderid1 = orderid1;
    }

    public String getorderid2(String orderid2) {
        return orderid2;
    }

    public void setorderid2(String orderid2) {
        this.orderid2 = orderid2;
    }
}
