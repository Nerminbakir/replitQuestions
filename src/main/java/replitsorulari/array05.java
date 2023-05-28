package replitsorulari;

import java.util.Arrays;

public class array05 {
    public static void main(String[] args) {
       /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.
        Array: [1551,1223,1443,1267,1789,1023,2020]```
        Aranan Değer:2020
        Beklenen Çıktı:**True**
        Aranan Değer:2010
        Beklenen Çıktı :**False**
        */


        int arr [] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        int a = 2020;

        Arrays.sort(arr);
        int sonuc = Arrays.binarySearch(arr, a);


        if(sonuc<0){
            System.out.println("**false**");
        }else{
            System.out.println("**true**");
        }

        int b = 2010;
        int sonuc1 = Arrays.binarySearch(arr, b);

        if(sonuc1<0){
            System.out.println("**false**");
        }else{
            System.out.println("**true**");
        }









    }
}
