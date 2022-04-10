package _02_Flow_Control_if_else;

// ================================= Java Flow Control "if/esle" ==============================

// step 01
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double avg;
        System.out.print("Input average marks  : ");
        avg=input.nextDouble();

        System.out.println("Pass");
        System.out.println("Fail");
    }
}
*/

//step 02
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double avg;
        System.out.print("Input average marks  : ");
        avg=input.nextDouble();
        if(avg>50){
            System.out.println("Pass");
        }
        if(avg<50){
            System.out.println("Fail");
        }
    }
}
*/

//step 03
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double avg;
        System.out.print("Input average marks  : ");
        avg=input.nextDouble();
        if(avg>49){
            System.out.println("Pass");
        }
        if(avg<50){
            System.out.println("Fail");
        }
    }
}
*/

//step 04
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double avg;
        System.out.print("Input average marks  : ");
        avg=input.nextDouble();
        if(avg>=50){
            System.out.println("Pass");
        }
        if(avg<50){
            System.out.println("Fail");
        }
    }
}
*/

//step 05 From step 04 Using "if/else"
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double avg;
        System.out.print("Input average marks  : ");
        avg=input.nextDouble();
        if(avg>=50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}

