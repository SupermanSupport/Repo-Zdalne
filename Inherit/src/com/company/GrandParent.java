package com.company;


public class GrandParent {

    public void walk() {
        System.out.println("GrandParent walk.idzie jako");
    }

    public void run() {
        System.out.println("GrandParent run.zasuwa ");
    }

    public void eat() { // NOTE: never called unless called directly on the GrandParent instance
        System.out.println("GrandParent eat.pochlania");
    }
}