package konuOzeti;

import java.util.Scanner;

public class Tekrar10_03_2022 {
    //1-Kullanıcıdan bir sayi alın. Bu sayının tek mi çift mi olduğunui
    // sıfırdan buyuk mu kucuk mu oldugunu,
    // ayrıca 100'den buyukse bırler , onlar ve yuzler basamağındaki rakamların toplamını,
    // 100'den kucukse sadece 1'ler basmağını yazdıran 3 method oluşturun.

    //2- Kullanıcıya kaç sayı toplamak istediğini sorun.
    // Kullanıcı 2,3 veya 4 değerini girerse kullanıcıdan bu sayıların girmesini isteyin ve sayıların toplamını yazdırın.
    // Kullanıcı toplamak istediği sayı adedini 4'den büyük girerse "Çok sayi girdiniz, ben toplayamam" yazdırın .

    //3- Email kontrolü yapan bir program yazın. Kullanıcının girdiği şifre
    //@ işareti içermiyorsa geçersiz email yazdırın.
    //@gmail.com içermiyorsa "lütfen gmail adresinizi girin" yazdirin
    //@gamil.com ile bitmiyorsa "Yazımda bir sorun var maili kontrol ediniz" yazdırın
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
       rakamlarToplami(sayi);

    }




    public static void rakamlarToplami(int sayi) {
        if (sayi>=100) {
            int rakam=0;
            int rakamlarToplami=0;
            rakam= sayi%10;//1 ler basamagi
            rakamlarToplami+=rakam;
           sayi= sayi/10;
            rakam= sayi%10; //10 lar basamagi
            rakamlarToplami+=rakam;
            sayi/=10;
            rakam= sayi%10;
            rakamlarToplami+=rakam;
            System.out.println("rakamlar toplami : " + rakamlarToplami);

        } else if(sayi>0) {

            int birlerBasamagi= sayi%10;
            System.out.println("Sayinin birler basamagi : " + birlerBasamagi);
        }else {
            System.out.println("gecersiz sayi");
        }

    }

    public static void pozitifMiNegatifMi(int sayi) {
        if (sayi<0) {
            System.out.println("sayi negatif");
        }else if (sayi>0) {
            System.out.println("sayi pozitif");
        }else {
            System.out.println("sayi pozitif veya negatif degil");
        }

    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
        } else if (sayi % 2 == 1 ) {
            System.out.println("sayi tek");
        } else {
            System.out.println("sayi tam sayi degil");
        }

    }}


