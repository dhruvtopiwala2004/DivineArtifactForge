# Journal

## Phase 1

In this phase, I created an Artifact class with a material field and a constructor. I also created an object to test the constructor. I learned that constructors are important because they initialize objects when they are created. This makes sure every artifact has a material assigned from the beginning.

## Phase 2
In this phase, I created a DivineWeapon class that extends the Artifact class. I used the super() keyword to call the constructor of the parent class.

If I do not call the parent constructor, Java gives an error because the Artifact class does not have a no-argument constructor. Java needs to initialize the parent class before initializing the child class. This helps ensure that all required fields are properly initialized.

## Phase 3
In this phase, I added a no-argument constructor to the DivineWeapon class. I used this() to call the existing constructor with a default essence type.

Using this() helps avoid writing the same code multiple times. If I want to change the default essence type in the future, I can simply update the value inside the no-argument constructor. This makes the program easier to maintain.

## Phase 4
In this phase, I tested both the custom and default DivineWeapon constructors to verify that the objects were initialized correctly.