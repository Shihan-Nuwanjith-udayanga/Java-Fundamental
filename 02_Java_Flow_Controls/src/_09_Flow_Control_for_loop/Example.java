package _09_Flow_Control_for_loop;

// ======================= Java Flow Control "for-loop" ============================

//step 01
/*
class Example{
    public static void main(String args[]){
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java");
    }
}
*/

//step 02
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<10; i++) System.out.println("Hello java");
    }
}
*/

//step 03
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; i<10; i++) System.out.println("Hello java");
        System.out.println("End.");
    }
}
*/

//step 04
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; i<10; i++)
            System.out.println("Hello java");
        System.out.println("End.");
    }
}
*/

//step 05
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; i<10; i++)
            System.out.println("Hello");
        System.out.println("Java");
        System.out.println("End.");
    }
}
*/

//step 06
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            System.out.println("Java");
        }
        System.out.println("End.");
    }
}
*/

//===================================================================================================

//Exercise 01
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; i<5; i++){
            System.out.println("Hello Java");
        }
        System.out.println("End.");
    }
}
*/

//Exercise 02
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=5; i<10; i++){
            System.out.println("Hello Java");
        }
        System.out.println("End.");
    }
}
*/

//Exercise 03
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; i<10; i=i+2){
            System.out.println("Hello Java");
        }
        System.out.println("End.");
    }
}
*/

//Exercise 04
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=10; i>0; i--){
            System.out.println("Hello Java");
        }
        System.out.println("End.");
    }
}
*/

//Exercise 05
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=10; i<0; i++){
            System.out.println("Hello Java");
        }
        System.out.println("End.");
    }
}
*/

//Exercise 06
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=10; i>0; i++){
            System.out.println("Hello Java");
        }
        System.out.println("End.");
    }
}
*/

//Exercise 07
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; i<10; ){
            System.out.println("Hello Java");
        }
        System.out.println("End.");
    }
}
*/

//Exercise 08
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(int i=0; ; i++){ //default condition ->true
            System.out.println("Hello Java");
        }
        //System.out.println("End.");
    }
}
*/

//Exercise 09
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(char ch='A'; ch!='Z'; ch++){
            System.out.println("ch :"+ch);
        }
        System.out.println("End.");
    }
}
*/

//Exercise 10
/*
class Example{
    public static void main(String args[]){
        System.out.println("Start");
        for(double d=10.1; d<11; d++){
            System.out.println("d : "+d);
        }
        System.out.println("End.");
    }
}
*/

//========================================================================================

//Exercise 11
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input a number " );
        int x0=input.nextInt();

        System.out.print("Input a number " );
        int x1=input.nextInt();

        System.out.print("Input a number " );
        int x2=input.nextInt();

        System.out.print("Input a number " );
        int x3=input.nextInt();

        System.out.print("Input a number " );
        int x4=input.nextInt();

        System.out.print("Input a number " );
        int x5=input.nextInt();

        System.out.print("Input a number " );
        int x6=input.nextInt();

        System.out.print("Input a number " );
        int x7=input.nextInt();

        System.out.print("Input a number " );
        int x8=input.nextInt();

        System.out.print("Input a number " );
        int x9=input.nextInt();

        int total=x0+x1+x2+x3+x4+x5+x6+x7+x8+x9;
        System.out.println("Total : "+total);
    }
}
*/

//Exercise 12 From 11
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x;
        int total=0;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.print("Input a number " );
        x=input.nextInt();
        total=total+x;

        System.out.println("Total : "+total);
    }
}
*/

//Exercise 13 From 12
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x;
        int total=0;

        for(int i=0; i<10; i++){
            System.out.print("Input a number " );
            x=input.nextInt();
            total=total+x;
        }

        System.out.println("Total : "+total);
    }
}
*/

//Exercise 14 From 13
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x;
        int total=0;

        for(int i=0; i<10; i++){
            System.out.print("Input number i : " );
            x=input.nextInt();
            total=total+x;
        }
        System.out.println("Total : "+total);
    }
}
*/

//Exercise 15 From 14
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x;
        int total=0;

        for(int i=0; i<10; i++){
            System.out.print("Input number "+(i+1)+" : " );
            x=input.nextInt();
            total=total+x;
        }
        System.out.println("Total : "+total);
    }
}
*/
