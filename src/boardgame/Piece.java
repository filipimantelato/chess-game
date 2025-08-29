package boardgame;

public abstract class Piece {
	protected Position position; //protected because this is not the chess position, is the matrix position
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() { //only class in the same packet or subclass can access board
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) { //rook method, metodo concreto que usa um abstrato
		return possibleMoves()[position.getRow()][position.getColumn()];	
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
