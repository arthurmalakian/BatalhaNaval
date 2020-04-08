package br.ufrn.imd.batalhanaval;
import java.util.Random;
public class Tabuleiro {
    private int[][] tabuleiro = new int[10][10];
    public int[][] getTabuleiro() {
        return tabuleiro;
    }
    public void zerarTabuleiro(){
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                this.tabuleiro[i][j] = 0;
            }
        }
    }
    public boolean verificarTiro(int x,int y){
        if(this.tabuleiro[x][y] == 1){
            System.out.println("KABUM! seu tiro foi um sucesso!");
            this.tabuleiro[x][y] = 2;
            return true;
        }else if (this.tabuleiro[x][y] == 2){
            System.out.println("Você atirou em um navio já afundado...");
            return false;
        }else {
            System.out.println("SPLASH! Tiro na água.");
            return false;
        }
    }
    public void distrubuirBarcos(){
        int x = gerarNumeroAleatorio(0,9);
        int y = gerarNumeroAleatorio(0,9);
        int dir = gerarNumeroAleatorio(0,1);
        while (!inserirBarco(x,y,5,dir)){
            x = gerarNumeroAleatorio(0,9);
            y = gerarNumeroAleatorio(0,9);
            dir = gerarNumeroAleatorio(0,1);
        }
        while (!inserirBarco(x,y,4,dir)){
            x = gerarNumeroAleatorio(0,9);
            y = gerarNumeroAleatorio(0,9);
            dir = gerarNumeroAleatorio(0,1);
        }
        while (!inserirBarco(x,y,3,dir)){
            x = gerarNumeroAleatorio(0,9);
            y = gerarNumeroAleatorio(0,9);
            dir = gerarNumeroAleatorio(0,1);
        }
        while (!inserirBarco(x,y,3,dir)){
            x = gerarNumeroAleatorio(0,9);
            y = gerarNumeroAleatorio(0,9);
            dir = gerarNumeroAleatorio(0,1);
        }
        while (!inserirBarco(x,y,2,dir)){
            x = gerarNumeroAleatorio(0,9);
            y = gerarNumeroAleatorio(0,9);
            dir = gerarNumeroAleatorio(0,1);
        }
    }
    private boolean inserirBarco(int x,int y,int tamanho, int dir){
        if(verificarDisponibilidade(x,y,tamanho,dir)){
            if (dir == 0){
                for (int i = x; i < x+tamanho; i++){
                    this.tabuleiro[i][y] = 1;
                }
                return true;
            }else {
                for (int i = y; i < y+tamanho; i++){
                    this.tabuleiro[x][i] = 1;
                }
                return true;
            }
        }else{
            return false;
        }
    }
    private boolean verificarDisponibilidade(int x,int y,int tamanho,int dir){
        if (dir == 0){
            if (x+tamanho > 9) {
                return false;
            }
            for (int i = x; i < x+tamanho; i ++) {
                if (this.tabuleiro[i][y] != 0){
                    return false;
                }
            }
            return true;
        }else if (dir == 1){
            if (y+tamanho > 9) {
                return false;
            }
            for (int i = y; i < y+tamanho; i ++) {
                if (this.tabuleiro[x][i] != 0){
                    return false;
                }
            }
            return true;
        }else {
            System.out.println("Parametros inválidos.");
            return false;
        }
    }
    private static int gerarNumeroAleatorio(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("numero máximo deve ser maior que o mínimo.");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public void imprimirTabuleiro(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j ++){
                if (this.tabuleiro[j][i] == 0) {
                    System.out.print(" ~ ");
                }else if(this.tabuleiro[j][i] == 1){
                    System.out.print(" O ");
                }else{
                    System.out.print(" X ");
                }
            }
            System.out.print("\n");
        }
    }
}
