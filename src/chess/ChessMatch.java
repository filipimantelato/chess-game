package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()]; //instancia uma nova peca de xadrez na matriz do board(8,8)
		
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j); 
			}
		}
		
		return mat;
	}
}
