package Personagem;

public class Brutus extends Tropa {
    public Brutus() {
        super();
        setCusto(getCusto() * 2);
        setVida(getVida() * 2);
    }
}
