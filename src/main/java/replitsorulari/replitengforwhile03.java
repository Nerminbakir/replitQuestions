package replitsorulari;

import java.util.Arrays;

public class replitengforwhile03 {
    public static void main(String[] args) {
      /*
        Bir String dizisindeki yinelenen karakterleri döndüren bir kod yazın.(Mülakat Sorusu)
        Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

        String str = "Javaisalsoeasy";
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(i, i + 1);
            if (str.indexOf(a) != str.lastIndexOf(a)) {
                if (!s.contains(a)) {
                    s = s + a;
                }
            }
        }
        System.out.print(s);
    }
}






