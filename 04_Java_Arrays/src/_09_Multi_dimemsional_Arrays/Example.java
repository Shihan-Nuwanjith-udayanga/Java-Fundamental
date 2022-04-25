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
