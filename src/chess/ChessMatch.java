package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()]; //instancia uma nova peca de xadrez na matriz do board(8,8)
		
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j); //faz um for para criar as pecas no tabuleiro e mostrar as pecas pro jogador, pois as Piece nao sao vistas por ele por isso o board.piece tem q ser downcasting para chesspiece
			}
		}
		
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,7));
		board.placePiece(new Rook(board, Color.BLACK), new Position(7,0));
		board.placePiece(new Rook(board, Color.BLACK), new Position(7,7));
		board.placePiece(new King(board, Color.WHITE), new Position(0,4));
		board.placePiece(new King(board, Color.BLACK), new Position(7,4));
	}
}
