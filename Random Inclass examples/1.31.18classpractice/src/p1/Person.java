/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author Ryanfinazzo
 */
public class Person implements Comparable{
    private int Age;
    private String name;
    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.getAge() - p.getAge();
    }
    
    private int getAge(){
      
        return Age;
}
    public String toString(){
        return name;
    }
}