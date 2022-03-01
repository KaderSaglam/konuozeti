package interiewSoulari;

public class SwapTakas {
    public static void main(String[] args) {
        /*
		  Soru 3 Write a Java Program to swap two numbers

		         Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini alması islemidir.
		         iki yoldan yaptiginiz java kodunu yaziniz.
		         1.Yol: 3. degisken kullanarak
		         2.Yol: 3. degisken kullanmadan
		    */
        System.out.println("1. yol");
        int a=3;
        int b=5;
        int kova=0;
        System.out.println("ilk a sayi : " +a+"\n ilk b sayisi : "+ b);
        kova=a;
        a=b;
        b=kova;
        System.out.println("son a sayisi : " +a+"\n son b sayisi : "+ b);
        System.out.println("******************");
        System.out.println("2. yol 3. degisken kullanmmadan");
        a=3;
        b=5;
        System.out.println("ilk a sayi : " +a+"\n ilk b sayisi : "+ b);
        a=a+b; // a sayimiz suan 8
        b=a-b; // b sayimiz suan 3
        a=a-b; // 8-3=5 a sayimiz 5 oldu
        System.out.println("son a sayisi : " +a+"\n son b sayisi : "+ b);
    }
}
