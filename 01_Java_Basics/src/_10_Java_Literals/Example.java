package _10_Java_Literals;

// ================================== Java Literals ======================================
/*
                01. Integer Literals
                            * Binary
                            * Octal
                            * Decimal
                            * Hexadecimal
                02. Floating-point Literals
                03. Boolean Literals
                04. String Literals
                05. Character Literals
                            * Single quote ('')
                            * Escape characters
*/

// =========================================================================================

// ================ Integer Literals ===================
/*
class Example{
    public static void main(String args[]){
        System.out.println(100); //Decimal -->100
        System.out.println(0b1100100); //Binary -->100
        System.out.println(0144); //Octal -->100
        System.out.println(0x64); //Hex -->100
    }
}
*/

/*
class Example {
    public static void main(String []args) {
        System.out.println(1100100); //prints 1100100
        System.out.println(0B1100100); //prints 100 -->binary
        System.out.println(-0b1111111); //-127
        System.out.println(0B1100121); //Illegal
    }
}

*/

// Octal Form
/*
class Example {
    public static void main(String []args) {
        System.out.println(144); //144
        System.out.println(0144); //100
        System.out.println(-07777); //-4095
        System.out.println(-0128); //Illegal
    }
}
*/

// Hexadecimal form
/*
class Example {
    public static void main(String []args) {
        System.out.println(64); //64
        System.out.println(0x64); //100
        System.out.println(0x1a); //26
        System.out.println(0X1a); //26
        System.out.println(0xffffffff); //-1
        System.out.println(0xabcdef); //
        System.out.println(0x12abcgd); //Illegal
    }
}
*/

// ================ Floating-point Literals ===================

/*
class Example {
    public static void main(String []args) {
        System.out.println(1.2323);
        System.out.println(0.0034);
        System.out.println(1200.0);
        System.out.println(1.2E3);
        System.out.println(0.0012);
        System.out.println(1.2e-3);
        System.out.println(-1.2E3);
        System.out.println(-1.2e-3);
    }
}
*/

/*
class Example {
    public static void main(String []args) {
        System.out.println(0.000000000122);
        System.out.println(1200000000.56546547878);
    }
}
*/

// ================ Boolean Literals ===================
/*
class Example {
    public static void main(String []args) {
        System.out.println(true);
        System.out.println(false);
        //System.out.println(True); //Illegal
    }
}
*/

// ================ String Literals ===================
/*
class Example {
    public static void main(String []args) {
        System.out.println("Hello");
        System.out.println("A");
        System.out.println("7");
    }
}
*/

/*
class Example {
    public static void main(String []args) {
        System.out.println(7); //Integer
        System.out.println('7');//Character
        System.out.println("7");//String
    }
}
*/

// ================ Character Literals ===================
/*
class Example {
    public static void main(String []args) {
        System.out.println('7');//Character
        System.out.println('A');//Character
        System.out.println('$');//Character
    }
}
*/

/*
class Example {
    public static void main(String []args) {
        System.out.println('AB');//Illegal
    }
}
*/

/*
class Example {
    public static void main(String []args) {
        System.out.println("AB\bCD");
        System.out.println("AB\tCD");
        System.out.println("AB\nCD");
    }
}
*/

// =============== Escape characters =====================
/*
class Example {
    public static void main(String[] args) {
        System.out.println('\b'); //backspace character
        System.out.println('\n'); //newline character
        System.out.println('\t'); //backspace character
        System.out.println('\f'); //form feed
        System.out.println('\r'); //carriage return character
        System.out.println('\''); //single quote
        System.out.println('\"'); //double quoto
        System.out.println('\\'); //backslash character
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        System.out.println('\g');
    }
}
*/

/*
class Example {
    public static void main(String[] args) {
        System.out.println("AB\rCD");
        System.out.println("AB\fCD");
        System.out.println("AB\'CD");
    }
}
*/
// ===========================================================================================================

// ========================================== Unicode Character  System =======================================

/*
class Example{
    public static void main(String args[]){
        System.out.println('A');
        char ch=65;
        System.out.println(ch); //prints A
        System.out.println(65);
        System.out.println('\u0041');
    }
}
*/

/*
class Example {
    public static void main(String []args) {
        System.out.println(65); //Integer
        System.out.println('\u0041'); //Character A
        System.out.println('\u0042'); //Character B
        System.out.println('\u0043'); //Character C
        System.out.println('\u0061'); //Character a
        System.out.println('\u0030'); //Character 0
        System.out.println('\u0031'); //Character 1
    }
}
*/





