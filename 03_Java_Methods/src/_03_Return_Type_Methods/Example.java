package _03_Return_Type_Methods;

// =================================== Return typed Methods =============================================

// Exerxcise 1
/*
import java.util.*;
class Example{
    public static int getTotal(int num1, int num2){
        int total=num1+num2;
        return total;
    }

    public static void main(String args[]){
        int tot;
        tot=getTotal(10,20); //findTotal
        System.out.println("10 + 20 = "+tot);
    }
}
*/

//===============================================================================================

// Exercise 2
//step 01
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input a integer: ");
        int num=input.nextInt();
        int count;
        count=findDigitsCount(num);
        System.out.println("No of digits for "+num+" : "+count);

    }
}
*/

//step 02
/*
import java.util.*;
class Example{
    public static int findDigitsCount(int x){
        int count=0;
        do{
            count++;
        }while((x/=10)!=0);
        return count;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input a integer: ");
        int num=input.nextInt();
        int count;
        count=findDigitsCount(num);
        System.out.println("No of digits for "+num+" : "+count);

    }
}
*/


//===============================================================================================

//Q 01
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Random r=new Random();
        for (int i = 0; i < 10; i++){
            int rand=r.nextInt();
            int absoluteNo=findAbs(rand);
            System.out.println("Absolute no of "+rand+" : "+absoluteNo);
        }

    }
}
*/

//Q 02 From 01
/*
import java.util.*;
class Example{
    public static int findAbs(int num){
		*/
/*if(num<0){
			return -num;
		}else{
			return num;
		}*
		*//*

        return num<0 ? -num : num;
    }
    public static void main(String args[]){
        Random r=new Random();
        for (int i = 0; i < 10; i++){
            int rand=r.nextInt();
            int absoluteNo=findAbs(rand);
            System.out.println("Absolute no of "+rand+" : "+absoluteNo);
        }

    }
}
*/

//===============================================================================================

//Q 03
/*
class Example{
    public static void main(String args[]){

        for (int i = 0; i < 10; i++){
            System.out.println("factorial value of "+i+" : "+fact(i));
        }

    }
}
*/

//Q 04 From Q 03
/*
class Example{
    public static int fact(int num){
        int f=1;
        while(num>0){
            f*=num--;
        }
        return f;
    }
    public static void main(String args[]){

        for (int i = 0; i < 10; i++){
            System.out.println("factorial value of "+i+" : "+fact(i));
        }

    }
}
*/

//===============================================================================================

// Exercise 3
//Step 01
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();

        if(studentIsPass(avg)){
            System.out.println("Student is pass");
        }else{
            System.out.println("Student is fail");
        }
    }
}
*/

//Step 02
/*
import java.util.*;
class Example{
    public static boolean studentIsPass(double avg){
        return avg>=50;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();

        if(studentIsPass(avg)){
            System.out.println("Student is pass");
        }else{
            System.out.println("Student is fail");
        }
    }
}
*/

//===============================================================================================

//Exercise 4
//Step 01
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();

        int reverse=reverseOf(num);
        System.out.println("reverse of "+num+" : "+reverse);
    }
}
*/

//Step 02
/*
import java.util.*;
class Example{
    public static int reverseOf(int num){
        int reverseNumber=0;
        while(num!=0){
            reverseNumber*=10;
            reverseNumber+=num%10;
            num/=10;
        }
        return reverseNumber;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();

        int reverse=reverseOf(num);
        System.out.println("reverse of "+num+" : "+reverse);
    }
}
*/

//===============================================================================================

//Exercise 5
//Step 01
/*
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();

        System.out.println(avg+" : "+findGrade(avg));
    }
}
*/

//Step 02
/*
import java.util.*;
class Example{
    public static char findGrade(double avg){
        return avg>=75 ? 'A': avg>=65 ? 'B': avg>=45 ? 'C': avg>=25 ? 'D' : 'E';
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();

        System.out.println(avg+" : "+findGrade(avg)); //A
    }
}
*/

//===============================================================================================

//Exercise 6
//Step 01
/*
class Example{
    public static void main(String args[]){
        for (int i = 0; i < 10000; i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
    }
}
*/

//Step 02
/*
class Example{
    public static int reverseOf(int num){
        int reverseNumber=0;
        while(num!=0){
            reverseNumber*=10;
            reverseNumber+=num%10;
            num/=10;
        }
        return reverseNumber;
    }
    public static boolean isPalindrome(int num){
        int reverse=reverseOf(num);
        return reverse==num;
    }
    public static void main(String args[]){
        for (int i = 0; i < 10000; i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
    }
}
*/
