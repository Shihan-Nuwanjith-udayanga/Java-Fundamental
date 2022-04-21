package _14_Flow_Control_Switch;

// ================================= Java flow control "switch" ================================

//Step 01
/*
import java.util.Random;
public class Example {
    public static void main(String args[]) {
        Random r=new Random();
        int mr=0,rw=0,ms=0,sf=0, rej=0;
        for (int i = 0; i < 100; i++) {
            int vote=r.nextInt(6);
            if(vote==1){
                mr++;
            }else if(vote==2){
                rw++;
            }else if(vote==3){
                ms++;
            }else if(vote==4){
                sf++;
            }else{
                rej++;
            }
        }
        System.out.println("MR : "+mr);
        System.out.println("RW : "+rw);
        System.out.println("MS : "+ms);
        System.out.println("SF : "+sf);
        System.out.println("ReJ: "+rej);
    }
}
*/

//step 02 (Using Switch)
/*
import java.util.Random;
public class Example {
    public static void main(String args[]) {
        Random r=new Random();
        int mr=0,rw=0,ms=0,sf=0, rej=0;
        for (int i = 0; i < 100; i++) {
            int vote=r.nextInt(6);
            switch(vote){
                case 1  : mr++;
                case 2  : rw++;
                case 3  : ms++;
                case 4  : sf++;
                default : rej++;
            }
        }
        System.out.println("MR : "+mr);
        System.out.println("RW : "+rw);
        System.out.println("MS : "+ms);
        System.out.println("SF : "+sf);
        System.out.println("ReJ: "+rej);
    }
}
*/

//====================================================================================================

/*
import java.util.Random;
public class Example {
    public static void main(String args[]) {
        Random r = new Random();
        int mr = 0, rw = 0, ms = 0, sf = 0, rej = 0;
        for (int i = 0; i < 100; i++) {
            int vote = r.nextInt(6);
            switch (vote) {
                case 1:
                    mr++;
                    break;
                case 2:
                    rw++;
                    break;
                case 3:
                    ms++;
                    break;
                case 4:
                    sf++;
                    break;
                default:
                    rej++;
            }
        }
        System.out.println("MR : " + mr);
        System.out.println("RW : " + rw);
        System.out.println("MS : " + ms);
        System.out.println("SF : " + sf);
        System.out.println("ReJ: " + rej);
    }
}
*/

//========================================================================================================

/*
import java.util.Scanner;
public class Example {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input month number : ");
        int month=input.nextInt();
        if(month==1 || month==3 || month == 5 || month==7 ||month==8||month==10|month==12){
            System.out.println("31days");
        }else if (month==4 || month==6 || month==9 || month==11){
            System.out.println("30 days");
        }else if(month==2){
            System.out.println("28 days");
        }else{
            System.out.println("wrong month");
        }
    }
}
*/


// Using Switch
/*
import java.util.Scanner;
public class Example {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input month number : ");
        int month = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("Wrong month");
        }
    }
}
*/
