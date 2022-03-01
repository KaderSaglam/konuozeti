package oop;

public class OgrencilerMain {
    public static void main(String[] args) {
        Ogrenciler ogrenci = new Ogrenciler();
        System.out.println(ogrenci.ogrenciSayisi);
        ogrenci.kayitekle();
        ogrenci.kayitekle();
        ogrenci.kayitekle();
        ogrenci.kayitekle();
        System.out.println(ogrenci.ogrenciSayisi);
        ogrenci.kayitSil();

    }
}
