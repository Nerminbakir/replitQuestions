package replitsorulari;

import java.util.Scanner;

public class replitengforwhile01 {
    public static void main(String[] args) {

        //Kullanıcıdan bir ad ve bir karakter girmesini isteyin, ardından addaki döngüleri kullanarak karakterin adda kaç kez tekrarlandığını kontrol edin
        /*Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
        e.g:
        char ch1= 'a' ;
        String name =“John came late"
        Expected Output: Number of a = 2   a sayısı = 2

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scan.nextLine();

        System.out.println("Please enter a character");
        char ch = scan.next().charAt(0);

        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (ch==name.charAt(i)){
                counter++;
            }
        }
        System.out.println("Number of a = " + counter);



        //*******************************************************************************************************

            /*
            Konsolda Alfabeyi Yazdıran programi yaziniz.
            OUTPUT  :
            a b c .. .. .. .. y z
            */

        for (char i = 'a'; i<='z'  ; i++) {
            System.out.print(i + " ");
        }

    }//
}
