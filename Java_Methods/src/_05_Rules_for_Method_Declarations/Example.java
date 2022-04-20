package _05_Rules_for_Method_Declarations;

// ========================== Rules for Method Declarations ===================================

//Rule No. 1
/*
import java.util.*;
class Example{
    public static void myMethod(){
        System.out.println("Start myMethod");
        System.out.println("End myMethod");
    }
    public static void main(String args[]){
        //myMethod();
    }
}
*/

//Rule No. 2
/*
import java.util.*;
class Example{
    //
    //
    public static void main(String args[]){
        myMethod();
    }
    //
    public static void myMethod(){
        System.out.println("Start myMethod");
        System.out.println("End myMethod");
    }
    //
}
*/

//Rule No. 3
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        public static void myMethod(){ //Illegal
            System.out.println("Start myMethod");
            System.out.println("End myMethod");
        }

        myMethod();
    }
}
*/

//Rule No. 4
/*
import java.util.*;
class Example{
    public static void myMethod3(){
        System.out.println("Start myMethod3");
        System.out.println("End myMethod3");
    }
    public static void myMethod1(){
        System.out.println("Start myMethod1");
        myMethod3();
        System.out.println("End myMethod1");
    }

    public static void main(String args[]){
        myMethod2();
    }
    public static void myMethod2(){
        System.out.println("Start myMethod2");
        myMethod1();
        System.out.println("End myMethod2");
    }
}
*/

//Rule No. 5
/*
import java.util.*;
class Example{
    public static void printTotal(int num1,num2){
        int total=num1+num2;
        System.out.println(num1+" "+num2+" = "+total);
    }

    public static void main(String args[]){
        printTotal(10,20);  //10 + 20 = 30
    }
}
*/

//Rule No. 6
/*
import java.util.*;
class MyClass{
    public static void myMethod(){
        System.out.println("myMethod of MyClass");
    }
}
class Example{
    public static void myMethod(){
        System.out.println("myMethod of Example");
    }
    public static void main(String args[]){
        myMethod();
        Example.myMethod();
        MyClass.myMethod();
    }
}
*/

//Rule No. 7
/*
import java.util.*;
class Example{
    final synchronized public static void myMethod1(){}	 //Legal
    synchronized public final  static void myMethod2(){} //Legal
    public final  static synchronized void myMethod3(){} //Legal
    public final  static void synchronized  myMethod3(){} //Illegal


    public static void main(String args[]){

    }
}
*/

//Rule No. 8
/*
import java.util.*;
class Example{
    public static void printTotal(int x,int y){
        int z =x+y;
        int x=100;
        System.out.println();
    }

    public static void main(String args[]){
        printTotal(10,20);
    }
}
*/

//Rule No. 9
/*
class Example{
    public static void  printTotal(int x=10,int y=20){
        int total;
        total=x+y;
        System.out.println(total);
    }
    public static void main(String args[]){
        //
    }
}
*/

//Rule No. 10
/*
import java.util.*;
class Example{
    public static double  average(int total, int n){
        double avg=(double)total/n;
        return avg;
    }
    public static void main(String args[]){
        int totalMarks=899;
        int no_of_students=10;
        double avg=average(no_of_students,totalMarks);
        System.out.println("Average : "+avg);

        avg=average(totalMarks,no_of_students);
        System.out.println("Average : "+avg);
    }
}
*/

//==============================================================================================

//Exercise
/*
class Example {

    public static void main(String[] args) {
        double d;
        d=Math.pow(7,2);
        System.out.println("2^7 : "+d); //49.0
        d=Math.pow(2,7);
        System.out.println("2^7 : "+d); //128.0
    }
}
*/

//==============================================================================================

//Rule No. 11
/*
class Example {
    public static void printNumber(int x){
        System.out.println("["+x+"]");
    }
    public static void main(String[] args) {
        printNumber(1234);
        byte b=122;
        printNumber(b);
        short s=1000;
        printNumber(s);

        int x=100;
        printNumber(x);

        printNumber('A');

        long y=100;
        printNumber(y); //Illegal

        double d=12.34;
        printNumber(d); //Illegal

    }
}
*/

