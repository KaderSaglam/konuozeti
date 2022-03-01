package hesapMakinesiProjesi;

import java.util.Scanner;

public class HesapMakinesiMain {
    public static void main(String[] args) {
       HesapMakinesi hesap=new HesapMakinesi();

        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        System.out.println("girmek istediginiz sayialari  yaziniz");
        while (true){

            if (sayi!=0) {
                System.out.println("sayi giriniz");
                sayi= scan.nextInt();
                hesap.topla(sayi);

            }
        }
     /*   System.out.println(" toplama icin=1 \n carpma icin = 2 \n cıkarma icin =3 \n bolme icin =4 e basiniz");
        int sayi= scan.nextInt();

        System.out.println("islem yapmak istediğiniz sayilari girin");
      // while (sayi)
        switch (sayi){
           case 1:
               hesap.topla();
               break;
           case 2:
             //  hesap.carp();
               break;
           case 3:
            //   hesap.cikar(x, y);
               break;
           case 4:
              // hesap.bol(x, y);
               break;
       }*/
    }
}
