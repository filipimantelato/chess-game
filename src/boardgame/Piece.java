package boardgame;

public class Piece {
	protected Position position; //protected because this is not the chess position, is the matrix position
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() { //only class in the same packet or subclass can access board
		return board;
	}
}
