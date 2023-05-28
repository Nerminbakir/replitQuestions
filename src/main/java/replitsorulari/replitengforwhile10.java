package replitsorulari;

public class replitengforwhile10 {
    public static void main(String[] args) {

        /*
        Write a Program to find the sum of natural numbers from 1 to 100.
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        OUTPUT 		:   Sum of Natural Numbers 5050
        */

        int sum = 0;

        for (int i = 1; i <=100 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


    }
}

