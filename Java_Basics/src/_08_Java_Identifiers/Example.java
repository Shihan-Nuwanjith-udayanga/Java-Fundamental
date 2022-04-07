package _08_Java_Identifiers;

// =================== Java Identifiers, Reserve Words, Keywords =========================

/*
        Reserve Words --> 53
            Key words --> 50 (class, void, int, static, public ....)
            Literals --> 03 (null, true, false)
*/

// ==================== Rules for Valid Identifiers ======================

/*
                01 - One Word
                02 - a-z , A-Z , 0-9 , $ , _
                03 - can be any length (256)
                04 - java case-sensitive
                05 - first Letter must be a character
                06 - No reserve words and keywords can be use
*/

/*
class Example{
    public static void main(String args[]){
        int customerTotal; //LEgal
        int customer total; //Illeal
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        int age, my_age;
        int $count;
        int age#123; //Illegal
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        int aaaaaaaaaaaaaaaaaaaaaaaa; //Legal
        int fdssdsdfsdsdfsdfsdfdsfsdf; //Legal
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        int For,Class, Int ;//Legal
        int for; //Illegl
        int byte; //Illegal
    }
}
*/

/*
class Example{
    public static void main(String args[]){
        int count2, x1,x2; //Legal

        int 2count;  //Illegal
        int 2x;	//Illegal

    }
}
*/











