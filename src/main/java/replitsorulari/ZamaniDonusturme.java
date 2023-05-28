package replitsorulari;

import java.util.Scanner;

public class ZamaniDonusturme {
    public static void main(String[] args) {

        // ******************************   scanner    SORU 9 !!!     **********************

        // Kullanıcıdan alınan zamanı saniye cinsinden yazınız.


        Scanner scan = new Scanner(System.in);
        System.out.println("saat, dakika ve saniye cinsinden bir zaman dilimi giriniz");
        int girilenSaat = scan.nextInt();
        int girilenDakika = scan.nextInt();
        int girilenSaniye = scan.nextInt();

        int saat = 3600;//sn cinsinden
        int dakika = 60;


        int cevir = (girilenSaat*saat) + (girilenDakika*dakika)+girilenSaniye;
        System.out.println(cevir);



        /*
        ******************************        SORU 10 !!!     **********************

        Kullanıcıdan dakika girmesini isteyin,
        Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

        Dakika sayısı: 3456789
        3456789 dakika yaklaşık 6 yıl 210 gündür
         */


        Scanner input = new Scanner(System.in);
        System.out.print("Dakika sayısını giriniz: ");
        long minutes = input.nextLong();

        // Dakika sayısı yıl ve gün sayısına dönüştürülür
        long year = minutes / (365 * 24 * 60);
        long day = minutes / (24 * 60) % 365;

        // Sonuç ekrana yazdırılır
        System.out.println(minutes + " dakika yaklaşık " + year + " yıl " + day + " gündür.");
    }

    //Bu kod, kullanıcıdan dakika sayısı bilgisini alır ve yıl ve gün sayısına dönüştürür.
    // İlk önce, Scanner sınıfı kullanılarak kullanıcıdan dakika sayısı bilgisi alınır.
    // Ardından, dakika sayısı yıl ve gün sayısına dönüştürülür.
    // Yıl sayısı, dakika sayısının yılda kaç dakika olduğuna bölünerek elde edilir.
    // Gün sayısı ise, dakika sayısının bir yılda kaç dakika olduğuna bölünerek kalan gün sayısı hesaplanır.
    // Sonuç ekrana yazdırılır.
    // Bu şekilde, herhangi bir dakika sayısı girildiğinde kod çalışacak ve sonuçlar dinamik olarak oluşturulacaktır.

}


