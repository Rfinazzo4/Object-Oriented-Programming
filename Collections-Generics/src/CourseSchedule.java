
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CourseSchedule extends Course{
    private String student;
    public Set<Course> courses=new TreeSet<Course>();

    public CourseSchedule(String student) {
        this.student = student;
        
    }
  
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Set<Course> getCourses() {
        return courses;
    }
    
    public void display(){
        Iterator i = courses.iterator();
        System.out.println("=== Schedule for " + this.student + " ===");
        
        while(i.hasNext()){
            Course var= (Course) i.next();
            System.out.println("Course: "+var.getTitle()+", Instructor: "+var.getProf());
        }
        System.out.println("");
    }

    public void add(Course course) {
        courses.add(course);
    }    
}
