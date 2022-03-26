package Ejemplo2;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        //Autora: Estefany Castro
        Scanner s = new Scanner(System.in);
        int va, vb, vc;
        double r1, r2, d;
        String msg;
        System.out.println("Ingrese A");
        va = s.nextInt();
        System.out.println("Ingrese B");
        vb = s.nextInt();
        System.out.println("Ingrese C");
        vc = s.nextInt();
        Raices r = new Raices(va, vb, vc);
        d = r.discriminante();
        if (d < 0) {
            System.out.println("Error. No existen raices reales");
        } else {
            r1 = r.raiz1();
            r2 = r.raiz2();
            System.out.println("Raiz 1:" + r1);
            System.out.println("Raiz 2:" + r2);
        }
    }
}
