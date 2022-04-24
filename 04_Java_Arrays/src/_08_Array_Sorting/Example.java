package _08_Array_Sorting;

// ====================================== Array Sorting ==================================================

// ======================================= Bubble Sort ===================================================

//Step I
//======
/*
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] xr={99,78,67,12,65,54,43,23,67,11};
        System.out.println(Arrays.toString(xr)); //99,78,67
        bubbleSort(xr);
        System.out.println(Arrays.toString(xr)); //11, 12, 23, 43,
    }
}
*/

//Step II
//=======
/*
import java.util.*;
public class Example {
    public static void bubbleSort(int[] x){

    }
    public static void main(String[] args) {
        int[] xr={99,78,67,12,65,54,43,23,67,11};
        System.out.println(Arrays.toString(xr)); //99,78,67
        bubbleSort(xr);
        System.out.println(Arrays.toString(xr)); //11, 12, 23, 43,
    }
}
*/

//Step III
//========
/*
import java.util.*;
public class Example {
    public static void bubbleSort(int[] x){
        if(x[0]>x[1]){
            int t=x[0];
            x[0]=x[1];
            x[1]=t;
        }
        if(x[1]>x[2]){
            int t=x[1];
            x[1]=x[2];
            x[2]=t;
        }
        if(x[2]>x[3]){
            int t=x[2];
            x[2]=x[3];
            x[3]=t;
        }
    }
    public static void main(String[] args) {
        int[] xr={99,78,67,12,65,54,43,23,67,11};
        System.out.println(Arrays.toString(xr)); //99,78,67
        bubbleSort(xr);
        System.out.println(Arrays.toString(xr)); //11, 12, 23, 43,
    }
}
*/

//Step IV (Runtime Error)
//=======================
/*
import java.util.*;
public class Example {
    public static void bubbleSort(int[] x){
        for(int i=0; i<x.length; i++){
            if(x[i]>x[i+1]){
                int t=x[i];
                x[i]=x[i+1];
                x[i+1]=t;
            }
        }
    }
    public static void main(String[] args) {
        int[] xr={99,78,67,12,65,54,43,23,67,11};
        System.out.println(Arrays.toString(xr)); //99,78,67
        bubbleSort(xr);
        System.out.println(Arrays.toString(xr)); //11, 12, 23, 43,
    }
}
*/

//Step V
//======
/*
import java.util.*;
public class Example {
    public static void bubbleSort(int[] x){
        for(int i=0; i<x.length-1; i++){
            if(x[i]>x[i+1]){
                int t=x[i];
                x[i]=x[i+1];
                x[i+1]=t;
            }
        }
    }
    public static void main(String[] args) {
        int[] xr={99,78,67,12,65,54,43,23,67,11};
        System.out.println(Arrays.toString(xr)); //99,78,67
        bubbleSort(xr);
        System.out.println(Arrays.toString(xr)); //11, 12, 23, 43,
    }
}
*/

//Step VI
//=======
/*
import java.util.*;
public class Example {
    public static void bubbleSort(int[] x){
        for(int j=0; j<x.length-1; j++){
            for(int i=0; i<x.length-1; i++){
                if(x[i]>x[i+1]){
                    int t=x[i];
                    x[i]=x[i+1];
                    x[i+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] xr={99,78,67,12,65,54,43,23,67,11};
        System.out.println(Arrays.toString(xr)); //99,78,67
        bubbleSort(xr);
        System.out.println(Arrays.toString(xr)); //11, 12, 23, 43,
    }
}
*/

//Step VII
//========
/*
import java.util.*;
public class Example {
    public static void bubbleSort(int[] x){
        for(int j=0; j<x.length-1; j++){
            for(int i=0; i<x.length-1; i++){
                if(x[i]>x[i+1]){
                    int t=x[i];
                    x[i]=x[i+1];
                    x[i+1]=t;
                }
                System.out.println(Arrays.toString(x)); //
                try{Thread.sleep(500);}catch(Exception ex){}
            }
        }
    }
    public static void main(String[] args) {
        int[] xr={99,89,79,69,59,49,39,29,19,9,0};
        System.out.println(Arrays.toString(xr)); //
        bubbleSort(xr);
        System.out.println(Arrays.toString(xr)); //
    }
}
*/

//Step VIII
//=========











// ==========================================================================================================

