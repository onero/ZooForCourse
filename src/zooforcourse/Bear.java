/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooforcourse;

public class Bear extends Animal {

    /**
     * Takes the parameters and assigns them to the objects corresponding fields
     *
     * @param gender
     * @param amountOfLegs
     * @param sound
     */
    public Bear(String gender, int amountOfLegs, String sound) {
        this.gender = gender;
        this.amountOfLegs = amountOfLegs;
        this.sound = sound;

    }

    /**
     * Takes the sound from the parameter and prints it to the console
     */
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

}
