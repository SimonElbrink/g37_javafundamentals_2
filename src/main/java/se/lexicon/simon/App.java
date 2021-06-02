package se.lexicon.simon;

import se.lexicon.simon.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{ //Start of App class
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        Car volvo = new Car();

        volvo.setBrand("Volvo");
        volvo.setRegNumber("123ABC");

        volvo.getInformation();

    }

    {}

    void a(){} // Small example of a Method.

    private static void printSecretWord(){}

    public static void proclaimingAMessage(){}


} // end of App class

class Foo{ //Start Of Foo Class

    public static void main(String[] args) { // Start of Main method.
        //App.printSecretWord(); // Will not work. It's a private method.
        App.proclaimingAMessage();

    }//End of main method

} //End of Foo class.
