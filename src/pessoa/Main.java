package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome= " Pedro. ";
        pessoa1.idade=  16 ;
        pessoa1.cpf= "000.000.000-00";

        pessoa1.correr();
        System.out.println(pessoa1.nome);
    }
}
