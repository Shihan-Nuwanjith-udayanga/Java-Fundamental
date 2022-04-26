package _09_Multi_dimemsional_Arrays;

// ================================= Multi-dimensional Arrays =========================================

/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        //int[] marks=new int[10];
        int[] s0=new int[4];
        int[] s1=new int[4];
        int[] s2=new int[4];
        int[] s3=new int[4];
        int[] s4=new int[4];
        int[] s5=new int[4];
        int[] s6=new int[4];
        int[] s7=new int[4];
        int[] s8=new int[4];
        int[] s9=new int[4];

        Scanner input=new Scanner(System.in);

        System.out.println("Input marks for student 1 ...");
        for(int j=0; j<4; j++){
            System.out.print("\tSub"+(j+1)+" : ");
            s0[j]=input.nextInt();
        }

        System.out.println("Input marks for student 2 ...");
        for(int j=0; j<4; j++){
            System.out.print("\tSub"+(j+1)+" : ");
            s1[j]=input.nextInt();
        }

        System.out.println("Input marks for student 3 ...");
        for(int j=0; j<4; j++){
            System.out.print("\tSub"+(j+1)+" : ");
            s2[j]=input.nextInt();
        }

    }
}
*/


// Illegal Program
// ===============
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        //int[] marks=new int[10];
        int[] s0=new int[4];
        int[] s1=new int[4];
        int[] s2=new int[4];
        int[] s3=new int[4];
        int[] s4=new int[4];
        int[] s5=new int[4];
        int[] s6=new int[4];
        int[] s7=new int[4];
        int[] s8=new int[4];
        int[] s9=new int[4];

        Scanner input=new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Input marks for student "+(i+1)+" ...");
            for(int j=0; j<4; j++){
                System.out.print("\tSub"+(j+1)+" : ");
                si[j]=input.nextInt(); //Ilegal
            }
        }
    }
}
*/



// Using a two Dimensional array
// =============================
// Step I
// ------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[][] s=new int[10][4];

        Scanner input=new Scanner(System.in);

        System.out.println("Input marks for student 1 ...");
        for(int j=0; j<4; j++){
            System.out.print("\tSub"+(j+1)+" : ");
            s[0][j]=input.nextInt();
        }

        System.out.println("Input marks for student 2 ...");
        for(int j=0; j<4; j++){
            System.out.print("\tSub"+(j+1)+" : ");
            s[1][j]=input.nextInt();
        }

        System.out.println("Input marks for student 3 ...");
        for(int j=0; j<4; j++){
            System.out.print("\tSub"+(j+1)+" : ");
            s[2][j]=input.nextInt();
        }


    }
}
*/

// Step II
// -------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[][] s=new int[10][4];
        Scanner input=new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Input marks for student "+(i+1)+" ...");
            for(int j=0; j<4; j++){
                System.out.print("\tSub"+(j+1)+" : ");
                s[i][j]=input.nextInt();
            }
        }
    }
}
*/

// Step III (using Random Numbers)
// ------------------------------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[][] s=new int[10][4];
        Random r=new Random();
        for(int i=0; i<10; i++){
            for(int j=0; j<4; j++){
                s[i][j]=r.nextInt(101);
            }
        }
        //-------Print marks in a tabular form---------

    }
}
*/

// Step IV (Print data of a twoD array in a tabular form)
// -------------------------------------------------------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[][] s=new int[10][4];
        Random r=new Random();
        for(int i=0; i<10; i++){
            for(int j=0; j<4; j++){
                s[i][j]=r.nextInt(101);
            }
        }
        //-------Print marks in a tabular form---------
        for(int j=0; j<4; j++){
            System.out.print(s[0][j]+"\t");
        }
        System.out.println();

        for(int j=0; j<4; j++){
            System.out.print(s[1][j]+"\t");
        }
        System.out.println();

        for(int j=0; j<4; j++){
            System.out.print(s[2][j]+"\t");
        }
        System.out.println();
    }
}
*/

