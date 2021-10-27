package com.company;

public class Dead_FLAME {
    private String name;
    private String surname;
    private String middle;

    public Dead_FLAME (String name, String surname, String middle) {
        this.name = name;
        this.surname = surname;
        this.middle = middle;


    }
    @Override
    public String toString () {
        return "name: " + name  + "\n" +
                "surname: " + surname + "\n" +
                "middle: " + middle + "\n";
    }

}
