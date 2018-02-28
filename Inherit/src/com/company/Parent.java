package com.company;

class Parent extends GrandParent {

    public void walk() {
        super.walk();   // calls walk in parent (in this case GrandParent)
        System.out.println("Parent walk.");
    }

    @Override
    public void eat() {
        System.out.println("Parent eat without calling super.eat()");
    }
}