// Step V
// -------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[][] s=new int[10][4];
        Random r=new Random();
        for(int i=0; i<10; i++){
            for(int j=0; j<4; j++){
                s[i][j]=r.nextInt(101);
            }
        }
        //-------Print marks in a tabular form---------
        for(int i=0; i<10; i++){
            for(int j=0; j<4; j++){
                System.out.print(s[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
*/

// ============================================================================================================

// ============================================================================================================

// Case I
// ------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] ar;
        ar=new int[4];
        System.out.println(ar);
        System.out.println(ar[0]);

        int[][] br;
        br=new int[4][3];
        System.out.println(br);
        System.out.println(br[0]);
        System.out.println(br[0][0]);
    }
}
*/

// Case II (3D Arrays)
// ------------------
import java.util.*;
/*
public class Example {
    public static void main(String[] args) {
        int[][][] cr;
        cr=new int[4][3][2];
        System.out.println(cr);
        System.out.println(cr[0]);
        System.out.println(cr[0][0]);
        System.out.println(cr[0][0][0]);
    }
}
*/


// Case III
// --------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[][][] x,y,z; //x,y,z --> 3D type reference Variables
        int p, q[], r[][], s[][][]; //p->int, q->1D, r-->2D, s-->3D

        int[][] a,b[],c,d[][];
        //a-->2D
        //b-->3D
        //c-->2D
        //d-->4D
    }
}
*/


// Case IV
// -------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        //----------Method 1----------------------
        int[][] a=new int[4][3];

        //----------Method 2----------------------
        int[][] b=new int[4][]; //Legal
        System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
        b[0]=new int[4];
        b[1]=new int[3];
        b[2]=new int[5];
        b[3]=new int[7];
        System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]);

        //----------Method 3----------------------
        int[] p={}; //Legal
        System.out.println("length of p : "+p.length); //0
        int[][] c={}; //Legal
        System.out.println("length of c : "+c.length); //0
        //int[][] d={12,23,34,54}; //Illegal
        int[][] e={{12,23,34,54}};
        System.out.println("length of e : "+e.length); //1
        int[][] f={{12,23,34},{54,23,85,34},{23,65,76,35,75}};
        System.out.println("length of f : "+f.length); //3

    }
}
*/


// Case V
// ------
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[][] f={{12,23,34},{54,23,85,34},{23,65,76,35,75}};
        //print data in a tabular
        for(int i=0; i<f.length; i++){
            for(int j=0; j<f[i].length; j++){
                System.out.print(f[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
*/

// Case VI (Passing twoD array into a method)
// ------------------------------------------
/*
public class Example {
    public static void printData(int [][]x){
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] f={{12,23,34},{54,23,85,34},{23,65,76,35,75}};
        printData(f);
    }
}
*/


// Case VII (for-each)
// -------------------
/*
public class Example {
    public static void main(String[] args) {
        int[][] f={{12,23,34},{54,23,85,34},{23,65,76,35,75}};
        //prints elements using "for-each"

    }
}
*/

// --------------------------------------------------------------------
/*
public class Example {
    public static void main(String[] args) {
        int[][] f={{12,23,34},{54,23,85,34},{23,65,76,35,75}};
        //using "for-each"
        for(int []ar : f ){
            for(int a : ar){
                System.out.print(a+"\t");
            }
            System.out.println();
        }
    }
}
*/


// ===============================================================================================

//Exercise 01
/*
import java.util.*;
public class Example {
    public static int[][] createTwoDArray(int size){
        Scanner input=new Scanner(System.in);
        int[][] marks=new int[size][];
        for (int i = 0; i < marks.length; i++){
            System.out.print("Input no of subjects for student "+(i+1)+" : ");
            int s=input.nextInt();
            marks[i]=new int[s];
        }
        return marks;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input no of students : ");
        final int N=input.nextInt();

        //1. create twoD array to input marks
        int[][] marks=createTwoDArray(N);

        //2. Read marks (Random numbers 0 to 100)
        readMarks(marks);

        //3. Print marks table
        printMarks(marks);
    }
}
*/

//Exercise 02 From 01
/*
public class Example {
    public static int[][] createTwoDArray(int size){
        Scanner input=new Scanner(System.in);
        int[][] marks=new int[size][];
        for (int i = 0; i < marks.length; i++){
            System.out.print("Input no of subjects for student "+(i+1)+" : ");
            int s=input.nextInt();
            marks[i]=new int[s];
        }
        return marks;
    }
    public static void readMarks(int[][] x){
        Random r=new Random();
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                x[i][j]=r.nextInt(101);
            }
        }
    }
    public static void printMarks(int[][] f){
        for(int i=0; i<f.length; i++){
            for(int j=0; j<f[i].length; j++){
                System.out.print(f[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input no of students : ");
        final int N=input.nextInt();

        //1. create twoD array to input marks
        int[][] marks=createTwoDArray(N);

        //2. Read marks (Random numbers 0 to 100)
        readMarks(marks);

        //3. Print marks table
        printMarks(marks);
    }
}
*/
