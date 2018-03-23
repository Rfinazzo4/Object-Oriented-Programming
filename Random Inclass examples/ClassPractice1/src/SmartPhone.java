/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class SmartPhone {

    private int weight;
    private String manufacturer;

    SmartPhone(int weight, String manufacturer) {
        
        if (weight < 0) {
            throw new RuntimeException("your phone is too light!");
        }else{
            this.weight = weight;
        }
        
        if (manufacturer != null) {
            switch (manufacturer) {
                case "Samsung":
                case "Apple":
                case "Other":
                    break;
                default:
                    throw new RuntimeException("unknown manufacturer");
            }
        }
    }
    public static SmartPhone mkSmartPhone(int w, String m){
        try{
            return new SmartPhone(w,m);
        }catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
        return null;
    }
        
 public static void main(String[] args) {
        SmartPhone s = null;

        s = new SmartPhone(5, "Samsung");
      
        s = new SmartPhone(-9, "Apple");

        s = new SmartPhone(2, "Foofoo");
    }

}
