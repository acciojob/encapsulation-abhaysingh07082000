package com.driver;

public class RWOnly {
    private String name;
    public RWOnly(){}
    public RWOnly(String name)
    {
        this.name=name;
    }
    String display()
    {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
