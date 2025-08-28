package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) { //metodo para criar a matriz no console
		for(int i = 0; i < pieces.length; i++) { 
			System.out.print((8 - i) + " "); // pra printar os numeros na lateral
			for(int j = 0; j <pieces.length; j++) {
				printPiece(pieces[i][j]); //printa as pecas na posicao exata do i e j, caso seja nulo vem traco e caso tenha peca a peca
			}
			System.out.println(); //pula linha dps de criar a posicao
		}
		System.out.println("  a b c d e f g h"); //fim de tudo dois espacos e as letras do tabuleiro
	}
	
	private static void printPiece(ChessPiece piece) { //metodo para printar - caso n tenha peca na posicao, se nao cria a peca e independente da espaco entre elas
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		
		System.out.print(" ");
	}
}
