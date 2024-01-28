// Main file for the project

package com.mycompany.posproject;

public class POSProject {

    public static void main(String[] args) {
        Product Opium = new Product(4.99, "Opium", 10);
        Opium.purchaseItem();
        System.out.println("The shop now has " + Opium.stock + " amount of " + Opium.name + " left!");
    }
}
