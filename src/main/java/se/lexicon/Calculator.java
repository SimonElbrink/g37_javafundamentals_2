package se.lexicon;

/**
 * This class demonstrates overloading in examples using addition.
 */
public class Calculator {


    // Single line comment
    /*
    * Multi line comment
    * */

    /**
     * This method adds number1 and number2 together
     *
     * @param number1
     * @param number2
     * @return result of addition
     */
    public static int addition(int number1, int number2){

        int result = number1 + number2;

        return result;
    }

    public static double addition(double number1, double number2){

        double result = number1 + number2;

        return result;
    }

    public static double addition(double number1, int number2){
        return number1 + number2;
    }




}

class App{
    public static void main(String[] args) {

        double result = Calculator.addition(10.0,20.5);
        System.out.println(result);

        Calculator.addition(10,60);

    }
}
