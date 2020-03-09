package br.imd.ufrn.batalhanaval;

import java.util.Random;

public class Tabuleiro {

    public enum EstadoCelula {
        AGUA(0), PORTA_AVIOES_J1(1), PORTA_AVIOES_J2(2),
        NAVIO_DE_GUERRA_J1(3), NAVIO_DE_GUERRA_J2(4),
        CRUZADO_J1(5), CRUZADO_J2(6), SUBMARINO_J1(7),SUBMARINO_J2(8),
        DESTRUIDOR_J1(9), DESTRUIDOR_J2(10), NAVIO_AFUNDADO_J1(11), NAVIO_AFUNDADO_J2(12);
        private final int valor;
        EstadoCelula(int valor_estado) {
            valor = valor_estado;
        }
        public int getValor() {
            return valor;
        }
    }
    private EstadoCelula[][] tabuleiro = new EstadoCelula[10][10];
    public EstadoCelula[][] getTabuleiro() {
        return tabuleiro;
    }
    public void setTabuleiro(EstadoCelula[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    public void zerarTabuleiro() {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                this.tabuleiro[i][j] = EstadoCelula.AGUA;
            }
        }
    }
    public void preencherTabuleiro() {
        Random randomX,RandomY,RandomPeca,RandomDir;
        Boolean[] jaPosicionado = new Boolean[10];
        for(int i = 0; i < 10; i++) {
            jaPosicionado[i] = false;
        }
        while(!jaPosicionado(jaPosicionado)){
            randomX.nextInt()
        }
    }
    private boolean jaPosicionado(Boolean[] pecas) {
        for (int i = 0; i < pecas.length;i++) {
            if (pecas[i] == false) {
                return false;
            }
        }
        return true;
    }



}
