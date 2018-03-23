
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
public class PowerSource {
    private List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
            
    public void attach(ElectronicDevice dev){
        devices.add(dev);
    }
    
    public void printInventory(){
        System.out.println("=== INVENTORY===");
        for (ElectronicDevice i : devices){
            System.out.println(i.getSummary());
        }
    }
    
}
