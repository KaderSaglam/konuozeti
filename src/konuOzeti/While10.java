package konuOzeti;

public class While10 {
    public static void main(String[] args) {


        //1 den 100 ye kadar 10 ebolunen sayilari consoola yazdir


        int sayi = 1;
        while (sayi <= 100) {
            if (sayi % 10 == 0) {

                System.out.println(sayi);


            }
            sayi++;
        }
    }

}

