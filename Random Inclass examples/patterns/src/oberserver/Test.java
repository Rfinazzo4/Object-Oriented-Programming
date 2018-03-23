/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oberserver;

/**
 *
 * @author Ryanfinazzo
 */
public class Test {

    public static void main(String[] args) {
        MailingList myList = new MailingList();
        Recipient r1 = new Recipient("jane");
        Recipient r2 = new Recipient("Jon");
        myList.register(r1);
        myList.register(r1);
        myList.announce("Food is here!");

    }
}
