package main.java.conway.domain;

public interface IGrid {
	
	int getRowsNum(); // Primitiva
	int getColsNum(); // Primitiva
	ICell getCell(int x, int y) throws IndexOutOfBoundsException; // Primitiva
	void reset(); // Non primitiva
	
}
