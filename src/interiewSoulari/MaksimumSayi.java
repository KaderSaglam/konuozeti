package interiewSoulari;

import java.util.Scanner;

public class MaksimumSayi {
    public static void main(String[] args) {

        //Soru 2->kullanicinin girdigi 5 sayidan en buyuk olan sayiyi yazdiriniz
        //(soruyu kendinize gore gelistirip cozebilirsiniz )
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 tane sayi giriniz");
        int max=0;
        for (int i = 1; i <=5; i++) {
            System.out.println(i+"inci sayiyi giriniz");
            int sayi= scan.nextInt();
            if (max <sayi) {
                max = sayi;
         }

      }
        System.out.println("girdiginiz sayilardan en buyuk olani : "+ max);

    }
}
