package _06_Method_Overloading;

// ============================ Method Overloading ====================================

/*
class Example {
    public static void myMethod(int x){
        System.out.println("myMethod(int)");
    }
    public static void myMethod(double x){
        System.out.println("myMethod(double)");
    }
    public static void main(String args[]) {
        myMethod(100);
        myMethod(100.0);
    }
}
*/

//Case I
/*
class Example {
    public static void myMethod(int x){
        System.out.println("myMethod(int)");
    }
    public static void myMethod(int x, int y){
        System.out.println("myMethod(int,int)");
    }
    public static void main(String args[]) {
        myMethod(100);
        myMethod(100,200);
    }
}
*/

//Case II
/*
class Example {
    public static void myMethod(int x){
        System.out.println("myMethod(int)");
    }
    public static void myMethod(double x){
        System.out.println("myMethod(double)");
    }
    public static void main(String args[]) {
        myMethod(100);
        myMethod(100.0);
    }
}
*/

//Case III
/*
class Example {
    public static void myMethod(double y, int x){
        System.out.println("myMethod(double,int)");
    }
    public static void myMethod(int x, double y){
        System.out.println("myMethod(int,double)");
    }
    public static void main(String args[]) {
        myMethod(100,1.3);
        myMethod(1.0,200);
    }
}
*/

//Case IV (Illegal)
/*
class Example {
    public static int myMethod(){
        System.out.println("myMethod()");
        return 100;
    }
    public static double myMethod(){
        System.out.println("myMethod()");
        return 12.23;
    }
    public static void main(String args[]) {

    }
}
*/

//Case V
/*
class Example {
    public static void myMethod(double y, int x){
        System.out.println("myMethod(double,int)");
    }
    public static void myMethod(int x, double y){
        System.out.println("myMethod(int,double)");
    }
    public static void main(String args[]) {
        myMethod(100,1.3);
        myMethod(1.0,200);
        myMethod(100,200); //Illegal
    }
}
*/
