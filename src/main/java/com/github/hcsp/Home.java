package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat cat1;
    public static Cat cat2;

    public static void main(String[] args) {
        createTwoCats();
        // We want to create two cats, not one cat with two references
        // Fix createTwoCats() method to make the problem output "1: Cat(Tom), 2: Cat(Tom),
        // cat1==cat2: false"

        System.out.println("1: " + cat1 + ", 2:" + cat2 + ", cat1==cat2: " + (cat1 == cat2));
    }

    public static void createTwoCats() {
        cat1 = new Cat("Tom");
        cat2 = new Cat("Tom");
    }
}
