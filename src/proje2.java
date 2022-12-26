import java.util.Scanner;

public class proje2 {
    public static void main(String[] args) {
        double KdvOrani = 0.18;

        Scanner para = new Scanner(System.in);
        System.out.print("para giriniz:");
        Double para1 = para.nextDouble();

        System.out.println("KDV oranı: "+KdvOrani+" TL");
        double z = para1 * 18 / 100;
        double t = para1 + z;
        System.out.println("KDV'li fiyatı:"+t+" TL");

        double x = para1 * 18 / 100;
        double y = para1 - x;
        System.out.println("KDV'siz fiyatı: "+para1+" TL");

        System.out.println("KDV tutarı: "+x+" TL");
    }
}
