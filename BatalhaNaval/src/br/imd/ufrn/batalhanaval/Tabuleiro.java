package br.ufrn.imd.batalhanaval.gameObjects;

public class Tabuleiro {

    private int[][] tabuleiro = new int[10][10];

    public void zerarTabuleiro(){
        for(int i = 0; i < 10;i++){
            for(int j = 0; j < 10; j++) {
                this.tabuleiro[i][j] = 0;
            }
        }
    }

    public void addNavio(int tipo, int dir, int x,int y, int[][] tabuleiro) {
        if (dir == 0) {
            if(tipo == 1){
                for (int i = x; i < 5+x; i++) {
                    tabuleiro[i][y] = 1;
                }
            }else if(tipo == 2){
                for (int i = x; i < 4+x; i++) {
                    tabuleiro[i][y] = 2;
                }
            }else if(tipo == 3){
                for (int i = x; i < 3+x; i++) {
                    tabuleiro[i][y] = 3;
                }
            }else if(tipo == 4){
                for (int i = x; i < 2+x; i++) {
                    tabuleiro[i][y] = 4;
                }
            }
        }else if(dir == 1){
            if(tipo == 1){
                for (int i = x; i < 5+x; i++) {
                    tabuleiro[x][i] = 1;
                }
            }else if(tipo == 2){
                for (int i = x; i < 4+x; i++) {
                    tabuleiro[x][i] = 2;
                }
            }else if(tipo == 3){
                for (int i = x; i < 3+x; i++) {
                    tabuleiro[x][i] = 3;
                }
            }else if(tipo == 4){
                for (int i = x; i < 2+x; i++) {
                    tabuleiro[x][i] = 4;
                }
            }
        }
    }
    public void printTabuleiro() {
        for (int i = 0)
    }
}
