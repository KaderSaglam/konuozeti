package konuOzeti;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {

        // kullanicidan alinan  sifrenin  icerisinde sayi ve harf olup olmadigini kontrol ediniz
        //


Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string griniz icinde harfler ve rakam  olabilir");
       String sifre= scan.next();
        for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i)>='0' && sifre.charAt(i)<='9') {
                System.out.println(sifre.charAt(i) + " bu bir rakamdir. ");
                 }else if (sifre.charAt(i)<='Z' && sifre.charAt(i)>='A'){
                System.out.println(sifre.charAt(i)+" bu bir buyuk harftir");
                  }else if (sifre.charAt(i)<='z' && sifre.charAt(i)>='a'){
                System.out.println(sifre.charAt(i)+" bu bir kucuk harftir");
 }
  }
 }
}
