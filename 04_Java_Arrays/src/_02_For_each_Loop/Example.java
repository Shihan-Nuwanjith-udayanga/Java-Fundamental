package _02_For_each_Loop;

// =================================  For-each Loop =========================================================

/*
class Example{
    public static void main(String args[]){
        int[] ar={10,20,30,40,50,60,70,80,90};
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("\n");

        for(int a : ar){
            System.out.print(a+" ");
        }

    }
}
*/

// ============================================================================================================

// Case I
// =======
/*
class Example{
    public static void main(String args[]){
        int[] ar={10,20,30,40,50,60,70,80,90};
        int a;
        for( a : ar){ //
            System.out.print(a+" ");
        }

    }
}
*/

// Case II
// ========
/*
class Example{
    public static void main(String args[]){
        int[] ar={10,20,30,40,50,60,70,80,90};
        for(byte b  : ar){ //Illegal
            System.out.print(b+" ");
        }

    }
}
*/

// Case III
// ========
/*
class Example{
    public static void main(String args[]){
        int[] ar={10,20,30,40,50,60,70,80,90};
        for(int b  : ar){
            System.out.print(b+" ");
        }
        System.out.print(b+" ");	 //Illegal
    }
}
*/

// Case IV
// ========
/*
class Example{
    public static void main(String args[]){
        int[] ar={100,200,300};
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);

        for(int a : ar){
            a++;
        }
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]); //100 200 300

        for (int i = 0; i < ar.length; i++){
            ar[i]++;
        }
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);

        int i=0;
        while(i<ar.length){
            ar[i]++;
            i++;
        }
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
    }
}
*/
