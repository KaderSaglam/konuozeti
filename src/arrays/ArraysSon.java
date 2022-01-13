package arrays;

import java.util.Arrays;

public class ArraysSon {
    public static void main(String[] args) {
        /*
         * 2 tamsayı Diziyi parametre olarak kabul eden ve 2 ekleyen bir dönüş yöntemi yazın
         * diziyi yeni bir Diziye dönüştürür ve yazdırır.
         * Girdi1={1,2,3,4}
         * Giriş2={5,6}
         * Çıktı={1,2,3,4,5,6}
         */

        int arr1[]={1,2,3,4};
        int arr2[]={5,6};

     yeniArr(arr1,arr2);
        }

    private static void yeniArr(int[] arr1, int[] arr2) {
        int  yeni_arr[]=new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            yeni_arr[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            yeni_arr[(arr1.length)+i]=arr2[i];

        }
        System.out.println(Arrays.toString(yeni_arr));
        }

}

