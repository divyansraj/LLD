package com.divyanshu.SolidPrinciples.SingleResponsiblility.SRP_NotFollowed;

import com.divyanshu.SolidPrinciples.SingleResponsiblility.Product;

import java.util.ArrayList;
import java.util.List;

public class SRP_NotFollowed {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
    // 1st responsibility
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // 2nd responsibility
    public void printInvoice(){
        System.out.println("Invoice Details:");
        for(Product product : products){
            System.out.println(product.getName()+" - Rs. "+ product.getPrice());
        }
        System.out.println("Total Price:"+ calculateTotal());
    }

    // 3rd responsibility
    public void saveInvoice(){
        System.out.println("Invoice saved to database");
    }
}
class Main {
    public static void main(String[] args) {
        SRP_NotFollowed sc1 = new SRP_NotFollowed();
        sc1.addProduct(new Product("HP Omen 15",100000,"Laptops","Intel i7 13th Gen, 4050 RTX 6 GB GPU"));
        sc1.addProduct(new Product("Lenovo Legion i5",150000,"Laptops","Intel core 7, 5060 RTX 8 GB GPU"));
        sc1.printInvoice();
        sc1.saveInvoice();
    }
}
