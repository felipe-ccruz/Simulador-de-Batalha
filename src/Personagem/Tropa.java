package Personagem;

public abstract class Tropa {
    private int custo;
    private int vida;
    private int dano;

    public Tropa(int custo, int vida, int dano) {
        this.custo = custo;
        this.vida = vida;
        this.dano = dano;
    }

    public abstract void ataque(Tropa alvo);

    // Getters e setters
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
