package com.rudrava;

import java.util.Locale;
import java.util.Scanner;

public class Product {
    private String name;
    private String details;
    private double price;
    private long id;

    public void getDetails() {
        System.out.println("id: " + this.id +"\nname: " + this.name  + "\ndetails: " + this.details + "\nprice " + (this.price) + "\n---------------" );
    }


    public Product( String name,String details,  double price){
        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.details = details;
        this.price = price;
    }

    public static void getDetailsByParam(long id, Product[] products) {
        for (Product product:
                products) {
            if(product.id == id)
            {
                System.out.println("id: " + product.id +"\nname: " + product.name  + "\ndetails: " + product.details + "\nprice " + (product.price) + "\n---------------" );
                return ;
            }
        }
        System.out.println("======\nNot found product\n====== \n");

    }
    public static void getDetailsByParam(String name, Product[] products) {
        for (Product product:
                products) {
            if(product.name.equals(name)){
                System.out.println("id: " + product.id +"\nname: " + product.name  + "\ndetails: " + product.details + "\nprice " + (product.price) + "\n---------------" );
                return ;
            }
        }
        System.out.println("======\nNot found product\n====== \n");
    }


    public static void main(String[] args){
    Product[] products = new Product[2];
    Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<= products.length - 1; i++) {
            String name, details;
            Double price;
            System.out.print("Enter Product name: ");
            name = scanner.next();
            System.out.print("Enter Product details: ");
            details = scanner.next();
            System.out.print("Enter Product price: ");
            price = scanner.nextDouble();
            System.out.print("---\n");
            products[i] = new Product(name, details,price);



        }
        for (Product product:
             products) {
            product.getDetails();
        }
//        get input and search
        boolean run = true;
        while(run){
            System.out.print("Enter what param you want to search for: \n1: id \n2: name\n press q to quit\n>>>");
            String option = scanner.next().toLowerCase();
            switch (option){
                case ("1"):
                    System.out.print("Enter Product id: ");
                    Long id = scanner.nextLong();
                    getDetailsByParam(id, products);
                    break;
                case ("2"):
                    System.out.print("Enter Product name: ");
                    String name = scanner.next();
                    getDetailsByParam(name, products);
                    break;
                case ("q"):
                    run = false;
                default:
                    System.out.println("Enter valid option");

            }

        }
    }
}
