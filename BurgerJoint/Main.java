package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", .75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("price is " + hamburger.itemizeHamburger());

        HealthyHamburger healthyHamburger = new HealthyHamburger("bacon", 5.67);
        healthyHamburger.addHamburgerAddition1("lettuce", .75);
        healthyHamburger.addHealthAddition1("lentils", 3.41);
        System.out.println( healthyHamburger.itemizeHamburger());


    }
}
