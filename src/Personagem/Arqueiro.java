package Personagem;

public class Arqueiro extends Tropa {
    public Arqueiro() {
        super();
        setCusto(getCusto() * 2);
        setVida(getVida() / 4);
        setDano(getDano() / 4);
    }
}
