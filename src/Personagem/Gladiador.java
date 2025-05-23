package Personagem;

public class Gladiador extends Tropa {
    public Gladiador() {
        super(150, 120, 30);
    }

    @Override
    public void ataque(Tropa alvo) {
        if (alvo.getVida() > 0) {
            alvo.setVida(alvo.getVida() - getDano());
            System.out.println("Gladiador causou -" + getDano() + " de dano.");
        }
    }
}
