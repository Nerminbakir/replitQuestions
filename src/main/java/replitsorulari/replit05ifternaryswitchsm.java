package replitsorulari;

import java.util.Scanner;

public class replit05ifternaryswitchsm {
    public static void main(String[] args) {

        // ******************************  if-switch-ternary-sm     SORU 5 !!!     **********************

        /*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
         INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT  :
        Subat 2016 29 Gundur.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1-12 arası ay numarasını giriniz");
        int ay = scan.nextInt();
        System.out.println("Lutfen yılı giriniz");
        int yil = scan.nextInt();

        switch (ay) {
            case 1:
                int gun = 31;
                System.out.println("Ocak " + yil + " " + gun + " gundur");
                break;
            case 2:
                if (yil % 4 == 0) {
                    gun = 29;
                    System.out.println("Subat " + yil + " " + gun + " gundur");
                } else {
                    gun = 28;
                    System.out.println("Subat " + yil + " " + gun + " gundur");
                }
                break;
            case 3:
                gun = 31;
                System.out.println("Mart " + yil + " " + gun + " gundur");
                break;
            case 4:
                gun = 30;
                System.out.println("Nisan " + yil + " " + gun + " gundur");
                break;
            case 5:
                gun = 31;
                System.out.println("Mayıs " + yil + " " + gun + " gundur");
                break;
            case 6:
                gun = 30;
                System.out.println("Haziran " + yil + " " + gun + " gundur");
                break;
            case 7:
                gun = 31;
                System.out.println("Temmuz " + yil + " " + gun + " gundur");
                break;
            case 8:
                gun = 31;
                System.out.println("Ağustos " + yil + " " + gun + " gundur");
                break;
            case 9:
                gun = 30;
                System.out.println("Eylül " + yil + " " + gun + " gundur");
                break;
            case 10:
                gun = 31;
                System.out.println("Ekim " + yil + " " + gun + " gundur");
                break;
            case 11:
                gun = 30;
                System.out.println("Kasım " + yil + " " + gun + " gundur");
                break;
            case 12:
                gun = 31;
                System.out.println("Aralık " + yil + " " + gun + " gundur");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarası giriniz");
        }


    }
}