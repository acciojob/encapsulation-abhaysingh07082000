package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r1=new RWOnly("abhay");
        System.out.println(r1.display());

        r1.setName("chandu");

        System.out.println( r1.getName());
    }
}