import java.util.Scanner;

public class proje1 {
    public static void main(String[] args) {

        Scanner mat = new Scanner(System.in);
        System.out.print("matematik sonucu :");
        Double mat1 = mat.nextDouble();

        Scanner fizik = new Scanner(System.in);
        System.out.print("Fizik sonucu :");
        double fizik1 = mat.nextDouble();

        Scanner turkce = new Scanner(System.in);
        System.out.print("Türkçe sonucu :");
        Double turkce1 = mat.nextDouble();

        Scanner kimya = new Scanner(System.in);
        System.out.print("Kimya sonucu :");
        Double kimya1 = mat.nextDouble();

        Scanner tarih = new Scanner(System.in);
        System.out.print("Tarih sonucu :");
        Double tarih1 = mat.nextDouble();

        Scanner muzik = new Scanner(System.in);
        System.out.print("Müzik sonucu :");
        Double muzik1 = mat.nextDouble();

        Double sonuc = ((mat1+fizik1+turkce1+kimya1+muzik1+tarih1)/6);
        System.out.println("Ortalamanız: "+String.format("%.2f",sonuc));

        String a = sonuc < 60 ? "Sınıfı geçemediniz" : "Sınıfı geçtiniz";

        System.out.println(a);
    }
}
