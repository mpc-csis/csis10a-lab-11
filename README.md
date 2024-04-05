# csis10a-lab-11

## Part A
__Prerequisite: Lecture or Reading on Chapter 11__

Clone or download lab11.

__Excercise 1:__ In the board game Scrabble, each tile contains a letter, which is used to spell words, and a score, which is used to determine the value of words. Refer to the Time class as a model for this exercise, or bring up sections [11.2 – 11.6](http://greenteapress.com/thinkapjava/html/thinkjava013.html#toc98) of your text.   

1. A starting Tile class that represents Scrabble tiles has been provided for you. Start by declaring the instance variables for class  Tile. The instance variables should be a character named letter and an integer named value.
2. Write a no-arg constructor that initializes a Tile to the letter ‘A’ with a value of 1.
3. Write a constructor that takes parameters named letter and value and initializes the instance variables.
4. Write a method named printTile that takes a Tile object as a parameter and prints the instance variables in a reader-friendly format.
5. Verify your new class works by running main and observing the output. 
6. Finally,add code in main to creates a Tile object with the letter Z and the value 10,  and then use printTile to print the state of (all the information in side) the object.

The point of this exercise is to practice the mechanical part of creating a new class definition and code that tests it. 

__Exercise 2:__ Now create a new class called `Date`. Write the class definition for Date, as an object type that contains three integers, `year`, `month` and `day`. This class should provide two constructors. The first should take no parameters. The second should take parameters named `year`, `month` and `day`, and use them to initialize the instance variables.

Finally, write a `main` method that creates a new `Date` object named _birthday_. The new object should contain your birthdate. You can use either constructor. 