package heroi;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi1 =new Heroi();
        heroi1.nome = "Tchelo";
        heroi1.forca = 10;

        Heroi heroi2 = new Heroi();
        heroi2.nome = "Mr. Adolf";
        heroi2.forca = 8;

        Mago mago1 = new Mago();
        mago1.nome= "Gota";

        Mago mago2 = new Mago();
        mago2.nome= "Sopa";

      for (int nivel = 1; nivel<=10; nivel++ ){
          System.out.println("Você está no nível " + nivel);
          System.out.println("----------------------------------------------");

          System.out.println("Vida total do heroí " + heroi1.nome +" é " + heroi1.vida);
          System.out.println("----------------------------------------------");
          System.out.println("Vida total do heroí " + heroi2.nome +" é " + heroi2.vida);
          System.out.println("----------------------------------------------");
          System.out.println("Vida total do mago " + mago1.nome+ " é " + mago1.vida);
          System.out.println("----------------------------------------------");
          System.out.println("Vida total do mago " + mago2.nome+ " é " + mago2.vida);
          System.out.println("----------------------------------------------");
          heroi1.atacar(mago1);
          System.out.println("----------------------------------------------");
          heroi2.atacar(mago2);
          System.out.println("----------------------------------------------");
          mago1.lancarMagia(heroi1);
          System.out.println("----------------------------------------------");
          mago2.lancarMagia(heroi2);
          System.out.println("----------------------------------------------");

          if (heroi1.vida>0 ) {
              System.out.println("Heroi " + heroi1.nome + " venceu!");
          } if (heroi2.vida>0){
              System.out.println("Heroi " + heroi2.nome + " venceu!");
          } if (mago1.vida>0){
              System.out.println("Mago " + mago1.nome + " venceu!");
          } else {
              System.out.println(" Mago " + mago2.nome + " venceu!");
          }

          }
      }
    }


