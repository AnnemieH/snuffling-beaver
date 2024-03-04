package org.example;

public abstract class Animal
{
    // Is it alive?
    boolean isAlive;
    // How much of what type of food does it need?
    int dailyFood;
    Material typeOfFood;
    // How far can it move and what are its movement types?
    int[] movementSpeeds;
    String[] movementTypes;

    // What sorts of things can it harvest?
    Material[] harvestableItems;
}
