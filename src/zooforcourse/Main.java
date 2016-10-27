/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooforcourse;

/**
 *
 * @author Adamino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        //Create two new animals and cast them to a specific animal and parse them a gender, amountOfLegs and a sound
        zoo.add(new Lion("male", 4, "Wroaar"));
        zoo.add(new Bear("female", 2, "Grr!"));

        zoo.allAnimalsMakeSound();
        zoo.countLegs();
        zoo.getNumberOfGender("male");

    }

}
