package heroi;

public class Mago extends Heroi{
    public void lancarMagia(Heroi alvo) {
        alvo.vida -= 20;

        System.out.println(this.nome + " lança uma magia em " + alvo.nome + " causando 20 de dano.");
    }

}
