package Personagem;

public class Brutus extends Tropa {
    public Brutus() {
        super(200, 200, 20);
    }

    @Override
    public void ataque(Tropa alvo) {
        if (alvo.getVida() > 0) {
            alvo.setVida(alvo.getVida() - getDano());
            System.out.println("Brutus causou -" + getDano() + " de dano.");
        }
    }
}
