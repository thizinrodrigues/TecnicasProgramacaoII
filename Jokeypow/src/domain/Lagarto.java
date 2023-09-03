package domain;

public class Lagarto implements Algoritimo {
    @Override
    public void executar(TipoAlgoritimo tipo){
        switch(tipo){
            case PEDRA:
                System.out.println("Perdeu! Lagarto perde de Pedra.");
                break;
            case SPOCK:
                System.out.println("Ganhou! Lagarto ganha de Spock.");
                break;
            case TESOURA:
                System.out.println("Perdeu! Lagarto perde de Tesoura.");
                break;
            case PAPEL:
                System.out.println("Ganhou! Lagarto come Papel.");
                break;
            default:
                System.out.println("Empatou! Lagarto empata com Lagarto.");
        }


    }
    
}
