package _01_Flow_Control_if;

// ==================================== Java Flow Control "if"	 ============================

// step 01
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
    }
}
*/

// step 02
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        System.out.println("A");
        System.out.println("B");
        if(num>10) System.out.println("C");
        System.out.println("D");
        System.out.println("E");
    }
}
*/

//step 03
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        System.out.println("A");
        System.out.println("B");
        if(num>10)
            System.out.println("C");
        System.out.println("D");
        System.out.println("E");
    }
}
*/

//step 04
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        System.out.println("A");
        System.out.println("B");
        if(num>10)
            System.out.println("C");
        System.out.println("D");
        System.out.println("E");
    }
}
*/

//step 05
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        System.out.println("A");
        System.out.println("B");
        if(num>10){ //Code block
            System.out.println("C");
            System.out.println("D");
        }
        System.out.println("E");
    }
}
*/

//==========================================================================================================

// Exercise 01
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.print("Input number 1 : ");
        num1=input.nextInt();
        System.out.print("Input number 2 : ");
        num2=input.nextInt();
        System.out.print("Input number 3 : ");
        num3=input.nextInt();
        System.out.print("Input number 4 : ");
        num4=input.nextInt();

        //

        //Find the maximum
        int max;
        //Insert code here to select the maximum number from num1,num2,num3 and num4
        //
        //
        //
        System.out.println("Max : "+max);

    }
}
*/

// Exercise 02 From 01
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.print("Input number 1 : ");
        num1=input.nextInt();
        System.out.print("Input number 2 : ");
        num2=input.nextInt();
        System.out.print("Input number 3 : ");
        num3=input.nextInt();
        System.out.print("Input number 4 : ");
        num4=input.nextInt();

        //Find the maximum
        int max;
        max=num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        if(num4>max){
            max=num4;
        }
        System.out.println("Max : "+max);
    }
}
*/

