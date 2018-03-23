/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
class EpsonPrinter extends Computer implements Printer{

    public EpsonPrinter(String myEpson, int i) {
        super(myEpson, i);
    }
    @Override
     public String getOperatingSystem(){
        return "(running on Linux)";
    }

    @Override
    public void print(String jobName, int numPages) {
       for(int i=1; i<=numPages;i++){
           System.out.println("Printing page " + i+ " of "+jobName);
       }
        
    }

    @Override
    public void scan(String jobName, int numPages, Computer comp) {
        System.out.println("Scanning "+ numPages + " pages of " + jobName + " to "+ comp.getName());
    }
    
    @Override
    public String getSummary() {
        return this.getName() + " " + getOperatingSystem()+ " with storage = " +this.getStorage();
    }
}
