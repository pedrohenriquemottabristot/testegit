package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora= new Calculadora();
        double a= 50.0;
        double b= 20.0;

        System.out.println(" Soma =" + calculadora.somar(a, b));
        System.out.println(" Subtração =" + calculadora.subtrair(a, b));
        System.out.println(" Multiplicação =" + calculadora.multiplicar(a, b));
        System.out.println(" Divisão =" + calculadora.dividir(a, b));
    }
}
