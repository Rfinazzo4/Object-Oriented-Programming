/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class Person implements Audible, Greetable{

    @Override
    public String makesound() {
        return "Hello";
    }

    @Override
    public String sayGreeting() {
        return "Grettings!";
    }
    
}
