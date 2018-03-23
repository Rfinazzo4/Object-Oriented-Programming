/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class TestEC {
    public static void main(String[] args) {
        Broadcaster b = new Broadcaster(); 
        Reciever r1 = new Reciever("First"); 
        Reciever r2 = new Reciever("Second"); 
        b.register(r1);
        b.register(r2); 
        b.broadcast("Hello world!");
    }
}
