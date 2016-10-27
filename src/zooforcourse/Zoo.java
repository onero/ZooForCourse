/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooforcourse;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    /**
     * Adds an animal to the animals List
     *
     * @param animal
     */
    public void add(Animal animal) {
        animals.add(animal);
    }

    /**
     * Makes all the animals in the List of animals make their sound
     */
    public void allAnimalsMakeSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    /**
     * Counts the legs of the Animals by printing them out
     */
    public void countLegs() {
        int totalAmountOfLegs = 0;
        for (Animal animal : animals) {
            totalAmountOfLegs += animal.amountOfLegs;
        }
        System.out.println(totalAmountOfLegs);
    }

    /**
     * Gets the number of gender specified by the parameter
     *
     * @param gender
     */
    public void getNumberOfGender(String gender) {
        int totalAmountOfGender = 0;
        for (Animal animal : animals) {
            if (animal.gender.matches(gender)) {
                totalAmountOfGender++;
            }
        }
        System.out.println("Total amount of " + gender + " is " + totalAmountOfGender);
    }

}
