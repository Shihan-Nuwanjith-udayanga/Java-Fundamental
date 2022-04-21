package _11_Conversion_and_Casting;

// ============================ Conversion and Casting ===================================

/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        byte b=input.nextByte();

        x=b; //Legal ->automatic conversion

        //b=x; //Illegal
        b=(byte) x;  //(byte)===>last 8bits of x (Casting)

    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        int x=100;
        byte b;
        b=(byte) x;
        System.out.println(b+" "+x);

        x=127;
        b=(byte) x;
        System.out.println(b+" "+x);

        x=128;
        b=(byte) x;
        System.out.println(b+" "+x); //-128 128

        x=256;
        b=(byte) x;
        System.out.println(b+" "+x); //0 128

        x=255;
        b=(byte) x;
        System.out.println(b+" "+x); //-1 128
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        byte b=100;
        double d;
        d=b; //automatic conversion
        System.out.println(b+" "+d);
    }
}
*/

// Exercise 01
/*
class Example{
    public static void main(String args[]){
        char ch='A';
        int code;
        code=ch; //automatic conversion
        System.out.println("ASCII of A : "+code);;

        double d;
        d=ch; //automatic
        System.out.println(ch+" "+d);//A : 65.0
    }
}
*/

// Exercise 02
/*
class Example{
    public static void main(String args[]){
        byte b=65;
        char ch;
        //ch=b; //Illegal
        short s=65;
        //s=ch; //Illegal

        int x=65;
        ch=x; //Illegal
    }
}
*/

// Exercise 03
/*
class Example{
    public static void main(String args[]){
        char ch='A';
        byte b;
        b=ch; //Illegal

        short s;
        s=ch; //Illegal

        int x;
        x=ch; //Legal
    }
}
*/

// Exercise 04
/*
class Example{
    public static void main(String args[]){
        short s=127;
        byte b;
        b=127; //Legal
        b='A'; //Legal
        b=s; //Illegal
    }
}
*/

// Exercise 05
/*
class Example{
    public static void main(String args[]){
        int x=Integer.MAX_VALUE;
        short s;
        s=(byte)x;
        System.out.println(x+" "+s);
    }
}
*/

// Exercise 06
/*
class Example{
    public static void main(String args[]){
        double d=255.1234;
        byte b;
        b=(byte)d;
        System.out.println(d+" : "+b);

        short s;
        s=(short)d;
        System.out.println(d+" : "+s);
    }
}
*/

// Exercise 07
/*
class Example{
    public static void main(String args[]){
        double d;
        int x;

        d=1.23E3; //->1230.0
        x=(int)d;
        System.out.println(d+" : "+x);

        d=123.0E-3; //->0.123
        x=(int)d;
        System.out.println(d+" : "+x);

    }
}
*/

// =============== Wider Conversion ====================
/*
class Example{
    public static void main(String args[]){
        byte b=10;
        long x;
        x=b; //Wider Conversion
        System.out.println(b+" : "+x);
        System.out.println(b+x); --> // automatic casting
    }
}
*/

// =============== Narrow Conversion ====================
/*
class Example{
    public static void main(String args[]){
        byte age=19;
        int x=10;
        //age=age+x; //Illegal
        age+=x; //Legal (Narrow Conversion) -->automatic casting
        System.out.println(age);
    }
}
*/

// =============== Narrow Casting ====================
/*
class Example{
    public static void main(String args[]){
        int age=19;
        byte b;
        b=(byte)age;
        System.out.println(age);
    }
}
*/

// =============== Wider Casting ====================
/*
class Example{
    public static void main(String args[]){
        int total=756;
        int n=10; //no of students
        double avg;
        avg=total/n;
        System.out.println(avg);//75.0

        avg=(double)total/n;
        System.out.println(avg);//75.6

        avg=total/(double)n;
        System.out.println(avg);//75.6
    }
}
*/

