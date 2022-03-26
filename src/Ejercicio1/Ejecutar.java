package Ejercicio1;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        //Autora: Estefany Castro
        Scanner s = new Scanner(System.in);
        Hipotenusa_un_constructor hpts = new Hipotenusa_un_constructor();
        double h, aa, bb;
        System.out.println("====Objeto 1====");

        hpts.imprimir();
        h = hpts.hipotenusa();
        System.out.println("La hipotenusa es: " + h);

        System.out.println("====Objeto 2====");
        System.out.println("Ingrese lado a: ");
        aa = s.nextDouble();
        System.out.println("Ingrese lado b: ");
        bb = s.nextDouble();
        Hipotenusa_dos_constructores hpts2 = new Hipotenusa_dos_constructores(aa, bb);
        hpts2.imprimir();
        h = hpts2.hipotenusa();
        System.out.println("La hipotenusa es: " + h);
    }
}
