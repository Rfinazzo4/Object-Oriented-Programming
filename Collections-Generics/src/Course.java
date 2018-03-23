
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class Course implements Comparable{

    private String title;
    private String prof;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
    
    public Course(String title, String prof) {
        this.title = title;
        this.prof = prof;
    }
    
    public Course(Course c) {
         this.title=c.getTitle();
         this.prof=c.getProf();
    }
    public Course(){};
    
    @Override
    public int compareTo(Object o){
        Course second = (Course) o;
        return this.getTitle().compareTo(second.getTitle());
    }
}
