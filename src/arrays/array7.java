package arrays;

public class array7 {
    static int[]  arr={1,2,3,4,5,6,7,8};
    public static void main(String[] args) {

       /*  * Write a method that accepts an array as parameter and returns sum off all
		 * elements in the array Then print the result in the main method.
		 * Eg :
		 * input : {1,2,3,4,5,6,7,8}
		 * output: 36
                */
        int toplam=0;


        System.out.println(topla(toplam));

    }

    private static int topla(int toplam) {

        for (int i = 0; i <arr.length; i++) {
            toplam+=arr[i];

        }

        return toplam;
    }
}
