/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class RentalCar {
    private String name;
    private int num;
    
    public RentalCar(String name, int num){
        this.name=name;
        this.num=num;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
