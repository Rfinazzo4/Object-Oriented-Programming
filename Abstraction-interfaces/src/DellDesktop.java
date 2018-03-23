/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
class DellDesktop extends Computer{

    public DellDesktop(String myDell, int i) {
        super(myDell, i);
    }
    @Override
    public String getOperatingSystem(){
        return "(running on Windows)";
    }
    @Override
    public String getSummary() {
        return this.getName() + " " + getOperatingSystem()+ " with storage = " +this.getStorage();
    }
}
