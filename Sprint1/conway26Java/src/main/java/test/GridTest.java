package main.java.test;

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
	
}
