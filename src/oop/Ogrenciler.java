package oop;

public class Ogrenciler {
  int ogrenciSayisi=0;


  void kayitekle(){
      System.out.println("kayit eklendi");
      ogrenciSayisi++;
  }
  void kayitSil(){
      System.out.println("kayit silindi");
      ogrenciSayisi--;
      System.out.println("ogrenci sayisi= "+ogrenciSayisi);
  }
}
