package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- GrandChild ---");
        GrandChild grandChild = new GrandChild();
        grandChild.walk();
        grandChild.run();
        grandChild.eat();
        System.out.println(); // NOTE: prints empty line

        System.out.println("--- Child ---");
        Child child = new Child();
        child.walk();
        child.run();
        child.eat();
        System.out.println();

        System.out.println("--- Parent ---");
        Parent parent = new Parent();
        parent.walk();
        parent.run();
        parent.eat();
        System.out.println();


        System.out.println("--- GrandParent ---");
        GrandParent grandParent = new GrandParent();
        grandParent.walk();
        grandParent.run();
        grandParent.eat();
        System.out.println();

    }
}