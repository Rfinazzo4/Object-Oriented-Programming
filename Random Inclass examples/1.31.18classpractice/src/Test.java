/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class Test {
    public static void main(String[] args) {
        Dog a = new Dog();
        System.out.println(a.makesound());
       
        Car b = new Car();
        System.out.println(b.makesound());
        
        Person c = new Person();
        System.out.println(c.makesound());
        System.out.println(c.sayGreeting());
        
    }
}
