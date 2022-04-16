package _01_Java_Methods;

// ===================================== Java Methods (Functions) ===================================

//Step 01
/*
class Example{
    public static void main(String args[]){
        System.out.println("Niroth Samarawickrama,");
        System.out.println("No 500/10, ");
        System.out.println("Galle Rd, ");
        System.out.println("Panadura.");


        System.out.println("Niroth Samarawickrama,");
        System.out.println("No 500/10, ");
        System.out.println("Galle Rd, ");
        System.out.println("Panadura.");

        System.out.println("Niroth Samarawickrama,");
        System.out.println("No 500/10, ");
        System.out.println("Galle Rd, ");
        System.out.println("Panadura.");
    }
}
*/

//Step 02
/*
class Example{
    //----------------Start method declaration-----------
    public static void printMyAddress(){
        System.out.println("Niroth Samarawickrama,");
        System.out.println("No 500/10, ");
        System.out.println("Galle Rd, ");
        System.out.println("Panadura.");
    }
    //----------------Start method declaration-----------

    //-----------------start main method declaration-----
    public static void main(String args[]){
        printMyAddress(); //Method Calling statement (/run/execute)

        //
        //
        //
        printMyAddress();
    }
    //-------------------end main method declaration-----
}
*/


//=========================================================================================================

// Exercise 1
/*
import java.util.*;
class Example{
    public static void printTotal(){
        Scanner input=new Scanner(System.in);

        //Read two numbers from the keyboard
        System.out.print("Input number 1 : ");
        int num1=input.nextInt();
        System.out.print("Input number 2 : ");
        int num2=input.nextInt();

        //Find the total
        int total=num1+num2;

        //Print the result
        System.out.println(num1+" "+num2+" = "+total);
    }

    public static void main(String args[]){
        printTotal();
    }
}
*/

// Exercise 2
/*
import java.util.*;
class Example{
    public static void printDigitsCount(){
        Scanner input=new Scanner(System.in);

        //Read two numbers from the keyboard
        System.out.print("Input a integer: ");
        int num=input.nextInt();

        //Find digits count
        int count=0;
        do{
            count++;
        }while((num/=10)!=0);

        //Print the result
        System.out.println("No of digits : "+count);
    }

    public static void main(String args[]){
        printDigitsCount();
    }
}
*/

// Exercise 3
/*
import java.util.*;
class Example{
    public static void printStudentStatus(){
        Scanner input=new Scanner(System.in);

        //Read average marks from the keyboard
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();
        if(avg>=50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

    public static void main(String args[]){
        printStudentStatus();
    }
}
*/

// Exercise 4
/*
import java.util.*;
class Example{
    public static void printReverse(){
        Scanner input=new Scanner(System.in);

        //Read an integer from the keyboard
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        int reverse=0;
        while(num!=0){
            reverse*=10;
            reverse+=num%10;
            num/=10;
        }
        System.out.println("Reverse : "+reverse);
    }

    public static void main(String args[]){
        printReverse();
    }
}
*/

// Exercise 5
/*
import java.util.*;
class Example{
    public static void printGrade(){
        Scanner input=new Scanner(System.in);

        //Read average marks from the keyboard
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();
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
        printGrade();
    }
}
*/

// Exercise 6
/*
import java.util.*;
class Example{
    public static void printPallindrom(){
        Scanner input=new Scanner(System.in);

        //Read an integer from the keyboard
        System.out.print("Input an integer : ");
        int num=input.nextInt();
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
        printPallindrom();
    }
}
*/
