package domain;

public class Pedra implements Algoritimo {

    @Override
    public void executar(TipoAlgoritimo tipo) {
        switch(tipo){
            case PAPEL:
                System.out.println("Perdeu! Papel embrulha Pedra.");
                break;
            case SPOCK:
                System.out.println("Perdeu! Pedra perde para Spock.");
                break;
            case TESOURA:
                System.out.println("Ganhou! Pedra ganha de tesoura.");
                break;
            case LAGARTO:
                System.out.println("Ganhou! Pedra ganha de Lagarto.");
                break;
            default:
                System.out.println("Empatou! Pedra empata com Pedra.");
        }
    }
    
}