/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public interface Printer extends ElectronicDevice{
    
    void print(String jobName, int numPages);
    
    void scan(String jobName, int numPages, Computer comp); //reference for a computer
}
