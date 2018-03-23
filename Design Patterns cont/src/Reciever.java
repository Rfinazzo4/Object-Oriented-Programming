/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class Reciever {
    private String name;
    
    public Reciever(String var) { //set name
        this.name =var;
    }
    public void receive(String message){ //print message received with name
        System.out.println(name+" received: "+message);
    }
    
}
