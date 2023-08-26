package br.com.samuel.cm;

import br.com.samuel.cm.modelo.Tabuleiro;
import br.com.samuel.cm.visao.TabuleiroConsole;

public class aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);
    }
}
