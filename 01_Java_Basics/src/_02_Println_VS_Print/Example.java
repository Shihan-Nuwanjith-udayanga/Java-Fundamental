package _02_Println_VS_Print;

// ========= System.out.println(data) vs System.out.print(data) ============

//01
/*
class Example {
    public static void main(String[] args) {
        System.out.print("A");
        System.out.print("B");
        System.out.print("C");
        System.out.print("D");
    }
}
*/

//output - ABCD

//02
/*
 class Example{
    public static void main(String[] args) {
        System.out.println("A");
        System.out.print("B");
        System.out.print("C");
        System.out.println("D");
    }
}
*/

/*
output - A
         BCD
*/

//03
/*
class Example{
    public static void main(String args[]){
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");
        System.out.print("D");
    }
}
*/

/*
output - AB
         C
         D
*/

