package main.java.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import main.java.conway.domain.Grid;
import main.java.conway.domain.ICell;
import main.java.conway.domain.IGrid;

public class GridTest {
	
	private int rows = 4;
	private int cols = 5;

	
	private IGrid grid;
	
	@Before
	public void setup() {
		grid = new Grid(rows, cols);
	}
	
	@Test
	public void test_getRowsNum() {
		assertTrue(grid.getRowsNum() == rows);
	}
	
	@Test
	public void test_getColsNum() {
		assertTrue(grid.getColsNum() == cols);
	}
	
	@Test
	public void test_all_cells_different() {
		Set<ICell> set = Collections.newSetFromMap(new IdentityHashMap<>());
		for(int y = 0; y < cols; y++) {
			for (int x = 0; x < rows; x++) {
				set.add(grid.getCell(x, y));
			}
		}
		assertTrue(set.size() == rows * cols);
	}
	
	@Test
	public void test_all_cells_not_null() {
		for(int y = 0; y < cols; y++) {
			for (int x = 0; x < rows; x++) {
				ICell cell = grid.getCell(x, y);
				assertNotNull(cell);
			}
		}
	}
	
	
	@Test
	public void test_get_cell() {
		ICell c = grid.getCell(1, 1);
		c.setStatus(true);
		assertTrue(grid.getCell(1, 1).isAlive());
	}
	
	@Test
	public void test_reset() {
		grid.getCell(1, 1).setStatus(true);
		grid.getCell(2, 2).setStatus(true);
		grid.getCell(3, 3).setStatus(true);
		grid.reset();
		for(int j = 0; j < cols; j++) {
			for(int i = 0; i < rows; i++) {
				assertFalse(grid.getCell(i, j).isAlive());
			}
		}
		
	}
	
}
