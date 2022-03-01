package interiewSoulari;

import java.util.Scanner;

public class GirilenTamsayininRkamlariToplami {
    public static void main(String[] args) {
         /* Bir Java programı yazın
		 ve girilen bir tamsayının rakamlarının toplamını hesaplayın.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("rakamlarini toplamak icin bir tamsayi girin");
        int sayi=scan.nextInt();

        int rakamlarToplami=0;
        int rakam=0;
        while (sayi!=0){
              rakam= sayi%10;
             rakamlarToplami+=rakam;
            sayi/=10;
          }

        System.out.println(" tamsayinin rakamlar toplami"+rakamlarToplami);
        }


}

