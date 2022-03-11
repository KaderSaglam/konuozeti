package konuOzeti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {

        //bunyamin  ismini tersten yazdirin
        System.out.println("String");

        String isim="bunyamin";

        String arr[]=isim.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }



        System.out.println("\n String Builder \n");


StringBuilder sb=new StringBuilder();
        sb.append("bunyamin");
        sb.reverse();
        System.out.println(sb);


    }}

