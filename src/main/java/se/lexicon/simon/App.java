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

    void a(){}

    private static void name(){}

    public static void words(){}


} // end of App class

class Foo{

    public static void main(String[] args) {
        //App.name();
        App.words();

    }

}
