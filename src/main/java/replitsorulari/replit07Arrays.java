package replitsorulari;

import java.util.Arrays;
import java.util.List;

public class replit07Arrays {
    public static void main(String[] args) {
         /*

        Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        Array :
        ["Python", "JAVA", "PHP", "Perl", "C#", "C++"]
        Beklenen Çıktı:
        [Python, JAVA, PHP, Perl, C#, C++]

         */

        String prgNames [] = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> yeni = Arrays.asList(prgNames);
        System.out.println(yeni);

    }
}
