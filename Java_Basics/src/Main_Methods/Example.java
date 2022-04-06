package Main_Methods;

// ============= Basic Layout of Java ( Java Source code ) ==============
/*
class Example {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
*/

// ===================================================================================

// ================== Valid Main Methods =======================

//01
/* class Example{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}*/

//02
/* class Example{
    static public void main(String[] args) { // static public ....
        System.out.println("Hello World");
    }
}*/

//03
/* class Example{
    public static void main(String Shihan []) {
        System.out.println("Hello world");
    }
}*/

//04
/*
 class Example{
    public static void main(String ... args) {
        System.out.println("Hello World");
    }
}*/

//05
/*
 class Example{
    public static void main(String args []) {
        System.out.println("Hello world");
    }
}*/

//06
/*
 class Exmpale{
    static public void main(String args []) {
        System.out.println("Hello World");
    }
}
*/


// ===================================================================================

// ============= Invalid Main Methods (Compile ok , runtime error =================

//01
/*
 class Example{
    public static void Main(String[] args) {  //Main
        System.out.println("Hello World");
    }
}
*/

//02
/*
 class Example{
    public static void main(String args) {   // []
        System.out.println("Hello World");
    }
}
*/

//03
/*
 class Example{
    public static void main( ) {   // String args []
        System.out.println("Hello World");
    }
}
*/

//04
/*
 class Example{
    static void main(String[] args) {     // public
        System.out.println("Hello World");
    }
}
*/

//05
/*
 class Example{
    public void main(String[] args) {     //static
        System.out.println("Hello World");
    }
}
*/

//06
/*
 class Example{
    void main(String[] args) {    //public static
        System.out.println("Hello World");
    }
}
*/

// ===================================================================================

// ============= Illegal Main Methods (Compile error =================

//01
/*
 class Example{
    public void static main(String[] args) {
        System.out.println("Hello World");
    }
}
*/

//02
/*
 class Example{
    public static void main(String []) {    //args
        System.out.println("Hello World");
    }
}*/

//03
/*
 class Example{
    public static main(String[] args) {   //void
        System.out.println("Hello World");
    }
}
*/

//04
/*
 class Example{
    public static void(String[] args) {    //main
        System.out.println("Hello World");
    }
}
*/

//05
/*
 class Example{
    public static void main(string[] args) {   //string
        System.out.println("Hello World");
    }
}
*/

//06
/*
 class Example{
    public static void main(args []) {      //String
        System.out.println("Hello World");
    }
}
*/

//07
/*
 class Example{
    public static void main(args) {      //String []
        System.out.println("Hello World");
    }
}
*/

// ===================================================================================

// ======= Source code commands / Java Cording run top to bottom line by line ==========

/*
class Example{
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
    }
}
*/

/*
output - A
         B
         C
         D
*/