//==============================================================================================

//Exercise
/*
class Example {
    public static void main(String[] args) {
        System.out.println("Start main");
        for (int i = 0; i < 10; i++){
            if(i==5){
                //Insert code here
            }
            System.out.println("i : "+i);
        }
        System.out.println("End main");

    }
}
*/

//A. insert nothing
//B. break;
//C. continue;
//D. return;

//==============================================================================================

//Rule No. 12
/*
class Example{
    public static void myMethod(int x){
        System.out.println("A");
        System.out.println("B");
        if(x<50){return;}
        System.out.println("C");
        System.out.println("D");
    }
    public static void main(String args[]){
        myMethod(49);
        System.out.println("============");
        myMethod(100);
    }
}
*/

//Rule No. 13
/*
class Example{
    public static void printTotal(int x,int y){
        int z;
        z=x+y;
        System.out.println(x+" + "+y+" = "+z);
        return z;
    }

    public static void main(String args[]){

    }
}
*/

//Rule No. 14
/*
class Example {

    public static int getTotal(int x, int y) {
        int z;
        z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }

    public static void main(String args[]) {

    }
}
*/

//Rule No. 15
/*
class Example{
    public static char findGrade(double avg){
        if(avg>=75){
            return 'A';
        }else if(avg>=65){
            return 'B';
        }else if(avg>=55){
            return 'C';
        }else if(avg>=45){
            return 'D';
        }

    }

    public static void main(String args[]){

    }
}
*/

//Option I for Rule. 15
/*
class Example{
    public static char findGrade(double avg){ //Legal
        if(avg>=75){
            return 'A';
        }else if(avg>=65){
            return 'B';
        }else if(avg>=55){
            return 'C';
        }else if(avg>=45){
            return 'D';
        }else{
            return 'E';
        }

    }

    public static void main(String args[]){

    }
}
*/

//Option II for Rule. 15
/*
class Example{
    public static char findGrade(double avg){
        if(avg>=75){
            return 'A';
        }else if(avg>=65){
            return 'B';
        }else if(avg>=55){
            return 'C';
        }else if(avg>=45){
            return 'D';
        }
        return 'E';

    }

    public static void main(String args[]){

    }
}
*/

//Option III for Rule. 15
/*
class Example{
    public static char findGrade(double avg){
        if(avg>=75){
            return 'A';
        }else if(avg>=65){
            return 'B';
        }else if(avg>=55){
            return 'C';
        }else if(avg>=45){
            return 'D';
        }else{
            return 'E';
        }
        return 'F'; //Illegal
    }

    public static void main(String args[]){

    }
}
*/

//Rule No. 16
/*
class Example {
    public static int findTotal(int x, int y) {
        int z = x + y;
        return z;
    }
    public static void printTotal(int x, int y) {
        int z = x + y;
        System.out.println("Total : " + z);
    }
    public static void main(String args[]) {
        printTotal(1, 2);
        findTotal(1,2);
    }
}
*/

//Rule No. 17
/*
class Example {
    public static int findTotal(int x, int y) {
        int z = x + y;
        return z;
    }
    public static void printTotal(int x, int y) {
        int z = x + y;
        System.out.println("Total : " + z);
    }
    public static void main(String args[]) {
        int tot;
        tot=printTotal(1, 2); //Illegal
        tot=findTotal(1,2);
        System.out.println(printTotal(1,2));//Illegal
        System.out.println(findTotal(1,2));
    }
}
*/

//Rule  No. 18
/*
class Example {
    public static void myMethod(int x){
        System.out.println("myMethod(int)");
    }
    public static void myMethod(int x){
        System.out.println("myMethod(int)");
    }
    public static void main(String args[]) {
        myMethod(100);
    }
}
*/
