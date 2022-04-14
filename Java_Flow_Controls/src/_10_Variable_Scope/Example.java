package _10_Variable_Scope;

// ========================== Variable Scope and lifetime ================================

//Q-01
/*
class Example{
    public static void main(String args[]){
        int x=100;
        System.out.println(x);
        {
            int y=200;
            System.out.println(x);
            System.out.println(y);
            x++;y++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
*/

//Q-02 From Q-01
/*
class Example{
    public static void main(String args[]){
        int x=100;
        System.out.println(x);
        {
            int y=200;
            System.out.println(x);
            System.out.println(y);
            x++;y++;
            //int y=2; //Illegal
        }
        //int x=1; //Illegal
        int y=2; //Legal ?
        System.out.println(x);
        System.out.println(y);
    }
}
*/

//Q-03
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        int x=100;
        System.out.println(x);	//Line 1
        System.out.println(y);	//Line 2
        System.out.println(z);	//Line 3
        {
            int z=200;
            System.out.println(x);	//Line 4
            System.out.println(y);	//Line 5
            System.out.println(z);	//Line 6
            {
                int z=300;
                System.out.println(x);	//Line 7
                System.out.println(y);	//Line 8
                System.out.println(z);	//Line 9
            }
            System.out.println(x);	//Line 10
            System.out.println(y);	//Line 11
            System.out.println(z);	//Line 12
        }
        System.out.println(x);	//Line 13
        System.out.println(y);	//Line 14
        System.out.println(z);	//Line 15

    }
}
*/

//Q-04
/*
class Example{
    public static void main(String args[]){
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        {
            int y=100;
            System.out.println(y);
            y++;
        }
    }
}
*/

//Q-05
/*
class Example{
    public static void main(String args[]){
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        {
            int y=100;
            System.out.println(y);
            y++;
        }
        int y=0;
        {
            int y=100; //Illegal
            System.out.println(y);
            y++;
        }
    }
}
*/

//Q-06
/*
class Example{
    public static void main(String args[]){
        int y=100;
        {
            y++;
        }
        System.out.println(y);
    }
}
*/

//Q-07
/*
class Example{
    public static void main(String args[]){
        int x=100;
        if(x>0){
            int y=100;
        }else{
            System.out.println(y); //Illegal
        }
    }
}
*/

//Q-08
/*
class Example{
    public static void main(String args[]){
        int x=100;
        if(x>0){
            int y=100;
            System.out.println(y);
        }else{
            int y=200;
            System.out.println(y);
        }
    }
}
*/

//Q-09
/*
class Example{
    public static void main(String args[]){
        int x=100;
        if(x>0){
            int y=100;
        }else{
            int y=200;
        }
        if(x>10){
            int y=300;
        }
        int y=400;
        if(x==100){
            //
        }else{
            int y=500;
        }
        System.out.println(y);
    }
}
*/

//Q-10
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<10;i++){
            System.out.println(i);
        }
        System.out.println(i);//Illegal
    }
}
*/

//Q-11
/*
class Example{
    public static void main(String args[]){
        for(int i=0; i<10;i++){
            int j=0;
            System.out.println(i+" "+j);
            j++;
        }
        //System.out.println(i);//Illegal
        //System.out.println(j);//Illegal
    }
}
*/

