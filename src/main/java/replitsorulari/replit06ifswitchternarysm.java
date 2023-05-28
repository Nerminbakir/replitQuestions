package replitsorulari;

import java.util.Scanner;

public class replit06ifswitchternarysm {
    public static void main(String[] args) {

        // ******************************  if-switch-ternary-sm     SORU 6 !!!     **********************

        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        Eger aynı karakterlere sahipse "isim ayni karakterlere sahiptir." yazdirin.
        Eger ayni karakterlere sahip degilse "Dizenin benzersiz karakterleri var" yazdirin.
        Ternary kullanin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 karakterli bir isim giriniz");
        String isim = scan.next();
        String result = isim.charAt(0) == isim.charAt(1) && isim.charAt(1)== isim.charAt(2)? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var";
        System.out.println(result);
    }
}


