
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
class Registrar {

    private List<CourseSchedule> listReg;   
    
    public void register(CourseSchedule name) {
        listReg.add(name);
    }

    public void deRegister(String name) {
        CourseSchedule var = null;
        for (CourseSchedule i : listReg){
            if(i.getStudent().equals(name)){
                var=i;
            }
        }
        listReg.remove(var);
    }

    @Override
    public String toString(){
      return"########## REGISTRATION SUMMARY ##########";
        
    }
    
    void display() {
        
        System.out.println(this.toString());
        
        for (CourseSchedule i : listReg){
            i.display();
        }
        
    }
    public Registrar(){
        listReg = new ArrayList<CourseSchedule>();
    }
}
