package konuOzeti;

import java.util.Scanner;

public class Tekrar11_03_2022 {

    //2- Kullanıcıya kaç sayı toplamak istediğini sorun.
    // Kullanıcı 2,3 veya 4 değerini girerse kullanıcıdan bu sayıların girmesini isteyin ve sayıların toplamını yazdırın.
    // Kullanıcı toplamak istediği sayı adedini 4'den büyük girerse "Çok sayi girdiniz, ben toplayamam" yazdırın
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen toplamak istediginiz sayi giriniz(2-3-4)");
        int adet= scan.nextInt();
        sayilarToplami(adet);
        if (adet == 2|| adet==3 || adet==4) {
            sayilarToplami(adet);
        } else if(adet<4)
            System.out.println("bu sayilar cok buyuk toplayamam");
else System.out.println("gecerli sayilari girmedin");
        }


    private static void sayilarToplami(int adet) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i < adet; i++) {
            System.out.println((i+1)+".sayiyi giriniz");
            toplam+= scan.nextInt();
        }
        System.out.println("girdiginiz sayilarin toplami= "+toplam);
    }
}
