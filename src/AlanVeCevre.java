import java.util.Scanner;
public class AlanVeCevre {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez açıyı giriniz : ");
        alfa = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilim = (pi * (r*r) * alfa) / 360;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Daire diliminin alanı : " + dilim);

    }
}
