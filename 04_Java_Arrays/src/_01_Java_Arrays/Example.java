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


// ===========================================================================================================

//Exercise 01
// Step 01
/*
class Example{
    public static void main(String args[]){
        int a=23,b=43,c=14,d=34;

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(d>max){
            max=d;
        }
        System.out.println("Max   : "+max);
    }
}
*/

// Step 02 ( Using Array)
/*
class Example{
    public static void main(String args[]){
        //int a=23,b=43,c=14,d=34;
        int[] x=new int[4];
        x[0]=23;
        x[1]=43;
        x[2]=44;
        x[3]=34;

        int max=x[0];
        for(int i=1 ; i<4; i++){
            if(x[i]>max){
                max=x[i];
            }
        }

        System.out.println("Max   : "+max);
    }
}
*/


// ===========================================================================================================

//Exercise 02
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.print("Input number of students : " );
        final int N=input.nextInt();

        //1. Create an array named "marks" to to students marks
        int[] marks=new int[N];

        //2. Read marks (Random numbers 0 to 100)
        Random r=new Random();
        for (int i = 0; i < N; i++){
            marks[i]=r.nextInt(101); //0 to 100
        }

        //3. Find total marks
        int total=0;
        for (int i = 0; i < N; i++){
            total+=marks[i];
        }

        //4. Find maximum marks
        int max=marks[0];
        for (int i = 1; i < N; i++)	{
            if(marks[i]>max){
                max=marks[i];
            }
        }

        //5. find minimum marks
        int min=marks[0];
        for (int i = 1; i < N; i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }

        //6. print marks as [54,65,34,65,34.......]
        System.out.print("[");
        for (int i = 0; i < N; i++){
            System.out.print(marks[i]+", ");
        }
        System.out.println("\b\b]");


        System.out.println("Total : "+total);
        System.out.println("Max   : "+max);
        System.out.println("Min   : "+min);
    }
}
*/

// ===========================================================================================================

