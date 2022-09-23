package test;

public class HelloWorld {

    public static void main(String[] args){

        int myNum = 7; // default 0 long double float
        float myFloatNum = 5.99f; // 0
        char myLetter = 'D'; // empty
        boolean myBool = true; // default false
        String fruit = "Banana";  // Default value null
        Double db = new Double("1544845484545");

        System.out.println("Hello World");
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(fruit);
        if(fruit.equals("Banana")){ // If condition is true then below line will execute
            System.out.println("Banana shake");
        }else if(fruit.equals("Mango")){      // else below line will execute
            System.out.println("Mango Shake");
        }else if(fruit.equals("PineApple")){
            System.out.println("PineApple Shake");
        }else{
            System.out.println("No Shake");
        }

        System.out.println(7+2); // 9 comment
        System.out.println(7-2); // 5
        System.out.println(7*2); /* 14  */
        System.out.println(7/2); // 3 Division
        System.out.println(7%2); // 1  Remainder
        int i = 7;
        int k = 7;
        System.out.println(i++); // i+1 = 8
        /*System.out.println(i);*/
        System.out.println(++k);
        int o = 7;
        int l = 7;
        System.out.println(o--); // 7
        System.out.println(--l); // 6

        String name = "Rakesh";
        String name2 = "Abhi";

        if(name==name2){ // == to check the contains of variables
            System.out.println("Name Matches");
            System.out.println("Name is " + name);
        }else{
            System.out.println("Name not matches");
        }

        if(name!=null){ // Null check condition
            System.out.println("name is not null");
        }
        String name3 = "Vamshi";
        if(name!=name3){
            System.out.println("Both the names are different");
        }

        if(o>50){  // greather than check
            System.out.println("Number is greater than 5");
        }else if(o<10){  // less than check
            System.out.println("Number is less than 10");
        }

        if(o>=6){  // o value changed since we decrement at line 43
            System.out.println("Number is greater or equals 6");
        }

        if(l<=6){ // l value changed since we decrement at line 44
            System.out.println("Number is less or equals 6");
        }

        // comment starts here from here no code will execute in this particular line
        /*
        * Multiple lines comment (shortcut - > ctrl+shift+/
        * */
        if(o>=6 && l<=6){ // and every statment should return true then condition will be true
            System.out.println("AND statement is true");
        }

        if(o>=6 || l<=7){ // any statment should return true then condition will be true
            System.out.println("OR statement is true");
        }

        if(!(o>6)){
            System.out.println("Not is true");
        }

        int age = 60;
        if(age>=60){
            System.out.println("Eligible for retirement");
        }
        if(!(age<60)){
            System.out.println("Not Eligible for retirement");
        }
    }
}
