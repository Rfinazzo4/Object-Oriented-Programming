/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class Product {
    private String name;
    private String price;

    public Product(String name, String price) {
        if (name==null || name.length()<2){
            throw new RuntimeException ( "Inappropriate product name");
        }
        if (price<0.01){
            throw new RuntimeException( "Inappropriate price");
        }
        this.name = name;
        this.price = price;
    }
    
}
