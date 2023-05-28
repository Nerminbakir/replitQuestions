package replitsorulari;

import java.util.Scanner;

public class AdSoyadKrediKarti {
    public static void main(String[] args) {

        // ******************************  if - switch - ternary - string manipulation    SORU 2 !!!     **********************

        /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        Input :
        John White
        1234234534561478
        Output : Name :
        J*** W****
        CCN  : **** **** **** 1478
         * Ilk Harfler Buyuk harf ile baslamalidir.

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Adı, Soyadı ve kredi kartı numarasını girin: ");
        String kullaniciBilgi = scan.nextLine();

        String[] bilgiler = kullaniciBilgi.split(" ");
        String ad = bilgiler[0];
        String soyad = bilgiler[1];
        String kartNo = bilgiler[2];

            String adGizli = ad.substring(0, 1) + ad.substring(1).replaceAll("\\S", "*");
            String soyadGizli = soyad.substring(0, 1) + soyad.substring(1).replaceAll("\\S", "*");
            String kartNoGizli = "**** **** **** " + kartNo.substring(kartNo.length() - 4);

            System.out.println("Ad: " + adGizli.toUpperCase());
            System.out.println("Soyad: " + soyadGizli.toUpperCase());
            System.out.println("Kart No: " + kartNoGizli);
    }



}

