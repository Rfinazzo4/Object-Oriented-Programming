/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueastbay.example1;

/**
 *
 * @author Ryanfinazzo
 */
public class Wolf extends Animal{

    public Wolf() {
        super("wolfy");
    }

    @Override
    public String getFightingSound() {
        return "Howl!";
    }
    
}
