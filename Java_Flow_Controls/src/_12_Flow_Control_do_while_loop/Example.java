package _12_Flow_Control_do_while_loop;

// =================================  Java Flow Control "do/while-loop" ===================================

/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num=input.nextInt();
        int count=0;

        do{
            num=num/10;
            count++;
        }while(num!=0);
        System.out.println("no of digits : "+count);
    }
}
*/

// =========================================================================================================

//do/while vs while
/*
class Example{
    public static void main(String args[]){
        int i=0;
        while(i<10){
            System.out.println("while-loop : "+i);
            i++;
        }
        System.out.println("---------------");

        int j=0;
        do{
            System.out.println("do/while-loop  :"+j);
            j++;
        }while(j<10);
    }
}
*/

//do/while vs while
/*
class Example{
    public static void main(String args[]){
        int i=10;
        while(i<10){
            System.out.println("while-loop : "+i);
            i++;
        }
        System.out.println("---------------");

        int j=10;
        do{
            System.out.println("do/while-loop  :"+j);
            j++;
        }while(j<10);
    }
}
*/

// =================================================================================================

/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Random r=new Random();
        int rand;
        do{
            rand=r.nextInt(101); //0 to 100
            System.out.println(rand);
        }while(rand!=100);
    }
}
*/
