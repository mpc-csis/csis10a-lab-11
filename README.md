# csis10a-lab-11

## Part A - Creating a Classes
__Prerequisite: Lecture or Reading on Chapter 11__

Clone or download csis10a-lab-11.

### Exercise 1

The point of this exercise is to practice the mechanical part of creating a new class definition and code that tests it. 

In the board game Scrabble, each tile contains a letter, which is used to spell words, and a score, which is used to determine the value of words. Refer to the Time class as a model for this exercise, or bring up sections [11.2 – 11.6](http://greenteapress.com/thinkapjava/html/thinkjava013.html#toc98) of your text.   

1. A starting Tile class that represents Scrabble tiles has been provided for you. Start by declaring the instance variables for class  Tile. The instance variables should be a character named letter and an integer named value.
2. Write a no-arg constructor that initializes a Tile to the letter ‘A’ with a value of 1.
3. Write a constructor that takes parameters named letter and value and initializes the instance variables.
4. Write a method named printTile that takes a Tile object as a parameter and prints the instance variables in a reader-friendly format.
5. Verify your new class works by running main and observing the output. 
6. Finally,add code in main to creates a Tile object with the letter Z and the value 10,  and then use printTile to print the state of (all the information in side) the object.

### Exercise 2 

Now create a new class called `Date`. Write the class definition for Date, as an object type that contains three integers, `year`, `month` and `day`. This class should provide two constructors. The first should take no parameters. The second should take parameters named `year`, `month` and `day`, and use them to initialize the instance variables.

Finally, write a `main` method that creates a new `Date` object named _birthday_. The new object should contain your birthdate. You can use either constructor. 

## Part B - Introduction to Unit Testing

### What is a _unit test_?

In computer programming, unit testing is a method by which individual units of source code, sets of one or more computer program modules together with associated control data, usage procedures, and operating procedures are tested to determine if they are fit for use. [[1]](http://en.wikipedia.org/wiki/Unit_testing)

### Unit Testing Frameworks

Java has a number of excellent unit test frameworks to use. For this lab, we will be using [JUnit](http://junit.org/) which is probably the most commonly used one.

In order to simplify the execution of unit tests, we will create our unit testst in a Maven project. If you follow a few conventions Maven will execute your unit tests for you on request or with every build.

### Your Tasks

#### Create a project using Maven

1. Create a new Maven project named _unittest_ using the following:
```
cd ~/csis10a
mvn archetype:generate
```
When promptedt, the groupId should be __csis10a__, the artifactId should be __unittest__
2. You should now have a directory named `~/csis10a/unittest`. Open this project using _IntelliJ_ or _Visual Studio Code_

#### MathUtil

MathUtil will illustrate using static methods like functions.

1. Create the class `csis10a.MathUtil`. To do this in your editor, expand the `src` directory in IntelliJ's sidebar until you see the `csis10a` package. Right-click on csis10a and select _new Java class_ and name it `MathUtil`.
2. Create 2 static methods in MathUtil and implement them:
  - `add` which will add 2 double values together and returns the result
  - `subtract` which will subtract 2 double values and returns the result.

Now you will create a corresponding unit test named `MathUtilTest`. It is a convention (but not a rule) that a unit test is the name of the class being tested with _Test_ appended to the end. A Test is just a regular old class but used in a specific way.

1. Create the test `csis10a.MathUtilTest`. To do this, expand the `test` directory in your editor's sidebar until you see the `csis10a` package. Right click on csis1a and select new Java Test and name it `MathUtilTest`
2. Create 2 method stubs in MathUtilTest. Don't worry about the implementation yet:
  - `public void addTest()`. Inside this method you will test the add method of MathUtil.
  - `public void subtractTest()`. Inside this method will test the subtract method of MathUtil.
3. Add the following import: `import org.junit.Assert`. [Here's the javadoc for Assert](http://junit.org/javadoc/latest/org/junit/Assert.html). Asserts are the bread-and-butter of unit testing and control whether a test passes or fails. Here's some example assertions:

```
Assert.assertEquals("foo", "bar"); // Fails

double a = 1;
double b = 2;
double epsilon = 0.00000000001; // Remember don't uses == with floating point numbers
Assert.assertEquals(a, b, epsilon); // Fails
Assert.assertTrue(a < b);           // Passes

Time t = new Time(1, 2, 3);
Time u = t
Assert.assertNotNull(t);            // Passes
Assert.assertSame(t, t);            // Passes  

```
4. Import `org.junit.Test` and add the `@Test` annotation to your testing methods:
```
@Test
public void addTest() { ... }
```
5. Implement your tests

### BetterTime
1. Copy the file [BetterTime.java](BetterTime.java) into your maven project at  `src/main/java/csisi10a` You'll need to make sure that the first line in `BetterTime` is the package name: `package csis10a;`.
2. Following a similar procedure as above, create a unit test for BetterTime and implemen some tests to verify it's methods.

