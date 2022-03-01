package konuOzeti;

public class ForEach {
    //bir array olusturun ve icindekileri yazdirini
    public static void main(String[] args) {
        String arr[]={"sahra", "ilkim", "ata","veli","emre","fatih","mehmet" , "11", "22","13"};


        for (String each: arr) {
            System.out.println(each);

        }
    }
}
