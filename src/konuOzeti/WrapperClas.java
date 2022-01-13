package konuOzeti;

public class WrapperClas {
    public static void main(String[] args) {
        // elimizdeki string bir ifadeyi int a donustrup islem yapalim

String yas="50";
int yasTamsayi=Integer.parseInt(yas); // elindeki yas stringinden bir tane tam sayi elde et
        System.out.println(yasTamsayi);
        int yeniSyi=yasTamsayi*5;
        System.out.println(yeniSyi);
        //******* Stringi int a cevirme Integer.parseInt(cevirmek istedigimiz String)

        // integerden string elde etme 1. yol
        int  sayi=20;

       String yazi= String.valueOf(sayi);
       //artik int a stringe cevirdim
        System.out.println(yazi +" yazinin uzunlugu : "+  yazi.length());
       // int string yapma  2. yol
        //**** integerle string toplami her xaman stringtir bundan dolayi int bir sayiyi stringe cevirmek icin
        // hiclik ile toplarim

        String yeni=sayi+"";
        System.out.println(yeni.length());
    }
}
