package heroi;

public class Heroi {
    String nome;
    int vida = 100;
    int forca;

    public void atacar (Heroi alvo){
        alvo.vida -= this.forca;
        System.out.println(this.nome + " ataca " + alvo.nome + " e causa " + this.forca + " de dano.");
    }
    public void curar(){
        this.vida += 20;
    System.out.println(this.nome + " se cura e agora tem " + this.vida + " de vida.");

    }
}

