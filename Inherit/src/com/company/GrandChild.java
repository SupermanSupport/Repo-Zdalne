package com.company;


class GrandChild extends Child {
    @Override
    public void walk() {
        System.out.println("GrandChild walk before super.walk()");
        super.walk(); // calls walk in parent (in this case Child)
        System.out.println("GrandChild walk after super.walk()");
    }
}
