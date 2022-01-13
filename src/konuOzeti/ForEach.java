package konuOzeti;

public class ForEach {
    //bir array olusturun ve icindekileri yazdirini
    public static void main(String[] args) {
        String arr[]={"sahra", "ilkim", "ata","veli","emre","fatih","mehmet" };


        for (String each: arr) {
            System.out.println(each);

        }
    }
}
