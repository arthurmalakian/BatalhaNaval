package br.ufrn.imd.batalhanaval;
import java.util.Scanner;
public class Jogo {
    Jogador j1 = new Jogador();
    Jogador j2 = new Jogador();
    public void iniciar(){
        j1.getTabuleiro().zerarTabuleiro();
        j1.getTabuleiro().distrubuirBarcos();
        j2.getTabuleiro().zerarTabuleiro();
        j2.getTabuleiro().distrubuirBarcos();

        /*para testes
        j1.getTabuleiro().imprimirTabuleiro();
        System.out.println();
        j2.getTabuleiro().imprimirTabuleiro();
        */
        Scanner input = new Scanner(System.in);
        System.out.println("BATALHA NAVAL");
        System.out.println("Digite o nome do primeiro jogador: ");
        j1.setNome(input.nextLine());
        System.out.println("Digite o nome do segundo jogador: ");
        j2.setNome(input.nextLine());
        while (!verificarVencedor(j1) || !verificarVencedor(j2)){
            j1.jogar(j2);
            if (verificarVencedor(j2)){
                break;
            }
            j2.jogar(j1);
            if (verificarVencedor(j1)){
                break;
            }
        }
        if (verificarVencedor(j1)){
            System.out.println("O vencedor foi "+j2.getNome()+"!");
        }
        if (verificarVencedor(j2)){
            System.out.println("O vencedor foi "+j1.getNome()+"!");
        }
    }
    private boolean verificarVencedor(Jogador jog){
        Tabuleiro tab = jog.getTabuleiro();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if (tab.getTabuleiro()[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
