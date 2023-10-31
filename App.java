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
        // String name = "Wilson Nshizirungu";
        // System.out.println("My name is: "+name);
        // System.out.println("My name has: "+name.length()+" Characters");

        // // lower and upper cases

        // String world = "Hello World";
        // System.out.println(world.toUpperCase());    //outputs HELLO WORLD
        // System.out.println(world.toLowerCase());    //outputs hello world
        // System.out.println(world.toUpperCase()!=(world.toLowerCase()));    //outputs true because the two strings are not the same

        // // finding a character in a string

        // System.out.println(world.indexOf("World"));     //outputs 6

        // String hello = "Hello";
        // String me = "Me";

        // System.out.println(hello.concat(" ").concat(me));   // Outputs Hello Me

        //special characters

        // String english = "It\'s a boy";
        // System.out.println(english);
        // String DoubleQuote = "\"Success\"";     //outputs "Success"
        // System.out.println(DoubleQuote);

        // System.out.println(Math.random());      //random number btn 0.0 and 1.0 inclusive and exclusive respectively
        // System.out.println(Math.random()*101);      //random number btn 0 and 100 (not integer)
        // int number = (int)(Math.random()*101);
        // System.out.println(number);


        // boolean

        // int a = 5;
        // int b = 10;
        // System.out.println(a>b);    //outputs false bcz a isn't greater than b

        // int userAge = 18;
        // int votingAge = 18;
        // // System.out.println(userAge>=votingAge);     //outputs false
        // if(userAge>=votingAge){
        //     System.out.println("User is allowed to vote");
        // }else{
        //     System.out.println("User's age don't allow the voting");
        // }


        //SWITCH CASE
        
        // int day = 10;
        // switch(day){
        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesday");
        //     break;
        //     case 3:
        //     System.out.println("Wednesday");
        //     break;
        //     case 4:
        //     System.out.println("Thursday");
        //     break;
        //     case 5:
        //     System.out.println("Friday");
        //     break;
        //     case 6:
        //     System.out.println("Saturday");
        //     break;
        //     case 7:
        //     System.out.println("Sunday");
        //     break;
        //     default:
        //     System.out.println("Invalid Input!!");

        // }

        // for(int i=1;i<=10;i++){
        //     System.out.println(i);
        // }


        // int a=10;
        // while (a>=1) {
        //     System.out.println(a);
        //     a--;
        // }

        int b=1;
        do{
            System.out.println(b);
            b++;
        }
        while(b<=10);
    }
}