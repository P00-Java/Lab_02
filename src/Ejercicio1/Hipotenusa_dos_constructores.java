package Ejercicio1;

public class Hipotenusa_dos_constructores {
    double lado_a, lado_b;

    public Hipotenusa_dos_constructores() {
        lado_a = 6;
        lado_b = 8;
    }

    public Hipotenusa_dos_constructores(double a, double b) {
        lado_a = a;
        lado_b = b;
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
