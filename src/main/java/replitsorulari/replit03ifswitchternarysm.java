package replitsorulari;

import java.util.Scanner;

public class replit03ifswitchternarysm {
    public static void main(String[] args) {

        // ******************************  if-switch*ternary      SORU 3 !!!     **********************

        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        Ornek:
        INPUT      :
        25
        46
        OUTPUT :
        Numaralarin Toplami:
        71
         */

        Scanner input = new Scanner(System.in);
        System.out.print("İki sayı girin: ");
        int num1=input.nextInt();
        int num2=input.nextInt();

        int sum =num1 + num2;
        if (num1 < 0 || num2 <0){
            System.out.println("Lutfen sıfıra esit ya da sıfırdan büyük iki sayı giriniz");
        }else if((sum) >= 1000000000 ) {
            System.out.println("Overflow");
        }else {
            System.out.println("Sum of the numbers: " + (num1+num2));
        }






//        BigInteger num1 = input.nextBigInteger();
//        BigInteger num2 = input.nextBigInteger();
//
//        // Toplama işlemi yapılır ve sonuç yazdırılır
//        BigInteger sum = num1.add(num2);
//        if (sum.toString().length() > 10) {
//            System.out.println("OverFlow");
//        } else {
//            System.out.println("Numaraların Toplamı:");
//            System.out.println(sum);
//        }

        // Bu kod, kullanıcının girdiği iki sayının toplamını hesaplar ve sonucu ekrana yazdırır.
        // Scanner sınıfı kullanılarak kullanıcıdan iki tamsayı bilgisi alınır ve
        // BigInteger sınıfı kullanılarak bu sayılar büyük tamsayılar olarak işlenir.
        // Toplama işlemi add() metodu kullanılarak yapılır ve sonuç sum değişkenine atanır.
        // Eğer toplamın basamak sayısı 10'dan fazlaysa, "OverFlow" yazdırılır.
        // Aksi halde, toplam sonucu ekrana yazdırılır.
        // Bu şekilde, herhangi iki sayının toplamı hesaplanabilir ve sonuçlar dinamik olarak oluşturulur.

    }

}
