/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

/**
 *
 * @author Ryanfinazzo
 */
public class Func {
    
    public static void main(String[] args){
            System.out.println("in main");
            myfunc();
            System.out.println("finishing");
    }
    private static void myfunc() {
        System.out.println("in myfunc");
        yourfunc();
    }

    private static void yourfunc() {
    System.out.println("in youfunc");
    }
}
