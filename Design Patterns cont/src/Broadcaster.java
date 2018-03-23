
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class Broadcaster { //Broadcaster is subject
    private List<Reciever> list =new ArrayList<Reciever>(); //create list of observers
    void register(Reciever number) { 
        list.add(number); //add observer to list
    }

    void broadcast(String str) {
        //call receive for each observer in list
        for (Reciever i : list){
            i.receive(str);
        }
    }
    
}
