package main.java.conway.domain;

public interface ICell {

	public boolean isAlive(); // Restituisco se la cella è considerata viva o morta
	
	public void setStatus(boolean v); // Cambia lo stato della cella
	
	void switchCellState();
	
}
