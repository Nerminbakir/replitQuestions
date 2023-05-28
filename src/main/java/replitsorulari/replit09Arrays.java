package replitsorulari;

public class replit09Arrays {
    public static void main(String[] args) {
         /*
         Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

        Array: [1,2,3,4,5,6,7,8,9]
        Beklenen Çıktı:
        Tek Sayilar: 5
        Cift Sayilar: 4

       */
        int arr [] = {1,2,3,4,5,6,7,8,9};

        int sayacT = 0;
        int sayacC = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sayacT++;
            } else {
                sayacC++;
            }
        }

        System.out.println("Tek Sayilar: " + sayacT);
        System.out.println("Cift Sayilar: " + sayacC);

    }
}


