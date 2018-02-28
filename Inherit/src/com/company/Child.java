package com.company;

class Child extends Parent {
    @Override
    public void walk() {
        super.walk();   // calls walk in parent (in this case Parent)
        System.out.println("Child walk.");
    }

    @Override
    public void run() {
        super.run();    // calls run in parent (since Parent does not have it, in this case parent is GrandParent)
        System.out.println("Child run.");
    }
}
