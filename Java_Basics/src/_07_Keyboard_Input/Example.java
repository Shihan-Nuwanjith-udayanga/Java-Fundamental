package _07_Keyboard_Input;

// ======================== Keyboard Input ==========================

// step 01
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        x=input.nextInt();
        y=input.nextInt();
        int z;
        z=x+y;
        System.out.println(x+"+"+y+"="+z);
    }
}
*/

// step 02
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.println("Input number 1 : ");
        System.out.println("Input number 2 : ");
        x=input.nextInt();
        y=input.nextInt();
        int z;
        z=x+y;
        System.out.println(x+" + "+y+" = "+z); //prints 100 + 200 = 300
    }
}
*/

// step 03
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.println("Input number 1 : ");
        x=input.nextInt();
        System.out.println("Input number 2 : ");
        y=input.nextInt();
        int z;
        z=x+y;
        System.out.println(x+" + "+y+" = "+z); //prints 100 + 200 = 300
    }
}
*/

// step 04
/*
import java.util.*;
class Example{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.print("Input number 1 : ");
        x=input.nextInt();
        System.out.print("Input number 2 : ");
        y=input.nextInt();
        int z;
        z=x+y;
        System.out.println(x+" + "+y+" = "+z); //prints 100 + 200 = 300
    }
}
*/

// =====================================================================================

//Q1
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input your age : ");
        int age=input.nextInt();
        System.out.println("Your current age : "+age);
        //
        //Insert code to find your age after 10 years
        //
        System.out.println("Your age  after 10 years : "+age);
    }
}
*/

//Q1 from Q2
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input your age : ");
        int age=input.nextInt();
        System.out.println("Your current age : "+age);
        //
        age=age+10;
        //
        System.out.println("Your age  after 10 years : "+age);
    }
}
*/

// =======================================================================================

//Q3
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("Input number 1 : ");
        x=input.nextInt();
        System.out.print("Input number 2 : ");
        y=input.nextInt();
        System.out.println(x+"  "+y); //45 65
        //
        //
        System.out.println(x+"  "+y); //65 45
    }
}
*/

// Q3 from Q4
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("Input number 1 : ");
        x=input.nextInt();
        System.out.print("Input number 2 : ");
        y=input.nextInt();
        System.out.println(x+"  "+y); //45 65
        //
        int z;
        z = x;
        x = y;
        y = z;
        //
        System.out.println(x+"  "+y); //65 45
    }
}
*/

