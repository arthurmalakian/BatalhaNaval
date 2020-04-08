package br.ufrn.imd.batalhanaval;
import java.util.Scanner;
public class Jogador {
    private String nome;
    private Tabuleiro tabuleiro;
    public Jogador() {
        tabuleiro = new Tabuleiro();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    public void jogar(Jogador inimigo) {
        System.out.println("É a vez de " + getNome());
        int x = 0, y = 0;
        boolean xbool = false,ybool = false;
        Scanner input = new Scanner(System.in);
        while(x < 1 || x > 10) {
            if (xbool) {
                System.out.println("O numero deve estar entre 1 e 10.");
            }
            System.out.println("Digite a cordenada X do seu tiro (1-10)");
            x = input.nextInt();
            xbool = true;
        }
        while(y < 1 || y > 10) {
            if (ybool) {
                System.out.println("O numero deve estar entre 1 e 10.");
            }
            System.out.println("Digite a cordenada Y do seu tiro (1-10)");
            y = input.nextInt();
            ybool = true;
        }
        inimigo.getTabuleiro().verificarTiro(x-1,y-1);
    }
}
