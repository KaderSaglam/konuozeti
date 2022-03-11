package konuOzeti;

import java.util.Scanner;

public class Tekrar12_03_2022 {
    public static void main(String[] args) {
        //3- Email kontrolü yapan bir program yazın. Kullanıcının girdiği şifre
        //@ işareti içermiyorsa geçersiz email yazdırın.
        //@gmail.com içermiyorsa "lütfen gmail adresinizi girin" yazdirin
        //@gamil.com ile bitmiyorsa "Yazımda bir sorun var maili kontrol ediniz" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen emailinizi girin");
        String email = scan.next();
        if (!email.contains("@")) {
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("lutfen email adresinizi girin ");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Yazımda bir sorun var maili kontrol ediniz");
        } else if (email.startsWith("@gmail.com")) {
            System.out.println("mailiniz @gmail.com ile baslamamali");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("kaydiniz olusturuldu");
        } else System.out.println("tekrar deneyiniz");
    }

}
