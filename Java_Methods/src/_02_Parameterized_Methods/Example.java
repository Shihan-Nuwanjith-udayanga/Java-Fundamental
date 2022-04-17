package _02_Parameterized_Methods;

// ================================== Parameterized methods ======================================

//Exercise 01
/*
class Example{
    public static void printTotal(int num1, int num2){
        //Find the total
        int total=num1+num2;

        //Print the result
        System.out.println(num1+" "+num2+" = "+total);
    }

    public static void main(String args[]){
        printTotal(10,20);  //10 + 20 = 30
    }
}
*/

//Exercise 02
/*
import java.util.*;
class Example{
    public static void printDigitsCount(int num){
        //Find digits count
        int count=0;
        do{
            count++;
        }while((num/=10)!=0);

        //Print the result
        System.out.println("No of digits : "+count);
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input a integer: ");
        int num=input.nextInt();
        printDigitsCount(num);
    }
}
*/

//Exercise 03
/*
import java.util.*;
class Example{
    public static void printStudentStatus(double average ){
        if(average>=50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();

        printStudentStatus(avg);
    }
}
*/

//Exercise 04
/*
import java.util.*;
class Example{
    public static void printReverse(int num){
        int reverse=0;
        while(num!=0){
            reverse*=10;
            reverse+=num%10;
            num/=10;
        }
        System.out.println("Reverse : "+reverse);
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();

        printReverse(num);
    }
}
*/

//Exercise 05
/*
import java.util.*;
class Example{
    public static void printGrade(double avg){
        if(avg>=75){
            System.out.println("A");
        }else if(avg>=65){
            System.out.println("B");
        }else if(avg>=45){
            System.out.println("C");
        }else if(avg>=25){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();

        printGrade(avg);
    }
}
*/

//Exercise 06
/*
import java.util.*;
class Example{
    public static void printPallindrom(int num){
        int originalNumber=num;
        int reverse=0;
        while(num!=0){
            reverse*=10;
            reverse+=num%10;
            num/=10;
        }
        if(originalNumber==reverse){
            System.out.println(originalNumber+" is a Pallindrom number..");
        }else{
            System.out.println(originalNumber+" is not a Pallindrom number..");
        }
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();

        printPallindrom(num);
    }
}
*/
