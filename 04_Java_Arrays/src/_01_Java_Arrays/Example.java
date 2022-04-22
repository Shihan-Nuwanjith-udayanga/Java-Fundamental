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


// ===========================================================================================================

// Case I
//========
/*
class Example{
    public static void main(String args[]){
        int x;
        x=100;
        System.out.println(x);
        //--------------------
        int[] xr; //Create an array reference/ address variable
        xr=new int[5]; //Create an array Object( array Unit)
        System.out.println(xr); //Print the array address
        xr[0]=100;
        System.out.println(xr[0]);
    }
}
*/

// Case II (3 steps to create an array)
//======================================
/*
class Example{
    public static void main(String args[]){
        int[] xr; //Array Declaration
        xr=new int[5]; //Array Construction
        xr[0]=100; //Array Initialization
        xr[1]=100; //Array Initialization
    }
}
*/

// Case III
//===========
/*
class Example{
    public static void main(String args[]){
        int[] a;
        int []b;
        int c[];

        int d[4]; //Illegal
    }
}
*/

// Case IV (Default Values)
//==========================
/*
class Example{
    public static void main(String args[]){
        int x;
        //System.out.println(x); //Illegal

        int[] a=new int[3];
        System.out.println(a[0]+" "+a[1]+" "+a[2]); //0 0 0
    }
}
*/

//============================================================================================================

/*
class Example{
    public static void main(String args[]){
        int[] a=new int[3];
        System.out.println(a[0]+" "+a[1]+" "+a[2]); //0 0 0
        short[] b=new short[3];
        System.out.println(b[0]+" "+b[1]+" "+b[2]); //0 0 0
        long[] c=new long[3];
        System.out.println(c[0]+" "+c[1]+" "+c[2]); //0 0 0
        float[] d=new float[3];
        System.out.println(d[0]+" "+d[1]+" "+d[2]); //0.0 0.0 0.0

        boolean[] f=new boolean[3];
        System.out.println(f[0]+" "+f[1]+" "+f[2]); //false false false
    }
}
*/


/*
class Example{
    public static void main(String args[]){
        char ch[] =new char[3];
        System.out.println(ch[0]+" "+ch[1]+" "+ch[2]);

        int code=ch[0];
        System.out.println("Ch[0] : "+code);
    }
}
*/

//============================================================================================================

// Case V
//========
/*
class Example{
    public static void main(String args[]){
        int[] a=new int[5];
        //int[] b=new int[]; //Illegal

        int[] c={10,20,30,40,50};
        int[] d;
        //d={10,20,30,40,50}; //Illegal

        int[] e=new int[]{10,20,30,40,50};
        int[] f;
        f=new int[]{10,20,30,40,50}; //Legal

        int[] g=new int[5]{10,20,30,40,50}; //IllegaL
    }
}
*/

// Case VI  Length of an array (Size)
//===================================
/*
class Example{
    public static void main(String args[]){
        int[] a=new int[12];
        System.out.println("Length/Size : "+a.length);
    }
}
*/

// Case VII (Array Index out of bounds error)
// ==========================================
/*
class Example{
    public static void main(String args[]){
        int[] a=new int[3];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;  //

        a[10000000]=23; //Legal
        a[-12]=233;
    }
}
*/

// Case VIII
// =========
/*
class Example{
    public static void main(String args[]){
        int[] a=new int[3];
        int[] b={10,20,30};
        System.out.println(a[0]+" "+a[1]+" "+a[2]);//0 0 0
        System.out.println(b[0]+" "+b[1]+" "+b[2]);//10 20 30
        System.out.println(a==b); //false

        a=b; //?
        System.out.println(a[0]+" "+a[1]+" "+a[2]);//
        System.out.println(b[0]+" "+b[1]+" "+b[2]);//
        System.out.println(a==b); //true
    }
}
*/

// Case IX
// =======
/*
class Example{
    public static void main(String args[]){
        int[] xr=new int[2];
        int x=100;
        xr=100;
        x=new int[2];
        xr=x;
        x=(int)xr;
    }
}
*/

// Case X
// =======
/*
class Example{
    public static void main(String args[]){
        int[] xr=new int[2];
        double[] dr=new double[2];
        dr[0]=xr[0]; //?
        xr[0]=dr[0]; //?
        xr[0]=(int)dr[0]; //?

        dr=xr;
        xr=dr;
        dr=(double[])xr;
        xr=(int[])dr;
    }
}
*/
