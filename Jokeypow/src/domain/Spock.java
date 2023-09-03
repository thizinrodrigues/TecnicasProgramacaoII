package domain;

public class Spock implements Algoritimo {

    @Override
    public void executar(TipoAlgoritimo tipo) {
        switch(tipo){
            case PAPEL:
                System.out.println("Perdeu! Spock perde de Papel.");
                break;
            case PEDRA:
                System.out.println("Ganhou! Spock ganha de Pedra.");
                break;
            case TESOURA:
                System.out.println("Ganhou! Spock ganha de tesoura.");
                break;
            case LAGARTO:
                System.out.println("Perdeu! Spock perde de Lagarto.");
                break;
            default:
                System.out.println("Empatou! Spock empata com Spock.");
        }
    }
    
}