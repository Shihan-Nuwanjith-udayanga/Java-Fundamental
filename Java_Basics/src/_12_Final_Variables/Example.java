package _12_Final_Variables;

// ================================== Final Variables =====================================

/*
class Example {
    public static void main(String[] args) {
        final int x;
        x=100;
        System.out.println(x);
        x=200; //Illegal ---> x is final
        System.out.println(x);
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        final int x=10;
        x=100; //Illegal
        System.out.println(x);
        x=200; //Illegal
        System.out.println(x);
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        final short s=100;
        byte b;
        b=s;
        System.out.println(b+" "+s);
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        final short s=127;
        byte b;
        b=s; //Legal
        System.out.println(b+" "+s);
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        final short s=128;
        byte b;
        b=s; //Illegal
        System.out.println(b+" "+s);
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        int x=10;
        final int y=10; // ---> Static Initialization(Assign the same line value to the final variable)
        final int z;
        z=10;  // ---Dynamic Initialization
        byte b;
        b=x; //Illegal
        b=y; //Legal
        b=z; //Illegal
    }
}
*/
