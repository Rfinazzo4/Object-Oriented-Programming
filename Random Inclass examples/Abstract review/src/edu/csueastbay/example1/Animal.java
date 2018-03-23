
package edu.csueastbay.example1;


public abstract class Animal {
    private String animalType;
    
    public Animal(String animalType){
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }
    
    public abstract String getFightingSound();
    
}
