import java.util.Scanner;
import java.util.SortedMap;

public class proje4 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("a kenarını giriniz:");
        int a1 = a.nextInt();

        System.out.print("b kenarını giriniz:");
        int b1 = a.nextInt();

        System.out.print("c kenarını giriniz:");
        int c1 = a.nextInt();

        double u = (a1+b1+c1) /2;
        Double cevre = 2*u;
        double Alan = Math.sqrt(u* (u-a1)* (u-b1)* (u-c1));  
        // kök almak için math kütüpanesini çağırmamız gerekiyor.
        System.out.println("Üçgenin alanı: "+Alan);
        System.out.println("Üçgenin çevresi: "+ cevre);


    }
}
