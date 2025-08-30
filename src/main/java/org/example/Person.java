package org.example;

public class Person {
    public String firstname;
    public String lastName;
    public int age;
    public String element;
    public String favColor;
    public boolean isAvatar;

    public Person(String firstname, String lastName, int age){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String element, String favColor, boolean isAvatar){
        this(firstname, lastName, age);
        this.element = element;
        this.favColor = favColor;
        this.isAvatar = isAvatar;
    }

    public String getFirstName(){
        return this.firstname;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        if(this.age >= 13 && this.age <= 19){
            return true;
        } else {
            return false;
        }
    }
}

