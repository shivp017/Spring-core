package com.stackroute.Domain;

public class Surveyor {
    public String getName() {
        return name;
    }
    public Surveyor(){}

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int id;

    public Surveyor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Surveyor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
