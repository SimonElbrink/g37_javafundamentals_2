package se.lexicon.simon;

public class MyScope {

    int number = 50;
    static int num = 10;


    public static void main(String[] args) {

        int num = 0;


        System.out.println(num);
        System.out.println(MyScope.num);

        foo();
        MyScope.foo();

    }

    static {

    }

    public static void foo(){

        int num = 90;
    }

    public void foo1(){

        int number = 40;

        System.out.println(number);
        System.out.println(this.number);

    }
}
