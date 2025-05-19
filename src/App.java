import Batalha.CampoDeBatalha;

public class App {
    public static void main(String[] args) throws Exception {
        CampoDeBatalha cb = new CampoDeBatalha();
        cb.criarBatalhao();
        while(!(cb.getBatalhaoAzul().isEmpty() || cb.getBatalhaoVermelho().isEmpty())){
            cb.duelo();
        }
        
    }
}
