package _13_Arithmetic_Operators;

// ================================= Arithmetic Operators ========================================

/*
                                + 	Addition
                                - 	Subtraction
                                *	Multiplication
                                /	Division
                                %	Modular
                                ++	Incrementer
                                --	Dectementer
                                Unary +
                                Unary -
*/

/*
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.print("Input number 1 : ");
        num1=input.nextInt();
        System.out.print("Input number 2 : ");
        num2=input.nextInt();
        int result;
        result=num1+num2;
        System.out.println(num1+" + "+num2+" = "+result);
        result=num1-num2;
        System.out.println(num1+" - "+num2+" = "+result);
        result=num1*num2;
        System.out.println(num1+" * "+num2+" = "+result);
        result=num1/num2;
        System.out.println(num1+" / "+num2+" = "+result);
    }
}
*/
/*
 output : - Input number 1 : 25
            Input number 2 : 25
            25 + 25 = 50
            25 - 25 = 0
            25 * 25 = 625
            25 / 25 = 1
*/

/*
class Example {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z;
        z=x+y; //Legal
        System.out.println(x+y); //Legal

        x+y; //Illegal
    }
}
*/

// =================== Unary +, - =========================
/*
class Example {
    public static void main(String[] args) {
        int x=10;
        System.out.println(x);
        System.out.println(+x); //Unary +
        System.out.println(-x); //Unary -

        System.out.println(x); //Prints 10
        x=-x;
        System.out.println(x); //Prints -10
    }
}
*/

// ===================   % Modular  =========================
/*
class Example {
    public static void main(String[] args) {
        int x;
        x=10/6;
        System.out.println("10/6 : "+x); //1

        x=10%6;
        System.out.println("10%6 : "+x); //4
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        int x;
        x=10%1;
        System.out.println("10/1 : "+x); //0

        x=10%2;
        System.out.println("10%2 : "+x); //0

        x=10%3;
        System.out.println("10%3 : "+x); //1

        x=10%4;
        System.out.println("10%4 : "+x); //2
        x=10%5;
        System.out.println("10%5 : "+x); //0
        x=10%5;
        System.out.println("10%6 : "+x); //0
        x=10%7;
        System.out.println("10%7 : "+x); //3
        x=10%9;
        System.out.println("10%9 : "+x); //1
        x=10%10;
        System.out.println("10%10: "+x); //0
        x=10%12;
        System.out.println("10%12: "+x); //10
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        System.out.println(4.5 % 1.1);
    }
}
*/

// ========================================================================================================

// Exercise 01
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input a salary : " );
        int salary=input.nextInt();
        System.out.println("Salary : "+salary);

        int r5000,r2000,r1000,r500,r200,r100;
        //Find minimum notes and coins
        r5000=salary/5000;

        System.out.println("R5000 : "+r5000);
        System.out.println("R2000 : "+r2000);
        System.out.println("R1000 : "+r1000);
        System.out.println("R500  : "+r500);
        System.out.println("R200  : "+r200);
        System.out.println("R100  : "+r100);
    }
}
*/

// Exercise 01 from 02
/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input a salary : " );
        int salary=input.nextInt();
        System.out.println("Salary : "+salary);

        int r5000,r2000,r1000,r500,r200,r100;
        //Find minimum notes and coins
        r5000=salary/5000;
        salary=salary%5000;
        r2000=salary/2000;
        salary=salary%2000;
        r1000=salary/1000;
        salary=salary%1000;
        r500=salary/500;
        salary=salary%500;
        r200=salary/200;
        salary=salary%200;
        r100=salary/100;

        System.out.println("R5000 : "+r5000);
        System.out.println("R2000 : "+r2000);
        System.out.println("R1000 : "+r1000);
        System.out.println("R500  : "+r500);
        System.out.println("R200  : "+r200);
        System.out.println("R100  : "+r100);
    }
}
*/

// ========================================================================================================

// ============================   Operator ++, --  =======================================

/*
class Example {
    public static void main(String[] args) {
        int x=100;
        System.out.println(x);
        x++;
        System.out.println(x); //prints 101
        ++x;
        System.out.println(x);//prints 102
        x--;
        System.out.println(x);//prints 101
        --x;
        System.out.println(x);//prints 100
    }
}
*/

// ============================= x++(Post fix) vs ++x (Pre fix) =======================================

/*
class Example {
    public static void main(String[] args) {
        int x=100;
        int y;
        y=x++; //assign old value of x to y
        System.out.println(x+"  "+y); //101 100
    }
}
*/

/*
import java.util.*;
class Example {
    public static void main(String[] args) {
        int x=100;
        int y;
        y=++x; //assign new value of x to y
        System.out.println(x+"  "+y); //101 101
    }
}
*/

// =========================================================================================================

// Exercise 01
/*
class Example {
    public static void main(String[] args) {
        int x=100;
        System.out.println(x);	//prints 100
        System.out.println(x++);//prints 100
        System.out.println(++x);//prints 102
    }
}
*/

// Exercise 02
/*
class Example {
    public static void main(String[] args) {
        int x=0;
        x=x++;
        System.out.println(x);//prints 0
    }
}
*/

// Exercise 03
/*
class Example {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4;
        int x=0;
        x=a++ + ++b + c++ + ++d;
        System.out.println(a+" "+b+" "+c+" "+d+" "+x);//prints ?
    }
}
*/

// Exercise 04
/*
class Example {
    public static void main(String[] args) {
        int x=0;
        int y=x++ + ++x + x++ + ++x;
        System.out.println(x+" "+y); //prints ?
    }
}
*/

// ================================ Op= (operator assignment) =============================================
/*
class Example {
    public static void main(String[] args) {
        int age;
        age+=10; //age=age+10;
        System.out.println("New age : "+age);
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        int salary=8777;
        salary%=5000; //salary=salary%5000;
        System.out.println("salary : "+salary);
    }
}
*/




