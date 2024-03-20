package funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("Nome: ");
        String nome= ler.next();
        System.out.println("Departamento: ");
        String departamento= ler.next();
        System.out.println("Salário: ");
        double salario= ler.nextDouble();
        Funcionario funcionario = new Funcionario(nome,departamento,salario);
        System.out.println("Digite o novo nome: ");
        nome= ler.next();
        funcionario.setNome(nome);
        System.out.println("Funcionário " + funcionario.getNome());
        funcionario.aumentarSalario(10);
    }
}
