package application;

import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch(); //cria a partida de xadrez
		UI.printBoard(chessMatch.getPieces()); //chama a UI printando as pecas da chess match
		
	}
}
