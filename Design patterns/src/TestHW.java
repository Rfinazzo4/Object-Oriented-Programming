/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class TestHW {
    public static void main(String[] args) {
       for (int i=1; i<7; i++) {
        RentalCar car = RentalCarFactory.rent(i); 
        System.out.println("Car that holds " + i + " people: "+car); 
       }
    }
   
}
