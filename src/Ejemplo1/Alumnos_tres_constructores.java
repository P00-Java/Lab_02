package Ejemplo1;
public class Alumnos_tres_constructores {
    //Autora: Estefany Castro
    int codigo;
    String apellidos, nombres;
    String curso;
    double nota1, nota2;
    public Alumnos_tres_constructores() {
        codigo = 1;
        apellidos = "Mendoza";
        nombres = "Jose";
        curso = "Java";
        nota1 = 15;
        nota2 = 17;
    }
    public Alumnos_tres_constructores(int codigo) {
        this.codigo = codigo;
        apellidos = "Rivera";
        nombres = "Rosa";
        curso = "Algoritmos";
        nota1 = 13;
        nota2 = 11;
    }
    public Alumnos_tres_constructores(int codigo, String apellidos, String nombres, String curso, double nota1, double nota2) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    void imprimir() {
        System.out.println(codigo);
        System.out.println(apellidos);
        System.out.println(nombres);
        System.out.println(curso);
        System.out.println(nota1);
        System.out.println(nota2);
    }
    double promedio() {
        double prom = (nota1 + nota2) / 2;
        return prom;
    }
    String condicion() {
        if (promedio() >= 13) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
}
