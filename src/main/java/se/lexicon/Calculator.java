package se.lexicon;

/**
 * This class demonstrates overloading in examples using addition methods.
 */
public class Calculator {

    // Single line comment

    /*
    * Multi line comment
    */

    /**
     * This method using addition number1 and number2 together.
     *
     * @param number1
     * @param number2
     * @return sum of addition
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

    //Bonus.
    static String addition (int...ints){

        int result = 0;
        String resultAsString = "";

        for (int i = 0; i < ints.length; i++) {

            result = result + ints[i];

            if (i != ints.length -1){
                resultAsString = resultAsString + ints[i] + "+";
            }else{
                resultAsString += ints[1];
            }
        }

        return resultAsString += " = " + result;

    }
}

class App{
    public static void main(String[] args) {

        double result = Calculator.addition(10.0,20.5);
        System.out.println(result);

        Calculator.addition(10,60);
        Calculator.addition(10.5,60);
        Calculator.addition(10,60,52,6,59,47);

    }
}
