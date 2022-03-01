package hesapMakinesiProjesi;

import java.util.Scanner;

public class HesapMakinesi {
static Scanner scan= new Scanner(System.in);


      int topla(int... sayilar) {
          System.out.println("toplamak istediginiz sayilari girin toplama islemi bitince  t harfine basin");



          int toplam = 0;

          for (int each : sayilar) {

              toplam += each;
              System.out.println("toplam :" + toplam);


          }
          return toplam;
      }}
/*
         int carp(int...sayilar) {

          System.out.println(carpim);
            return carpim;
        }

        int bol(int a, int b) {
            int bolme = a / b;
            System.out.println(bolme);
            return bolme;
        }

        int cikar(int a, int b) {
            int cikartma = a - b;
            System.out.println(cikartma);
            return cikartma;
        }
    }*/
