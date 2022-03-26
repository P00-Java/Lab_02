package Ejercicio2;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        //Autora: Estefany Castro
        Productos p = new Productos();
        System.out.println("====Producto 1====");
        System.out.println("codigo: " + p.getCodigo());
        System.out.println("Descripcion: " + p.getDescripcion());
        System.out.println("Cantidad: " + p.getCantidad());
        System.out.println("Precio_Unitario: " + p.getPrecio_unitario());
        System.out.println("El precio total es: " + p.precio_total_sin_igv());
        System.out.println("El IGV es: " + p.igv());
        System.out.println("El total es: " + p.precio_total());

        System.out.println("====Producto 2====");
        Productos p2 = new Productos();

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese codigo: ");
        p2.setCodigo(s.nextInt());
        System.out.println("Ingrese descripcion: ");
        p2.setDescripcion(s.next());
        System.out.println("Ingrese cantidad: ");
        p2.setCantidad(s.nextInt());
        System.out.println("Ingrese precio: ");
        p2.setPrecio_unitario(s.nextDouble());

        System.out.println("====Producto 2====");
        System.out.println("codigo: " + p2.getCodigo());
        System.out.println("Descripcion: " + p2.getDescripcion());
        System.out.println("Cantidad: " + p2.getCantidad());
        System.out.println("Precio_Unitario: " + p2.getPrecio_unitario());

        System.out.println("El precio total es: " + p2.precio_total_sin_igv());
        System.out.println("El IGV es: " + p2.igv());
        System.out.println("El total es: " + p2.precio_total());
    }
}
