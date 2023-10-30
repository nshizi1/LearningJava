public class App {
    public static void main(String[] args) {
        /*System.out.println("This is wilson");
        System.out.println("Hello World");
        System.out.println("And I am 17 years old");*/
        // this is a comment
        // System.out.println(5*6);



        // variables

        // String name = "Wilson";
        // System.out.println(name);
        // int age = 17;
        // System.out.println(age);
        
        // final int num = 5;

        // System.out.println(num);

        // String myName = "Wilson Nshizirungu";
        // String englishWord ="I am";
        // int myAge = 17;
        // System.out.println(myName+" "+englishWord+" "+myAge);

        // String $car = "Lamborghini";

        // String _color = "Dark blue";

        // System.out.println("I have a "+ $car+ " car, and it is of a "+_color+" color");


        // type casting

        // int myNumber = 9;
        // float myFloat = myNumber;
        // System.out.println(myFloat);

        // double myDouble = 9.89d;
        // float myFloat = (float) myDouble;
        // System.out.println(myFloat);
        // int myInt = (int) myFloat;
        // System.out.println(myInt);

        // OPERATORS

        // int x = 1+5;        //output is 6
        // System.out.println(x);

        // x+=3;

        // System.out.println(x);
        // System.out.println(++x);    //output is 10
        // System.out.println(2+x);    //output is 12

        // int y = 10;
        // System.out.println(++y);    //output is 11
        // System.out.println(y--);    //output is 10
        // System.out.println(y);


        // int aa = 5;
        // int ab = 10;
        // System.out.println(aa > ab);    //outputs false because 5 is not greater than 10
        // System.out.println(aa > ab || aa < ab);    //outputs true because 5 is not greater than 10 but 5 is less than 10


        // STRING FUNCTIONS

        // string length
        String name = "Wilson Nshizirungu";
        System.out.println("My name is: "+name);
        System.out.println("My name has: "+name.length()+" Characters");

        // lower and upper cases

        String world = "Hello World";
        System.out.println(world.toUpperCase());    //outputs HELLO WORLD
        System.out.println(world.toLowerCase());    //outputs hello world
        System.out.println(world.toUpperCase()!=(world.toLowerCase()));    //outputs true because the two strings are not the same
    }
}