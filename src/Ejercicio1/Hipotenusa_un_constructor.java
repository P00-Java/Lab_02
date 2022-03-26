package Ejercicio1;

//Autora: Estefany Castro
public class Hipotenusa_un_constructor {
    double lado_a, lado_b;

    public Hipotenusa_un_constructor() {
        lado_a = 6;
        lado_b = 8;
    }


    void imprimir() {
        System.out.println(lado_a);
        System.out.println(lado_b);
    }

    double hipotenusa() {
        double h = Math.sqrt(lado_a * lado_a + lado_b * lado_b);
        return h;
    }
}
