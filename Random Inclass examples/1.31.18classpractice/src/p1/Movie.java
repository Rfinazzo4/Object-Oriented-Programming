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
public class Movie implements Comparable {
    private String title;
    
    public Movie(String title){
        this.title = title;
    }

     
    @Override
    public int compareTo(Object o) {e
        Movie m = (Movie)o;
        this.getTitle().compareTo(m.getTitle());
        return 0;
    }
}
