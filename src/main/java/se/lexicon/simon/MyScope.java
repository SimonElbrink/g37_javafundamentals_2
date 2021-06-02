package se.lexicon.simon;

public class MyScope {

    int number = 50;
    static int num = 10;

    public static void main(String[] args) {
        int num = 0;

        // staticExample();
        MyScope.staticExample();// Same as "foo()" in this situation, more specific or Targeted.
        variableFromParameter(num);
    }

    public static void staticExample(){
        int num = 90;

        System.out.println(num);
        System.out.println(MyScope.num);
        System.out.println("Local Variable : " + num);
        System.out.println("MyScope.num : " + MyScope.num);
    }

    public static void variableFromParameter(int num){
        System.out.println("Local Variable From parameter: " + num);
        System.out.println("MyScope.num : " + MyScope.num);
    }

    public void instanceVariableExample(){
        int number = 40;

        System.out.println("Local Variable : " + number);
        System.out.println("This.number : " + this.number);
    }

    // Empty Instance Block
    {

    }

    // Empty Static Block
    static {

    }


}
