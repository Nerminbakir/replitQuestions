package replitsorulari;

public class replit06Arrays {
    public static void main(String[] args) {

//        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.//
//        Array: [12,15,43,23,56,76,78,90,77,43]
//        Aranan değer:56
//        Beklenen Çıktı:
//        56 sayısı arrayin 4. elemanı


        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int arananDeger = 56;
        int index = -1; // indexin farklı bir değere sahip olması için

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananDeger) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Aranan deger bulunamadi.");
        } else {
            System.out.println(arananDeger + " sayısı arrayin " + index + ". elemanı");
        }


    }
}