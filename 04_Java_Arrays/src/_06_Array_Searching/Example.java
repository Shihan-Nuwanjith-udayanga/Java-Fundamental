package _06_Array_Searching;

// =================================== Array Searching =============================================

//lastIndexOf
//===========
//Step 01
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] xr={89,78,12,54,90,5,7,67,78,84,99};
        System.out.println(Arrays.toString(xr)); //[89,78,12,54,90....]
        int index;

        index=lastIndexOf(xr,12);
        System.out.println("Index of 12 : "+index); //2

        index=lastIndexOf(xr,78);
        System.out.println("Index of 78 : "+index); //8

        index=lastIndexOf(xr,50);
        System.out.println("Index of 50 : "+index); //-1
    }
}
*/

//Step 02 From 01
/*
import java.util.*;
public class Example {
    public static int lastIndexOf(int []x, int key){
        int index=-1;
        for (int i = 0; i < x.length; i++){
            if(x[i]==key){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] xr={89,78,12,54,90,5,7,67,78,84,99};
        System.out.println(Arrays.toString(xr)); //[89,78,12,54,90....]
        int index;

        index=lastIndexOf(xr,12);
        System.out.println("Index of 12 : "+index); //2

        index=lastIndexOf(xr,78);
        System.out.println("Index of 78 : "+index); //8

        index=lastIndexOf(xr,50);
        System.out.println("Index of 50 : "+index); //-1
    }
}
*/

// =========================================================================================================

//firstIndexOf
//============
//Step 01
/*
import java.util.*;
public class Example {
    public static int firstIndexOf(int []x, int key){
        int index=-1;
        for (int i = 0; i < x.length; i++){
            if(x[i]==key){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] xr={89,78,12,54,90,5,7,67,78,84,99};
        System.out.println(Arrays.toString(xr)); //[89,78,12,54,90....]
        int index;

        index=firstIndexOf(xr,12);
        System.out.println("Index of 12 : "+index); //2

        index=firstIndexOf(xr,78);
        System.out.println("Index of 78 : "+index); //1

        index=firstIndexOf(xr,50);
        System.out.println("Index of 50 : "+index); //-1
    }
}
*/

//Step 02 From 01
/*
import java.util.*;
public class Example {
    public static int firstIndexOf(int []x, int key){
        for (int i = 0; i < x.length; i++){
            if(x[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] xr={89,78,12,54,90,5,7,67,78,84,99};
        System.out.println(Arrays.toString(xr)); //[89,78,12,54,90....]
        int index;

        index=firstIndexOf(xr,12);
        System.out.println("Index of 12 : "+index); //2

        index=firstIndexOf(xr,78);
        System.out.println("Index of 78 : "+index); //1

        index=firstIndexOf(xr,50);
        System.out.println("Index of 50 : "+index); //-1
    }
}
*/

// ===========================================================================================================

