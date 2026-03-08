package main.java.conway.domain;

public class Grid implements IGrid {
	
	private final ICell array[][];
	
	
	public Grid(int rows, int cols) {
		this.array = new ICell[cols][rows];
		for (int y = 0; y < getColsNum(); y++) {
			for (int x = 0; x < getRowsNum(); x++) {
				array[y][x] = new Cell();
			}
		}
	}

	@Override
	public ICell getCell(int x, int y) throws IndexOutOfBoundsException {
		return array[y][x];
	}
	
	
	@Override
	public int getRowsNum() {
		return array[0].length;
	}
	
	
	@Override
	public int getColsNum() {
		return array.length;
	}
	
	@Override
	public void reset() {
		for (int y = 0; y < getColsNum(); y++) {
			for (int x = 0; x < getRowsNum(); x++) {
				array[y][x].setStatus(false);
			}
		}
	}
	
}
