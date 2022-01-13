package konuOzeti;

public class Method {
    //bir array icinde aranan datanin  olup olmdgini consola yazdiran bir tane method olusturun
    public static void main(String[] args) {
        int sayilar[]={20,40,59};
        bilgiyiGoster();// bunda yapmayiz
     int sonuc  = toplam(20,40); // tam sayiyi degiskene atadik bunu ancak returnlarla yapıyoz
        System.out.println(sonuc);
     String sahra   =kader("sahra");
        System.out.println(sahra);
        System.out.println(var());
    }

    private static String kader(String sahra) {
        String kelime="SAHRA ilkim";

        return kelime;
    }

    public static int toplam(int i, int i1) {
        int toplam=i+i1;
        return toplam;
    }

    public static void bilgiyiGoster() {
        System.out.println("merhaba");

    }
    public static boolean var(){
boolean varMi=true;

        return varMi;
    }
}
