package Ejemplo1;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        //Autora: Estefany Castro
        Scanner s = new Scanner(System.in);
        Alumnos_un_constructor al = new Alumnos_un_constructor();
        Alumnos_dos_constructores al2 = new Alumnos_dos_constructores(2);
        int cod;
        double n1, n2, prom;
        String cond, ap, nom, cur;
        al.imprimir();
        prom = al.promedio();
        cond = al.condicion();
        System.out.println("Promedio: " + prom);
        System.out.println("Condicion: " + cond);
        al2.imprimir();
        prom = al2.promedio();
        cond = al2.condicion();
        System.out.println("Promedio: " + prom);
        System.out.println("Condicion: " + cond);
        System.out.println("Ingrese codigo");
        cod = s.nextInt();
        System.out.println("Ingrese apellidos");
        ap = s.next();
        System.out.println("Ingrese nombres");
        nom = s.next();
        System.out.println("Ingrese curso");
        cur = s.next();
        System.out.println("Ingrese nota 1");
        n1 = s.nextDouble();
        System.out.println("Ingrese nota 2");
        n2 = s.nextDouble();
        Alumnos_tres_constructores al3 = new Alumnos_tres_constructores(cod, ap, nom, cur, n1, n2);
        al3.imprimir();
        prom = al3.promedio();
        cond = al3.condicion();
        System.out.println("Promedio: " + prom);
        System.out.println("Condicion: " + cond);
    }
}
