package replitsorulari;

public class replitengforwhile08asciivalue {
    public static void main(String[] args) {

        /*
        Write a Java program that prints ascii values of characters from ‘a’ to ‘z’
        'a'dan 'z'ye kadar olan karakterlerin ascii değerlerini yazdıran bir Java programı yazın

        Expected Output:

        Ascii value of a = 97
        Ascii value of b = 98
        Ascii value of c = 99
        ....
        Ascii value of w = 119
        Ascii value of x = 120
        Ascii value of y = 121
        Ascii value of z = 122
         */

        for (char i = 'a'; i<='z'  ; i++) {
            System.out.println("Ascii value of " + i + " = " +(int) i);
        }


        // 2. yol

        for(int i = 97; i <= 122; i++) {
            char c = (char) i;
            System.out.println("Ascii value of " + c + " = " + i);
        }



    }
}
