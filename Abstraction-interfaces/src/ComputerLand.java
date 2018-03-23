/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */

public class ComputerLand {
public static void main(String[] args) {
Computer mac = new AppleMacbook("MyMac", 1000); 
Computer dell = new DellDesktop("MyDell", 500);
Printer epson = new EpsonPrinter("MyEpson", 2); 
PowerSource source = new PowerSource();
source.attach(mac); 
source.attach(dell); 
source.attach(epson);
mac.setPrinter(epson); 
dell.setPrinter(epson);
mac.scan("Passport application", 10);
mac.print("Story", 5);
dell.scan("Taxes", 25);
dell.print("License agreement", 2);
source.printInventory();
} 
}
