package _07_Merge_Array;

// ======================================== Merge array ==================================================

//Step 01
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] xr1={1,2,3,4,5};
        int[] xr2={10,20,30,40,50};
        System.out.println(Arrays.toString(xr1));//[1,2,3,4,5]
        System.out.println(Arrays.toString(xr2));//[10,20,30,40,50]

        int[] xr3=mergeArrays(xr1,xr2);
        System.out.println(Arrays.toString(xr3));//[1,2,3,4,5,10,20,30,40,50]
    }
}
*/

//Step 02
/*
import java.util.*;
public class Example {
    public static int[] mergeArrays(int[] x, int[] y){
        int[] z=new int[x.length+y.length];
        //copy values from x to z
        //copy values from y to z
        return z;
    }
    public static void main(String[] args) {
        int[] xr1={1,2,3,4,5};
        int[] xr2={10,20,30,40,50};
        System.out.println(Arrays.toString(xr1));//[1,2,3,4,5]
        System.out.println(Arrays.toString(xr2));//[10,20,30,40,50]

        int[] xr3=mergeArrays(xr1,xr2);
        System.out.println(Arrays.toString(xr3));//[1,2,3,4,5,10,20,30,40,50]
    }
}
*/

//Step 03
/*
import java.util.*;
public class Example {
    public static int[] mergeArrays(int[] x, int[] y){
        int[] z=new int[x.length+y.length];
        System.arraycopy(x,0,z,0,x.length);
        System.arraycopy(y,0,z,x.length,y.length);
        return z;
    }
    public static void main(String[] args) {
        int[] xr1={1,2,3,4,5};
        int[] xr2={10,20,30,40,50};
        System.out.println(Arrays.toString(xr1));
        System.out.println(Arrays.toString(xr2));

        int[] xr3=mergeArrays(xr1,xr2);
        System.out.println(Arrays.toString(xr3));
    }
}
*/


// =======================================================================================================

//Exercise
/*
public class Example {
    public static void main(String[] args) {
        int[] xr1={1,2,3,4,5};
        int[] xr2={10,20,30,40,50};
        int[] xr3={1,2,3,4,5};
        int[] xr4={1,2,0,4,5};
        int[] xr5={1,2,3,4};

        boolean isSameArrays;
        isSameArrays=equals(xr1,xr2)
        System.out.println("xr1, xr2, Same array : "+isSameArrays);//false

        isSameArrays=equals(xr1,xr3)
        System.out.println("xr1, xr3, Same array : "+isSameArrays); //true

        isSameArrays=equals(xr1,xr4)
        System.out.println("xr1, xr4, Same array : "+isSameArrays); //false

        isSameArrays=equals(xr1,xr5)
        System.out.println("xr1, xr5, Same array : "+isSameArrays); //false
    }
}
*/
