/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public abstract class Computer implements ElectronicDevice{
    private String name;
    private int storage;
    private Printer p;

    public Computer(String name, int storage) {
        this.name = name;
        this.storage = storage;
    }
    
    public void setPrinter(Printer p){
        this.p=p;
    }
    public void scan (String name, int val){
        p.scan(name,val,this);
    }
    public void print (String name, int val){
        p.print(name,val);
    }
    
    public String getName(){
        return this.name;
    }
    public int getStorage(){
        return this.storage;
    }
    
    public void save(int storage){
        this.storage=this.storage-storage;
    }
    
    public abstract String getOperatingSystem();

   
    public String getSummary(){
        return this.name + " with storage ="+this.storage;
        
    }
    
    
    
}
