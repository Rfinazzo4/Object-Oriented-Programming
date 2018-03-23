
package edu.csueastbay.example1;


public class Test {
    
    public static void main(String[] args) {
    Dove d = new Dove();
    Wolf w = new Wolf();
    //Hi, im a Dove and my fighting sound is "chirp"
    System.out.println("");
    out(d);
    //Hi im a wolf and my fighting sound is "howl"
    out(w);
    
}
    
   
    private static void out(Animal a) {
        System.out.println("Hi, i'm a " + a.getAnimalType() + ", and my fighting "
                + "sound is " + a.getFightingSound());
    }
            
}
