package main.java.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.conway.domain.Cell;
import main.java.conway.domain.ICell;

public class CellTest {
	
	private ICell c; // Ho definito un simbolo c che spazierà nel dominio delle ICell.
	
	@Before
	public void setup() {
		System.out.println("ConwayLifeTest | setup");
		c = new Cell();
	}

	@After
	public void down() {
		System.out.println("ConwayLifeTest | down");
	}
	
	
	@Test
	public void testCellAlive() {
		c.setStatus(true);
		boolean r = c.isAlive();
		assertTrue(r);
	}
	
	@Test
	public void testCellDead() {
		c.setStatus(false);
		boolean r = c.isAlive();
		assertFalse(r);
	}
	

}
