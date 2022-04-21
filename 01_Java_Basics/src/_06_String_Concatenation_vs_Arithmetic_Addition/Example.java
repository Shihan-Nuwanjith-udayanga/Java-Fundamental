package _06_String_Concatenation_vs_Arithmetic_Addition;

// ================== String Concatenation vs Arithmetic Addition ====================

// Exercise 01
/*
class Example{
    public static void main(String args[]){
        System.out.println(100+200); //300 -> Arithmetic Addition
        System.out.println("100"+"200"); //100200 -> String Concat
        System.out.println(100+"200"); //100200 -> String Concat
        System.out.println("100"+200); //100200 -> String Concat
    }
}
*/

// Exercise 02
/*
class Example{
    public static void main(String[] args) {
        System.out.println("10+20+30");     // 10+20+30
        System.out.println("10"+"20+30");   // 1020+30
        System.out.println("10+20"+"30");	// 10+2030
        System.out.println("10"+"20"+"30");	// 102030
        System.out.println(10+"20"+"30");	// 102030
        System.out.println("10"+20+"30");	// 102030
        System.out.println("10"+"20"+30);	// 102030
        System.out.println("10+20"+30);		// 10+2030
        System.out.println(10+"20+30");		// 1020+30
        System.out.println(10+20+"30");		// 3030
        System.out.println("10"+20+30);		// 102030
        System.out.println(10+20+30);		// 60
    }
}
*/

// Exercise 03
/*
class Example{
    public static void main(String args[]){
        int x=10,y=20,z=30;
        System.out.println("x+y+z");	  // x+y+z
        System.out.println("x+y"+"z");	  // x+yz
        System.out.println("x"+"y+z");	  // xy+z
        System.out.println(x+"y+z");	  // 10y+z
        System.out.println("x+y"+z);	  // x+y30
        System.out.println("x"+"y"+"z");  // xyz
        System.out.println("x"+"y"+z);	  // xy30
        System.out.println("x"+y+"z");	  // x20z
        System.out.println(x+"y"+"z");	  // 10yz
        System.out.println(x+y+"z");	  // 30z
        System.out.println("x"+y+z);	  // x2030
        System.out.println(x+y+z);		  // 60
    }
}
*/

// Exercise 04
/*
class Example{
    public static void main(String args[]){
        int age;
        age=20;
        System.out.println("My age is : "+age); //Prints --> My age is : 20
    }
}
*/

// Exercise 05
/*
class Example{
    public static void main(String args[]){
        int x=10,y=20;
        System.out.println(x+" "+y); //Prints -->10 20
    }
}
*/

// Exercise 06
/*
class Example{
    public static void main(String args[]){
        int x=100,y=200;
        int z;
        z=x+y;
        System.out.println(x+" + "+y+" = "+z); //prints 100 + 200 = 300
    }
}
*/






