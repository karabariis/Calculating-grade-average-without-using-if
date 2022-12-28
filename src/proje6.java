import java.util.Scanner;

public class proje6 {
    public static void main(String[] args) {

        double pi = 3.14, alan, cevre;
        Scanner yariCap = new Scanner(System.in);
        System.out.print("Yarıçapını giriniz: ");
        Double yariCap1 = yariCap.nextDouble();
        alan = pi * Math.pow(yariCap1,2);
        cevre = 2 * pi * yariCap1;

        System.out.println("Dairenin alanı: "+String.format("%.2f",alan)+ " Çevresi: " +cevre);
    }
}
