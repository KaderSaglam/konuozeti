package konuOzeti;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
      /* int sayi=5;
        while (sayi<10){
            System.out.println("merhaba");
            sayi++;

        }*/
        String sifre="1";
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String ksifre= scan.next();
        while (!ksifre.equals(sifre)){
            System.out.println("yanlis girdiniz tekrar deneyin");
            ksifre= scan.next();



            } System.out.println("dogru girdiniz sizi bir ust menuye gonderiyorum ");
        dogru();


        }



    private static void dogru() {
        System.out.println("hosgeldin yapcagin isslem ne");

    }
}
