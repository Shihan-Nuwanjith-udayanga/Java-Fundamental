package _03_Relational_Operators;

// ========================= Relational Operators in Java ==================================
/*
                    <	-	Less than
                    >	-	Greater than
                    <=	-	Less than or equals to
                    >=	-	Greater than or equals to
                    ==	-	Equals to
                    !=	-	Not equals to
*/

// Exercise 01
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Input number 1 : ");
        num1 = input.nextInt();
        System.out.print("Input number 2 : ");
        num2 = input.nextInt();

        System.out.println(num1+" is equals to "+num2);
        System.out.println(num1+" is not equals to "+num2);
    }
}
*/

// Exercise 02 From 01
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Input number 1 : ");
        num1 = input.nextInt();
        System.out.print("Input number 2 : ");
        num2 = input.nextInt();
        if(num1==num2){
            System.out.println(num1+" is equals to "+num2);
        }else{
            System.out.println(num1+" is not equals to "+num2);
        }
    }
}
*/
// ======================================================================

// Exercise 03
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Input a number : ");
        num = input.nextInt();

        System.out.println(num+" is even");
        System.out.println(num+" is odd");
    }
}
*/

// Exercise 04 From 03
/*
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Input a number : ");
        num = input.nextInt();

        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
}
*/

// ==========================================================================================

// Exercise 05
/*
class Example {
    public static void main(String[] args) {
        int x=100;
        if(x=100){  //Illegal "x=100"--> 100 assign to x
            System.out.println(x+" equals to 100");
        }
    }
}
*/

// Exercise 06
/*
class Example {
    public static void main(String[] args) {
        int x=99,y=100;
        System.out.println(x=y);	//Line 1
        System.out.println(x==y);	//Line 2
        System.out.println(x!=y);	//Line 3
    }
}
*/

// Exercise 07
/*
class Example {
    public static void main(String[] args) {
        int x=99;
        if(x==100){
            System.out.println("A");
        }
        if(x++==100){
            System.out.println("B");
        }
        if(x++==100){
            System.out.println("C");
        }
        x=99;
        if(++x==100){
            System.out.println("D");
        }
    }
}
*/
