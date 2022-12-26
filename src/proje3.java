import java.util.Scanner;

public class proje3 {
    public static void main(String[] args) {

        double kdvorani, kdv=0.08, kdv1=0.18;

        Scanner para = new Scanner(System.in);
        System.out.print("para giriniz:");
        Double para1 = para.nextDouble();

        kdvorani = (para1 > 1000) ? kdv : kdv1;

        double y = para1 * kdvorani;
        System.out.println("kdv tutatı : "+y+" TL");

    }
}
