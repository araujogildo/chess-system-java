package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error Creating Board: There Must Be at Least 1 Row and 1 Column");
		}
		
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}
	
	/* para impedir que uma vez criado o tabuleiro, eu n�o possa alterar o n�mero de linhas
	public void setRows(int rows) {
		this.rows = rows;
	}
	*/

	public int getColumns() {
		return columns;
	}

	/* para impedir que uma vez criado o tabuleiro, eu n�o possa alterar o n�mero de colunas
	public void setColumns(int columns) {
		this.columns = columns;
	}
	*/
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//m�todo auxiliar
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;	
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());	
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;	
	}
}
