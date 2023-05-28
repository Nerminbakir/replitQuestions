package replitsorulari;

import java.util.Scanner;

public class replitengforwhile02ebobekok {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 tam sayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        Input :
        30 and 40
        Expected OutPut:
        GCD for 30 and 40 = 10
        LCM for 30 and 40 = 120
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
//        int ebob = 0;
//
//        for(int i = 1; i < sayi1; i++)
//        {
//            if(sayi1 % i == 0 && sayi2 % i == 0) {
//                ebob = i;
//            }
//        }
//        System.out.println("Ebob = " + ebob);
//
//
//        int ekok = 0;
//        int max;
//        max = sayi1 * sayi2;
//        /* 2 sayı eger aralarında asal ise ekoku
//        çarpımlarıdır. Yanı 2 sayının ekoku maximum çarpımlarıdır.*/
//
//        for(int i = max; i > 0; i--)
//        {
//            if(i % sayi1 == 0 && i % sayi2 == 0) {
//                ekok = i;
//            }
//        }
//        System.out.println("Ekok = " + ekok);
//


        int ebob = 1;
        int ekok = sayi1 * sayi2;

        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        ekok /= ebob;

        System.out.println("En büyük ortak bölen: " + ebob);
        System.out.println("En küçük ortak kat: " + ekok);

    }
}
