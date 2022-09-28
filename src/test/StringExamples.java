package test;

public class StringExamples {


    public static void main(String[] args) {
        String str = "Karthik";
        String str2 = "Karthik";
        String str1 = new String("Karthik"); // new object -- Address created

//      String str = "karthik";
//        JVM will convert in byteCode and store it in memory.

        if (str.equals(str1)){ // String contains eg.. Karthik
            System.out.println("str and str1 are Equal by equals method");
        }
        if(str==str1){      // Both Strings refer same object
            System.out.println(" Equal");
        }
        if(str==str2){      // Both Strings refer same object
            System.out.println(" str and str2 are Equal");
        }
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        String s3= "Rakesh";
        String s4 = "v";
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        String s1 ="HelloWorld to my World";
        String s2 = "";
        String s = "";

        System.out.print(s1.charAt(4));
        //System.out.print(s1.compareTo(s2));
        System.out.print(s2.isEmpty());
        System.out.print(s1.length());

        String[] ary = s1.split(" ");
        System.out.println(ary[0]);
        System.out.println(ary[1]);
        System.out.println(ary[2]);
        System.out.println(ary[3]);

        String s6 = " ABHINAY TUTOR FROM JNTU ";
        System.out.println(s6.trim());
        System.out.println(s6.toLowerCase());
    }

}
