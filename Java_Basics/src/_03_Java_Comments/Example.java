package _03_Java_Comments;

// ====================== Java Comments =================================

//    There are,
//        01 - Line Comments --->  //
//        02 - Block Comments --->  /* */
//        03 - Document Comments ---> /** */


// ============ Line Comments ================

//01
/*
class Example {
    public static void main(String[] args) {
        System.out.println("A");
        //System.out.println("B");
        System.out.println("C");
        //System.out.println("D");
        System.out.println("E");
    }
}
*/

/*
output - A
         C
         E
*/

//02
/*
class Example{
    public static void main(String args[]){
        System.out.println("A"); //prints A
        System.out.println("B"); //prints B
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
    }
}
*/

/*
output - A
         B
         C
         D
         E
*/

// ============ Block Comments ================

class Example{
    public static void main(String args[]){
        System.out.println("A");
	/*	System.out.println("B");
		System.out.println("C");
		System.out.println("D"); */
        System.out.println("E");
    }
}

/*
output - A
         E

*/

