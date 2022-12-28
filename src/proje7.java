import java.util.Scanner;

public class proje7 {
    public static void main(String[] args) {
        double pi = 3.14, alan;
        Scanner yariCap = new Scanner(System.in);
        System.out.print("Yarıçapını giriniz: ");
        Double yariCap1 = yariCap.nextDouble();

        System.out.print("Merkez açısının ölçüsü: ");
        Double macı = yariCap.nextDouble();

        alan =  (pi * (Math.pow(yariCap1,2)*macı/100)/360);

        System.out.println("alan: "+String.format("%.2f",alan));
    }
}
