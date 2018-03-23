/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

public class BankAccount {
    private String ID;
    private String owner;
    private Date dateCreated;
    private boolean active;
    private double balance;
    public static long ONE_DAY_MS = 24 * 60 * 60 * 1000;
    
    public static void main(String[] args) {
        long fiveDaysAgo = new Date().getTime() - (ONE_DAY_MS * 5); 
        BankAccount acct1 = new BankAccount("X12387", "Jane Smith"); 
        BankAccount acct2 = new BankAccount("Y08911", "Fred Jones", new Date(fiveDaysAgo), 4000.75);
        acct2.setActive(false); acct1.setOwner("Janet Smith"); acct2.deposit(2000); acct1.withdraw(50); acct2.transfer(135.25, acct1);
        System.out.println(acct1 + ", member for " + acct1.daysMember() + " days");
        System.out.println(acct2 + ", member for " + acct2.daysMember() + " days");
}
    
    public BankAccount(String Id, String own){
        this(Id, own, new Date(), 100);
    }
    public BankAccount(String Id, String own, Date date, double bal){
        active=true;
        this.ID =Id;
        this.owner =own;
        this.balance=bal;
        this.dateCreated = date;
    }

    public String getID() { //ID getter
        return ID;
    }

    public Date getDateCreated() { //Datecreated getter
        return dateCreated;
    }

    public double getBalance() { //Balance getter
        return balance;
    }

    public String getOwner() { //Owner getter
        return owner;
    }

    public void setOwner(String own) { //Owner setter
        this.owner = own;
    }

    public boolean isActive() { //Active check(getter)
        return active;
    }

    public void setActive(boolean bool) { //Activesetter
        this.active = bool;
    }
   
    public void deposit(double amt){ //adds an amount to the balance
        balance =balance + amt;
    }
    public void withdraw(double amt){ //subtracts an amount to the balance
        balance =balance - amt;
    }
    
    public void transfer (double amt, BankAccount target){
       //transfer the amount from one account to targert account
        this.withdraw(amt);
       target.deposit(amt);
    }
    
    public double daysMember(){ 
    //calculates the amount of days an account has been open 
        long time =  new Date().getTime() - dateCreated.getTime();
        double t=time;
        return t;
    }
    
    public String toString(){
        //prints out in requested format
    return "BankAccount: Id= "+ getID()+ ", owner= "+ getOwner()+", date= "+
            getDateCreated()+ ", active= "+this.active+", balance= " +
                    getBalance()+"}";
    }
    
    
    
    
    
}
