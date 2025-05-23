package Batalha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Personagem.*;

public class CampoDeBatalha {
    private ArrayList<Tropa> batalhaoAzul = new ArrayList<>();
    private ArrayList<Tropa> batalhaoVermelho = new ArrayList<>();
    
    public void criarBatalhao() {
        // Criação do batalhão azul
        Tropa polimorfismo = new Gladiador();
        batalhaoAzul.add(polimorfismo); //POLIMORFISMO
        batalhaoAzul.add(new Arqueiro());
        batalhaoAzul.add(new Arqueiro());
        batalhaoAzul.add(new Arqueiro());
        batalhaoAzul.add(new Arqueiro());
        batalhaoAzul.add(new Arqueiro());
        batalhaoAzul.add(new Gladiador());  
        batalhaoAzul.add(new Gladiador());  
        batalhaoAzul.add(new Brutus());

        batalhaoAzul.sort((t1, t2) -> Integer.compare(t1.getVida(), t2.getVida()));
        Collections.reverse(batalhaoAzul);

        // Criação do batalhão vermelho
        batalhaoVermelho.add(new Arqueiro());
        batalhaoVermelho.add(new Brutus());
        batalhaoVermelho.add(new Gladiador());  
        batalhaoVermelho.add(new Gladiador());
        batalhaoVermelho.add(new Gladiador());
        batalhaoVermelho.add(new Gladiador());
        batalhaoVermelho.add(new Gladiador());
        
        batalhaoVermelho.sort((t1, t2) -> Integer.compare(t1.getVida(), t2.getVida()));
        Collections.reverse(batalhaoVermelho);  
    }

    public void duelo() {
        // Decisão da ordem de ataque
        ArrayList<Tropa> atacante;
        ArrayList<Tropa> defensor;
        String turno;

        Random r = new Random();
        
        if(r.nextInt(2) == 0){
            System.out.println(ANSI_RED + "\nVermelhos começam!\n" + ANSI_RESET);
            turno = "Vermelho";
            atacante = batalhaoVermelho;
            defensor = batalhaoAzul;
        } else{
            System.out.println(ANSI_BLUE + "\nAzuis começam!\n" + ANSI_RESET);
            turno = "Azul";
            atacante = batalhaoAzul;
            defensor = batalhaoVermelho;
        }
        
        // Simulação de luta entre tropas
        while(true){
            System.out.println("\n"+ turno + "\n");

            Tropa alvo = defensor.get(0);

            for(Tropa t : atacante){
                if(t instanceof Arqueiro && t != atacante.get(0)){
                    t.ataque(alvo);
                }
            }
            atacante.get(0).ataque(alvo);
            
            if(alvo.getVida() <= 0){
                defensor.remove(0);

                if(turno == "Vermelho"){
                    System.out.println("\nTropa do time Azul foi derrotada.\n");
                } else{
                    System.out.println("\nTropa do time Vermelho foi derrotada.\n");
                }

                System.out.println(turno + " vida restante: " + atacante.get(0).getVida());

                System.out.println("\nBATALHÃO VERMELHO\n");
                for(Tropa t : batalhaoVermelho){
                    System.out.println(t.toString());
                }
                System.out.println("\nBATALHÃO AZUL\n");
                for(Tropa t : batalhaoAzul){
                    System.out.println(t.toString());
                }
                break;
            }

            ArrayList<Tropa> temp = atacante;
            atacante = defensor;
            defensor = temp;
            
            if(turno == "Vermelho"){
                turno = "Azul";
            } else{
                turno = "Vermelho";
            }
        }
    }

    
    public ArrayList<Tropa> getBatalhaoAzul() {
        return batalhaoAzul;
    }

    public ArrayList<Tropa> getBatalhaoVermelho() {
        return batalhaoVermelho;
    }

    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println



    public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
}