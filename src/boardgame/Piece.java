package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //a posi��o inicial de uma pe�a � "nula" (n�o � obrigat�ria essa linha; � default)
		
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	

}
