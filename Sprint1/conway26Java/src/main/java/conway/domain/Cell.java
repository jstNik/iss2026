package main.java.conway.domain;

public class Cell implements ICell {
	
	// Definisco la rappresentazione concreta di una cella
	private boolean value;

	@Override
	public boolean isAlive() {
		return value;
	}
	
	@Override
	public void setStatus(boolean v) {
		value = v;
	}
	
	@Override
	public void switchCellState() {
		value = !value;
	}
	
}
