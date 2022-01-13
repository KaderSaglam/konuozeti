package konuOzeti;

import java.util.Arrays;
import java.util.OptionalInt;

public class While4 {
    //bir array icerisindeki sayilarin toplamini while dongusunu kullanarak hesaplayan bir program yaziniz
    public static void main(String[] args) {
           int arr[]={1,3,4,5,6,7,8,9,54,3,8,56,45
           };
//arrayli cozum lambda

       int toplam= Arrays.stream(arr).reduce(0,(x,y)->x+y);
        System.out.println("lambda1 : "+toplam);
    OptionalInt toplam2  =  Arrays.stream(arr).reduce(Math::addExact);
        System.out.println("lambda 2 : "+toplam2);

       OptionalInt toplam3= Arrays.stream(arr).reduce(Integer::sum);
        System.out.println("lambda 3 : "+toplam3);
        System.out.println("while cozum");
        int toplam4=0;
        int sira=0;
                int uznluk= arr.length; // arrayin uzunlugunu hesapladim
        // while dongusunu arrayin uzunlugu kadar calistiralim
        while (sira < uznluk) {
          toplam4 += arr[sira];
            sira++;

        }
        System.out.println("while cozum : "+toplam4);
    }
}
