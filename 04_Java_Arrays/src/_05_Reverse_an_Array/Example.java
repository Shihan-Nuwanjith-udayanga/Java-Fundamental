package _05_Reverse_an_Array;

// ======================================== Reverse an Array ==================================================

//Step 01
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] xr={89,78,12,54,90,5,7,67,71,84,99};
        System.out.println(Arrays.toString(xr)); //[89,78,12,54,90....]
        reverse(xr);
        System.out.println(Arrays.toString(xr));//[99,84,71,67,7,5...]
    }
}

*/

//Step 02
/*
import java.util.*;
public class Example {
    public static void reverse(int[] x){
		*/
/*int i=0,j=x.length-1;
		while(i<j){
			int t=x[i];
			x[i]=x[j];
			x[j]=t;
			System.out.println(i+" "+j);
			i++;j--;

		}*//*

        for(int i=0,j=x.length-1; i<j; i++,j--){
            int t=x[i];
            x[i]=x[j];
            x[j]=t;
        }
    }
    public static void main(String[] args) {
        int[] xr={89,78,12,54,90,5,7,67,71,84,99};
        System.out.println(Arrays.toString(xr)); //[89,78,12,54,90....]
        reverse(xr);
        System.out.println(Arrays.toString(xr));//[99,84,71,67,7,5...]
    }
}
*/
