package com.divyanshu.SingleResponsiblility.SRP;

import com.divyanshu.SingleResponsiblility.Product;

import java.util.ArrayList;
import java.util.List;

public class SRP_Followed {
    private List<Product> products= new ArrayList<>();

    public List<Product> getProduct() {
        return products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculate total
    public double calculateTotal(){
        double total=0;
        for(Product product:products){
            total += product.getPrice();
        }
        return total;
    }
}

//2nd Functionality

class PrintInvoice {
    private final SRP_Followed cart;
    public PrintInvoice(SRP_Followed cart)
    {
        this.cart = cart;
    }
    // 2nd responsibility
    public void printInvoice(){
        System.out.println("Invoice Details:");
        for(Product p:cart.getProduct()){
            System.out.println(p.getName()+" - Rs"+p.getPrice());
        }
        System.out.println("Total Rs. "+ cart.calculateTotal());
    }
}
//3rd Functionality

class SavetoDB
{
    private final SRP_Followed cart;
    public SavetoDB(SRP_Followed cart)
    {
        this.cart = cart;
    }
    // 2nd responsibility
    public void saveInvoice(){
        System.out.println("Invoice saved to database");
    }
}

class Main{
    public static void main(String[] args) {
        SRP_Followed sc1 = new SRP_Followed();
        sc1.addProduct(new Product("HP Omen 15",100000,"Laptops","Intel i7 13th Gen, 4050 RTX 6 GB GPU"));
        sc1.addProduct(new Product("Lenovo Legion i5",150000,"Laptops","Intel core 7, 5060 RTX 8 GB GPU"));
        sc1.calculateTotal();

        PrintInvoice p = new PrintInvoice(sc1);
        SavetoDB s = new SavetoDB(sc1);
        p.printInvoice();
        s.saveInvoice();
    }
}
