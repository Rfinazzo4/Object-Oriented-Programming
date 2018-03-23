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
public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[]{
          new Movie("Vertigo");
          new Movie("Star Wars");
          new Movie("Dark Knight");
        };
    for (Movie m : movies){
            System.err.println("m");
    }
    
    Arrays.sort(movies);
    
    for (Movie m : movies){
            System.err.println("m");
    }
}
