package konuOzeti;

import java.util.Scanner;

public class While3 {
    //SAYİNİN RAKAMLARİ TOPLAMİNİ BUL
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
      int rakam=0;
      int toplam=0;
        while (sayi>0){
        rakam=    sayi%10;
        toplam+=rakam;
      sayi= sayi/10; // sayinin yeni degeri 10a bolünmüs olsun

        }
        System.out.println("sayinin toplamlari"+ toplam);
    }
}
