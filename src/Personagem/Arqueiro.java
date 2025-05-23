package Personagem;

public class Arqueiro extends Tropa {
    public Arqueiro() {
        super(200, 25, 5);
    }

    @Override
    public void ataque(Tropa alvo) {
        if (alvo.getVida() > 0) {
            alvo.setVida(alvo.getVida() - getDano());
            System.out.println("Arqueiro causou -" + getDano() + " de dano.");
        }
    }
}