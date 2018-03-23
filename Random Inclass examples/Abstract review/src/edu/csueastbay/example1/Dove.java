
package edu.csueastbay.example1;


public class Dove extends Animal{
    public Dove(){
        super("dove");
    }
        

    @Override
    public String getFightingSound() {
        return "Chirp!";
    }
    
}
