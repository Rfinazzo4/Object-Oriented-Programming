/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class AppleMacbook extends Computer{

    public AppleMacbook(String myMac, int i) {
       super(myMac, i);
    }
   
    @Override
    public String getOperatingSystem(){
        return "(running OS X)";
    }

    @Override
    public String getSummary() {
        return this.getName() + " " + getOperatingSystem()+ " with storage = " +this.getStorage();
    }
    
    
}
