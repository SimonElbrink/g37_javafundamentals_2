package se.lexicon.simon;

public class MyScope {

    int number = 50;
    static int num = 10;

    public static void main(String[] args) {
        int num = 0;

        foo();
        MyScope.foo();// Same as "foo()" in this situation, more specific or Targeted.
    }

    public static void foo(){
        int num = 90;

        System.out.println(num);
        System.out.println(MyScope.num);
        System.out.println("Local Variable : " + num);
        System.out.println("MyScope.num : " + MyScope.num);
    }

    public void foo1(){
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
