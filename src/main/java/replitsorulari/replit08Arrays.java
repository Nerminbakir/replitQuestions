package replitsorulari;

import java.util.Arrays;

public class replit08Arrays {
    public static void main(String[] args) {
          /*
            Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
            Array: [1232,2345,5467,678,3454,2312,3451]
        */

        int numbers [] = {1232,2345,5467,678,3454,2312,3451};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [678, 1232, 2312, 2345, 3451, 3454, 5467]

        int sonuc = numbers[numbers.length-2];
        System.out.println(sonuc);
    }
}

