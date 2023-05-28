package replitsorulari;

public class replitforwhile09 {
    public static void main(String[] args) {

        /*
        Write a java program to reverse the number which user entered.
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız.
        Input  :1238
        Output :Reverse Of The Number: 8321
         */

        String str = "1238";
        String ters = "";


        for (int i = str.length()-1; i >=0; i--) {
            ters = ters + str.substring(i,i+1);
        }

        System.out.println(ters);


    }
}