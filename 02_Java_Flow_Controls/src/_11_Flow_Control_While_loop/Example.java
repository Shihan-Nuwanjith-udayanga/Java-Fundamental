package _11_Flow_Control_While_loop;

// ============================ Java Flow Control "while-loop" ===========================

/*
import java.util.*;
class Example{
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            System.out.println("i : "+i);
        }
        System.out.println("==========");

        int i=0;
        for(; i<10; ){
            System.out.println("for loop : "+i);
            i++;
        }

        int j=0;
        while(j<10 ){
            System.out.println("while loop : "+j);
            j++;
        }
    }
}
*/

// =================================================================================================

// Exercise 01
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        int j=0;
        while(j<100 ){
            System.out.println(j);
            j++;
        }
    }
}
*/

// Exercise 02
/*
class Example{
    public static void main(String args[]){
        int j=1;
        while(j<=100 ){
            System.out.println(j);
            j++;
        }
    }
}
*/

// Exercise 03
/*
class Example{
    public static void main(String args[]){
        int j=100;
        while(j>0 ){
            System.out.println(j);
            j--;
        }
    }
}
*/

// Exercise 04
/*
class Example{
    public static void main(String args[]){
        int j=0;
        while(j<10 ){
            System.out.print(j+" ");
            j++;
        }
    }
}
*/

// Exercise 05
/*
class Example{
    public static void main(String args[]){
        int j=0;
        System.out.print("[");
        while(j<10 ){
            System.out.print(j+", ");
            j++;
        }
        System.out.println("\b\b]");
    }
}
*/

// =================================================================================================

// Exercise 06
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Random r=new Random();
        for(int i=0; i<50; i++){
            int rand=r.nextInt(101);
            System.out.println(rand);
        }
    }
}
*/

// Exercise 07 From 06
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Random r=new Random();
        int rand=r.nextInt(101); //0 to 100
        while(rand!=100){
            System.out.println(rand);
            rand=r.nextInt(101); //0 to 100
        }
        System.out.println(rand);
    }
}
*/

// Exercise 08
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num=input.nextInt();
        int count=0;

        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("no of digits : "+count);
    }
}
*/
