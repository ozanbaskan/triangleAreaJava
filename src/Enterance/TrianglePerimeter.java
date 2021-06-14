package Enterance;
import java.util.Scanner;
import java.lang.Math;

public class TrianglePerimeter {
    public static void main(String[] args) {
        double a, b, c, u;
        Scanner s = new Scanner(System.in);
        System.out.print("Üçgenin kenar uzunluklarını birer boşluk bırakarak giriniz: ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();



        u = (a+b+c) / 2;
        System.out.printf("Alan: " + (Math.round(Math.sqrt(u * (u - a) * (u - b) * (u - c)) * 100.0) / 100.0 ));
    }
}
