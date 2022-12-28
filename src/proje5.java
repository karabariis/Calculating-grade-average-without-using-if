import java.util.Scanner;

public class proje5 {
    public static void main(String[] args) {
        int top1=20;
        Double toplam;
        System.out.println("Taksimetre KM başına 2.20 TL tutmaktadır.");
        System.out.println("Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.");
        System.out.println("Taksimetre açılış ücreti 10 TL'dir.");
        Scanner git = new Scanner(System.in);
        System.out.print("kaç km gidilecek: ");
        Double git1 = git.nextDouble();
        toplam = (git1 * 2.20)+10;
        Double y = (toplam < 20)? top1 : toplam;
        System.out.println(String.format("%.2f",y));

    }
}
