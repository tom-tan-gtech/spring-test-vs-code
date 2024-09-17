package com.tomtan.spring_test_vs_code;

public class Address {
    private String address;

    public Address(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return address;
    }
}
