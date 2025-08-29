package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch(); //cria a partida de xadrez
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			UI.printBoard(chessMatch.getPieces()); //chama a UI printando as pecas da chess match
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
}
