package _03_Passing_an_array_to_a_method;

// ============================ Passing an array to a method =======================================

// Method Call by values
/*
class Example{
    public static void increment(int x, int y, int z){
        x++;
        y++;
        z++;
    }
    public static void main(String args[]){
        int[] ar={100,200,300};
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
        increment(ar[0],ar[1],ar[2]); //Call by values
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
    }
}
*/

// Method Call by reference
/*
class Example{
    public static void increment(int[] xr){
        for (int i = 0; i < xr.length; i++){
            xr[i]++;
        }
    }
    public static void main(String args[]){
        int[] ar={100,200,300};
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
        increment(ar); //Call by reference
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
    }
}
*/


// ==========================================================================================================

// Exercise
/*
import java.util.Random;
import java.util.Scanner;

public class Example {
    public static int[] createIntArray(int size){
        int[] array=new int[size];
        return array;
    }
    public static void readMarks(int[] x){
        Random r=new Random();
        for (int i = 0; i < x.length; i++){
            x[i]=r.nextInt(101);
        }
    }
    public static int findTotal(int[] x){
        int total=0;
        for (int i = 0; i < x.length; i++){
            total+=x[i];
        }
        return total;
    }
    public static int findMax(int[] x){
        int max=x[0];
        for (int i = 1; i < x.length; i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        return max;
    }
    public static int findMin(int[] x){
        int min=x[0];
        for (int i = 1; i < x.length; i++){
            if(x[i]<min){
                min=x[i];
            }
        }
        return min;
    }
    public static void printMarks(int []x){
        System.out.print("[");
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]+", ");
        }
        System.out.println("\b\b]");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of students : " );
        final int N=input.nextInt();

        //1. Create an array named "marks" to to students marks
        int[] marks=createIntArray(N);

        //Read marks (Read Random Numbers 0 to 100)
        readMarks(marks);


        //Find total
        int total;
        total=findTotal(marks);

        //Find the max
        int max;
        max=findMax(marks);

        //Find the min
        int min;
        min=findMin(marks);

        printMarks(marks); //[23,54,65,23,76,46, .....]

        System.out.println("Total   : " + total);
        System.out.println("Max     : " + max);
        System.out.println("Min     : " + min);
    }
}
*/
