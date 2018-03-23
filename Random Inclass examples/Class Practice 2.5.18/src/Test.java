/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryanfinazzo
 */
public class Test {
    
    public static void main(String[] args){
       
        calcPaymentsTrhow(5000, 0);
        
        try{
            calcPayments(5000, 0);
        }catch(Exception e){
            System.err.println("Hold up there is a problem");
        }
        
        int[] stuff = new int[3];
        for (int i=0; i<10; i++){
            stuff[i]=i;
        }
    }
      private static void calcPayments(int amt, int d) {
          okReallycalcPayments(amt, d);
      }

    private static void okReallycalcPayments(int amt, int d) {
        int perPeriod = amt/d;
        System.out.println(
                "Need to pay per period : " +  perPeriod);
    }
    
    
    private static void calcPaymentsBetter(int amt, int d){
        if (d<1){
            System.err.println("Bad # of days: " + d);
        }
        else {
            int perPeriod = amt /d;
            System.err.println("Need to pay ");
        }
    }
    private static void calcPaymentsthrow(int amt, int d){
        if (d<1){
            throw new RuntimeException("Bad # of days:"+d)
        }
        else {
            int perPeriod = amt /d;
            System.err.println("Need to pay ");
        }
    }
}
