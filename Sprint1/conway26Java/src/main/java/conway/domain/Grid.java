package main.java.conway.domain;

public class Grid implements IGrid {
	
	private final ICell array[][];
	
	public Grid(int rows, int cols) {
		this.array = new ICell[cols][rows];
		for (int y = 0; y < cols; y++) {
			for (int x = 0; x < rows; x++) {
				array[y][x] = new Cell();
			}
		}
	}

	@Override
	public ICell getCell(int x, int y) {
		return array[y][x];
	}
	
}
