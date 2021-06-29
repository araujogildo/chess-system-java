package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //a posição inicial de uma peça é "nula" (não é obrigatória essa linha; é default)
		
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	

}
