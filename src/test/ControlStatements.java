package test;

public class ControlStatements {

    /*
     * If else block
     * while
     * do while
     * switch case
     * We will check conditions of statement based on requirement.
     * for loop
     * */

    public static void main(String[] args) {

        int age = 19;
        String name = "sandeep";
        String car = "benz";

        if(age>=20){
            System.out.print("Age is Minor");
            getMajor();
        }else if(age>18 && age <20 || name.equalsIgnoreCase("Rahul")){
            System.out.print("Eligible for Minor");
        }else{
            System.out.print("Not eligible");
        }
        /*
        * To comment multilines - Ctrl+Shift+?
        * ||-- OR condition
        * true || true - true
        * true || false - true
        * false || true - true
        * false || false - false
        * && -- AND Condition
        * true && true - true
         * true && false - false
         * false && true - false
         * false && false - true
        * */

        while(age<25){  // Checking a condition until the required condition is false.
            System.out.println("Age " + age);
            age++; // age = age + 1;
        }

        // age = 25;
        do {        // checking a condition but atleast once the code will execute.
            System.out.println("Age in do-while : " + age);
            age++;
        }while (age<28);

        switch (car){   // It will check multiple condition based on input value.
            case "benz":
                getBenzDetails();
                System.out.println("Car is " + car);
                break;      // break is stop a condition for further condition check's.
            case "Maruthi":
                System.out.println("Car is " + car);
                break;
            case "Honda":
                System.out.println("Car is " + car);
                break;
            case "polo":
                System.out.println("Car is " + car);
                break;
            default:
                System.out.println("NO car");
                // Default code
        }
    }

    public static void getMajor(){
        System.out.print("Major condition executed");
    }

    public static void getBenzDetails(){
        System.out.println("Benz is High end car");
    }
}
