package Personagem;

public class Tropa {
    private int custo;
    private int vida;
    private int dano;
    public Tropa() {
        this.custo = 100;
        this.vida = 100;
        this.dano = 20;
    }

    public void ataque(Tropa alvo){
        if (alvo.getVida() > 0) {
            alvo.setVida(alvo.getVida() - getDano());
            System.out.println("-" + getDano());
        }
    }

    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
}
