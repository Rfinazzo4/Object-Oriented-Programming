/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;


import java.util.Arrays;
/**
 *
 * @author Ryanfinazzo
 */
public class Test2 {
    public static void main(String [] args){
        Person[] people = new Person[]{
            new Person("Jane", 29);
            new Person("Joey", 29);
            new Person("Jackle", 29);
            new Person("Jerry", 37);      
        };
    
    Arrays.sort(people);
    
    for (Person p: people){
            System.err.println(p);
}
    }
}
