package _05_Boolean_logical_operators;

// =================================== Boolean Logical Operators =====================================

/*
                                & - Boolean AND
                                | - Boolean OR
                                ^ - Boolean XOR
                                ! - Boolean NOT
                                &&- Short Circuit AND
                                ||- Short Circuit OR
                                :?- Ternary
*/

/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.print("Input Student average : ");
        double avg=input.nextDouble();

        System.out.print("Input Student attendence : ");
        double atten=input.nextDouble();

        if(avg>=50 | atten>=80){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}
*/

//=========================================================================

// Short Circuit boolean OR(||) vs boolean OR(|)
/*
class Example{
    public static void main(String args[]){
        int x=5, y=3;
        System.out.println(x+" "+y); //5 3
        if(x++ == 5 | y++ == 5){
            //code for win case
        }
        System.out.println(x+" "+y); //6  4
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        int x=5, y=3;
        System.out.println(x+" "+y); //5 3
        if(x++ == 5 || y++ == 5){
            //code for win case
        }
        System.out.println(x+" "+y); //6  3
    }
}
*/

//=========================================================================

//Short Circuit boolean AND(&&) vs boolean AND(&)
/*
class Example{
    public static void main(String args[]){
        int x=3, y=5;
        System.out.println(x+" "+y); //3 5
        if(x++ == 5 & y++ == 5){
            //code for win case
        }
        System.out.println(x+" "+y); //4 6
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        int x=3, y=5;
        System.out.println(x+" "+y); //3 5
        if(x++ == 5 && y++ == 5){
            //code for win case
        }
        System.out.println(x+" "+y); //4 5
    }
}
*/
