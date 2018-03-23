/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class RentalCarFactory {
    
    public static RentalCar rent(int val){
        if (val < 2){
            return new YamahaMotorcycle("Yamaha Motorcycle",val);
        }
        else if(val >1 && val < 5){
            return new ToyotaCorolla("Toyota Corolla",val);
        }
        else if(val==5){
            return new FordEscapeHybrid("Ford Escape Hybrid",val);
        }
        else{
            return new DodgeMinivan("Dodge Minivan",val);
        }
    }
}
