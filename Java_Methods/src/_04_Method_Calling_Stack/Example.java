package _04_Method_Calling_Stack;

// =================================== Method Calling Stack ================================

//Step I
/*
class Example{
    public static void myMethod(){
        System.out.println("Start myMethod");
        System.out.println("End myMethod");
    }
    public static void main(String args[]){
        System.out.println("Start main");
        myMethod();
        System.out.println("End main");
    }
}
*/

//Step II
/*
class Example{
    public static void increment(){
        int x=100;
        System.out.println(x);
        x++;
        System.out.println(x);
    }
    public static void main(String args[]){
        int x=100;
        System.out.println(x);
        increment();
        System.out.println(x);
    }
}
*/

//Step III
/*
class Example{
    public static void increment(int x){
        System.out.println(x);
        x++;
        System.out.println(x);
    }
    public static void main(String args[]){
        int x=100;
        System.out.println(x);
        increment(x);
        System.out.println(x);
    }
}
*/

//Step IV
/*
class Example{
    public static int increment(int x){
        System.out.println(x);
        x++;
        System.out.println(x);
        return x;
    }
    public static void main(String args[]){
        int x=100;
        System.out.println(x);
        increment(x);
        System.out.println(x);
        x=increment(x);
        System.out.println(x);
        x=increment(x);
        System.out.println(x);
    }
}
*/
