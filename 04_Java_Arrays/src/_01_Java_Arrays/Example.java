package _01_Java_Arrays;

// ================================== Java Arrays ============================================

//step 01
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int x0,x1,x2,x3,x4,x5,x6,x7,x8,x9;

        System.out.print("Input a number " );
        x0=input.nextInt();

        System.out.print("Input a number " );
        x1=input.nextInt();

        System.out.print("Input a number " );
        x2=input.nextInt();

        System.out.print("Input a number " );
        x3=input.nextInt();

        System.out.print("Input a number " );
        x4=input.nextInt();

        System.out.print("Input a number " );
        x5=input.nextInt();

        System.out.print("Input a number " );
        x6=input.nextInt();

        System.out.print("Input a number " );
        x7=input.nextInt();

        System.out.print("Input a number " );
        x8=input.nextInt();

        System.out.print("Input a number " );
        x9=input.nextInt();

        int total=0;
        total+=x0;
        total+=x1;
        total+=x2;
        total+=x3;
        total+=x4;
        total+=x5;
        total+=x6;
        total+=x7;
        total+=x8;
        total+=x9;

        System.out.println("Total : "+total);
    }
}
*/

//Step 02
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int x0,x1,x2,x3,x4,x5,x6,x7,x8,x9;
        for(int i=0; i<10; i++){
            System.out.print("Input a number " );
            x(i)=input.nextInt(); //Illegal
        }

        int total=0;
        total+=x0;
        total+=x1;
        total+=x2;
        total+=x3;
        total+=x4;
        total+=x5;
        total+=x6;
        total+=x7;
        total+=x8;
        total+=x9;

        System.out.println("Total : "+total);
    }
}
*/

//Step 03 (Using an array)
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int[] x=new int[10]; //int x0,x1,x2,x3,x4,x5,x6,x7,x8,x9;

        System.out.print("Input a number " );
        x[0]=input.nextInt();

        System.out.print("Input a number " );
        x[1]=input.nextInt();

        System.out.print("Input a number " );
        x[2]=input.nextInt();

        System.out.print("Input a number " );
        x[3]=input.nextInt();

        System.out.print("Input a number " );
        x[4]=input.nextInt();

        System.out.print("Input a number " );
        x[5]=input.nextInt();

        System.out.print("Input a number " );
        x[6]=input.nextInt();

        System.out.print("Input a number " );
        x[7]=input.nextInt();

        System.out.print("Input a number " );
        x[8]=input.nextInt();

        System.out.print("Input a number " );
        x[9]=input.nextInt();

        int total=0;
        total+=x[0];
        total+=x[1];
        total+=x[2];
        total+=x[3];
        total+=x[4];
        total+=x[5];
        total+=x[6];
        total+=x[7];
        total+=x[8];
        total+=x[9];

        System.out.println("Total : "+total);
    }
}
*/

//Step 04 (Iterating)
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int[] x=new int[10]; //int x0,x1,x2,x3,x4,x5,x6,x7,x8,x9;

        for(int i=0; i<10; i++){
            System.out.print("Input a number " );
            x[i]=input.nextInt();
        }

        int total=0;
        for(int i=0; i<10; i++){
            total+=x[i];
        }
        System.out.println("Total : "+total);
    }
}
*/

