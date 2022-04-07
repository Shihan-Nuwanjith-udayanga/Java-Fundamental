package _09_Data_Types;

// ================================== Java defined Data types =================================

/*
                    Integer :-
                            byte  - 8bits
                            short - 16bits
                            int   - 32bits
                            long  - 64bits

                    Floating Point :-
                            float  - 32bits
                            double - 64bits

                    character :-
                            char    - 16bits

                    logical :-
                            boolean - 1bits
*/


/*
class Example {
    public static void main(String[] args) {
        int x;
        x=100;
        System.out.println(x);
        x=1.5; //Illegal
        System.out.println(x);
    }
}
*/

/*
class Example {
    public static void main(String args[]) {
        double x;
        x = 1.5; //Legal
        System.out.println(x);
    }
}
*/

// ================= Type "byte" =====================
/*
        size --> 8bits
        Minimum Value --> -128
        Maximum Value --> 127
*/

/*
class Example{
    public static void main(String args[]){
        byte b;
        b=100; //Legal
        System.out.println(b);
        b=127; //Legal
        System.out.println(b);
        b=128; //Illegal
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        byte b;
        b=-100; //Legal
        System.out.println(b);
        b=-128; //Legal
        System.out.println(b);
        b=-129; //Illegal
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        byte b;
        b=Byte.MAX_VALUE;
        System.out.println(b);
        b=Byte.MIN_VALUE;
        System.out.println(b);
    }
}
*/

// ======================================================================================

// ================= Type "short" =====================
/*
        size --> 16bits
        Minimum Value --> -32 768
        Maximum Value --> 32 767
*/

/*
class Example{
    public static void main(String args[]){
        short s;
        s=1200;
        System.out.println(s);
        s=32767; //Legal
        System.out.println(s);
        s=32768; //Illegal

        s=-32767; //Legal
        s=-32768; //Legal
        s=-32769; //Illegal

    }
}
*/

/*
class Example{
    public static void main(String args[]){
        short s;
        s=Short.MAX_VALUE;
        System.out.println(s);
        s=Short.MIN_VALUE;
        System.out.println(s);
    }
}
*/

// ======================================================================================

// ================= Type "int" =====================
/*
        size --> 32bits
        Minimum Value --> -2 147 483 648
        Maximum Value --> 2 147 483 647
*/

/*
class Example{
    public static void main(String args[]){
        int x;
        x=Integer.MAX_VALUE;
        System.out.println(x);

        x=Integer.MIN_VALUE;
        System.out.println(x);
    }
}
*/

// ======================================================================================

// ================= Type "long" =====================
/*
        size --> 64bits
        Minimum Value --> -2*63
        Maximum Value --> 2*63-1
*/

/*
class Example{
    public static void main(String args[]){
        long x;
        x=Long.MAX_VALUE;
        System.out.println(x);

        x=Long.MIN_VALUE;
        System.out.println(x);
    }
}
*/

// ======================================================================================

// ================= Type "float" =====================
/*
        size --> 32bits
        Maximum Value --> 3.4028235E38
        Minimum Value --> 1.4E-45
*/

/*
class Example{
    public static void main(String args[]){
        float f;
        f=100;
        System.out.println(f);

        f=1.5; //Illegal
        f=1.5f; //Legal
        System.out.println();
    }
}

*/

/*
class Example{
    public static void main(String args[]){
        float f;
        f=Float.MAX_VALUE;
        System.out.println(f);

        f=Float.MIN_VALUE;
        System.out.println(f);
    }
}
*/

// ======================================================================================

// ================= Type "double" =====================
/*
        size --> 64bits
*/
/*
class Example{
    public static void main(String args[]){
        double d;
        d=12.343; //Legal
        System.out.println(d);
        d=12.232232d; //or D Legal
        System.out.println(d);

        d=Double.MAX_VALUE;
        System.out.println(d);

        d=Double.MIN_VALUE;
        System.out.println(d);
    }
}
*/

// ======================================================================================

// ================= Type "char" =====================
/*
        size --> 16bits
        Maximum Value --> 0
        Minimum Value --> 2*16-1
*/

/*
class Example{
    public static void main(String args[]){
        char ch;
        ch='A';
        System.out.println("ch : "+ch);

        ch='5';
        System.out.println("ch : "+ch);
    }
}
*/

// ======================================================================================

// ================= Type "boolean" =====================
/*
        size --> 1bits
*/

/*
class Example{
    public static void main(String args[]){
        boolean b;
        b=true;
        System.out.println("boolean  : "+b);

        b=false;
        System.out.println("boolean  : "+b);

        b=10>9;
        System.out.println("10>9 : "+b);

        double avg=49.99;
        boolean isPass=avg>50;
        System.out.println("pass : "+isPass);
    }
}
*/

// ================================================================================

/*
class Example{
    public static void main(String args[]){
        char x='A';
        System.out.println(x);
        x=66;
        System.out.println(x); //prints B

        x='1';
        System.out.println(x); //prints 1
    }
}
*/

// ================================================================================

/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        byte b;
        b=input.nextByte();
        short s;
        s=input.nextShort();

        int x;
        x=input.nextInt();

        long y;
        y=input.nextLong();

        float f;
        f=input.nextFloat();
        double d;
        d=input.nextDouble();

        boolean bool;
        bool=input.nextBoolean();

        String name;
        name=input.next();
    }
}
*/

// ================================================================================

/*
class Example{
    public static void main(String args[]){
        System.out.println(1+1); //2
        System.out.println('1'+'1'); //98
        System.out.println('A'+1); //66
        System.out.println('A'); //A
        System.out.println('A'+"B"); //AB
        System.out.println('A'+'B'); //131
    }

}
*/

















