/*
  Product class for POS
*/
package com.mycompany.posproject;

import java.util.Scanner;

public class Product {
    
    double price;
    String name;
    int stock;
    int quantity;
    
    Product(double price, String name, int stock) {
        this.price = price;
        this.name = name;
        this.stock = stock;
    }
    
    void purchaseItem() {
       
        
        Scanner Purchase = new Scanner(System.in);
        System.out.println(name + "\n" + "Stock: " + stock + "\n" + "Price: P" + price + "\n");
        if (stock > 0) {
        System.out.println("Would you like to purchase " + name + "? (Y/N)");
            char y = Purchase.next().charAt(0);
            if (y == 'y' || y == 'Y') {
                System.out.println("How many " + name + " would you like to purchase?");
                quantity = Purchase.nextInt();
                if (quantity > stock) {
                    System.out.println("Sorry, we only have " + stock + " " + name);
                }
                else if (quantity <= stock) {
                    System.out.println("You have purchased x" + quantity + " of " + name + " for P" + Math.round((quantity * price)*100)/100.0);
                    stock -= quantity;
                }
            }
        }
        else if (stock < 0) {
            System.out.println("This product is out of stock!");
        }
    }
    
    
}
