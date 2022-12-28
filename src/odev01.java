import java.util.Scanner;

public class odev01 {
    public static void main(String[] args) {

        Double vkitle;
        Scanner boy = new Scanner(System.in);
        System.out.print(" Lütfen boyunuzu (metre cinsinden) giriniz : ");
        Double boy1 = boy.nextDouble();

        System.out.print(" Lütfen kilonuzu giriniz : ");
        int kilo = boy.nextInt();

        vkitle = (kilo / Math.pow(boy1,2));

        System.out.println(" Vücut Kitle İndeksiniz : "+vkitle);
    }
}
