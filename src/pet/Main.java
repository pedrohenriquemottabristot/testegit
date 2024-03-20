package pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite o nome do pet: ");
        String nome = ler.next();
        System.out.println("Digite a espécie do pet: ");
        String especie = ler.next();
        System.out.println("Digite a idade: ");
        int idade = ler.nextInt();

        Pet pet = new Pet(nome, especie, idade);
        Pet pet2= new Pet();
        pet.exibir();
        pet2.exibir();
    }
}
