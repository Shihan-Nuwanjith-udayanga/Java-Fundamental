package _10_Variable_Scope;

// ========================== Variable Scope and lifetime ================================

//Q-01
/*
class Example{
    public static void main(String args[]){
        int x=100;
        System.out.println(x);
        {
            int y=200;
            System.out.println(x);
            System.out.println(y);
            x++;y++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
*/

//Q-02 From Q-01
/*
class Example{
    public static void main(String args[]){
        int x=100;
        System.out.println(x);
        {
            int y=200;
            System.out.println(x);
            System.out.println(y);
            x++;y++;
            //int y=2; //Illegal
        }
        //int x=1; //Illegal
        int y=2; //Legal ?
        System.out.println(x);
        System.out.println(y);
    }
}
*/

//Q-03
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        int x=100;
        System.out.println(x);	//Line 1
        System.out.println(y);	//Line 2
        System.out.println(z);	//Line 3
        {
            int z=200;
            System.out.println(x);	//Line 4
            System.out.println(y);	//Line 5
            System.out.println(z);	//Line 6
            {
                int z=300;
                System.out.println(x);	//Line 7
                System.out.println(y);	//Line 8
                System.out.println(z);	//Line 9
            }
            System.out.println(x);	//Line 10
            System.out.println(y);	//Line 11
            System.out.println(z);	//Line 12
        }
        System.out.println(x);	//Line 13
        System.out.println(y);	//Line 14
        System.out.println(z);	//Line 15

    }
}
*/

//Q-04
/*
class Example{
    public static void main(String args[]){
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        {
            int y=100;
            System.out.println(y);
            y++;
        }
    }
}
*/

//Q-05
/*
class Example{
    public static void main(String args[]){
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        int y=0;
        {
            int y=100; //Illegal
            System.out.println(y);
            y++;
        }
    }
}
*/

//Q-06
/*
class Example{
    public static void main(String args[]){
        int y=100;
        {
            y++;
        }
        System.out.println(y);
    }
}
*/

//Q-07
/*
class Example{
    public static void main(String args[]){
        int x=100;
        if(x>0){
            int y=100;
        }else{
            System.out.println(y); //Illegal
        }
    }
}
*/

//Q-08
/*
class Example{
    public static void main(String args[]){
        int x=100;
        if(x>0){
            int y=100;
            System.out.println(y);
        }else{
            int y=200;
            System.out.println(y);
        }
    }
}
*/

//Q-09
/*
class Example{
    public static void main(String args[]){
        int x=100;
        if(x>0){
            int y=100;
        }else{
            int y=200;
        }
        if(x>10){
            int y=300;
        }
        int y=400;
        if(x==100){
            //
        }else{
            int y=500;
        }
        System.out.println(y);
    }
}
*/

//Q-10
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<10;i++){
            System.out.println(i);
        }
        System.out.println(i);//Illegal
    }
}
*/

//Q-11
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<10;i++){
            int j=0;
            System.out.println(i+" "+j);
            j++;
        }
        //System.out.println(i);//Illegal
        //System.out.println(j);//Illegal
    }
}
*/

//===========================================================================================================

//Exercise 1
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<100;i++){
            System.out.println(i);
        }
    }
}
*/

//Exercise 2
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<100;i++){
            System.out.println(i+1);
        }
    }
}
*/

//Exercise 3 From Exercise 2
/*
class Example{
    public static void main(String args[]){
        for(int i=1; i<101;i++){
            System.out.println(i);
        }
    }
}
*/

//Exercise 4
/*
class Example{
    public static void main(String args[]){
        for(int i=100; i>0;i--){
            System.out.println(i);
        }
    }
}
*/

//Exercise 5
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<10;i++){
            System.out.print(i+" ");
        }
    }
}
*/

//Exercise 6
/*
class Example{
    public static void main(String args[]){
        System.out.print("[");
        for(int i=0; i<10;i++){
            System.out.print(i+", ");
        }
        System.out.println("\b\b]");
    }
}
*/

//Exercise 7
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input a digit : ");
        int digit=input.nextInt();
        System.out.print("[");
        for(int i=0; i<10;i++){
            System.out.print(digit+", ");
        }
        System.out.println("\b\b]");
    }
}
*/

//Exercise 8
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer  : ");
        int x=input.nextInt();
        System.out.print("[");
        for(int i=1; i<=x;i++){
            System.out.print(i+", ");
        }
        System.out.println("\b\b]");
    }
}
*/

//Exercise 9
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer  : ");
        int x=input.nextInt();
        System.out.print("[");
        for(int i=x; i>0;i--){
            System.out.print(i+", ");
        }
        System.out.println("\b\b]");
    }
}
*/

//Exercise 10
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer  : ");
        int x=input.nextInt();

        for(int i=1; i<=x;i++){
            System.out.print(i+" + ");
        }
        System.out.println("\b\b = ");
    }
}
*/

//Exercise 11
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer  : ");
        int x=input.nextInt();
        int tot=0;
        for(int i=1; i<=x;i++){
            System.out.print(i+" + ");
            tot+=i;
        }
        System.out.println("\b\b = "+tot);
    }
}
*/

//Exercise 12
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer  : ");
        int x=input.nextInt();
        int fact=1;
        for(int i=x; i>0;i--){
            System.out.print(i+" * ");
            fact*=i;
        }
        System.out.println(" = "+fact);
    }
}
*/

//Exercise 13
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input no of students : ");
        final int N=input.nextInt();
        int marks;
        int total=0;

        for(int i=0; i<N; i++){
            System.out.print("Input marks "+(i+1)+" : " );
            marks=input.nextInt();
            total=total+marks;
        }
        double avg=(double)total/N;
        System.out.println("Total   : "+total);
        System.out.println("Average : "+avg);
    }
}
*/

