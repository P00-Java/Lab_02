package Ejemplo2;

public class Raices {
    int a, b, c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double discriminante() {
        double disc = Math.pow(b, 2) - 4 * a * c;
        return disc;
    }

    double raiz1() {
        double r1 = (-b + Math.sqrt((discriminante()))) / (2 * a);
        return r1;
    }

    double raiz2() {
        double r2 = (-b - Math.sqrt(discriminante())) / (2 * a);
        return r2;
    }
}
