package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sagar.Train;

public class TrainTest {

	@Test
	public void testPrintHPP() {
		Train train = new Train("HPP");
		assertEquals("<HHHH::|OOOO|::|OOOO|", train.print());
	}

	@Test
	public void testPrintHPPH() {
		Train train = new Train("HPPH");
		assertEquals("<HHHH::|OOOO|::|OOOO|::HHHH>", train.print());
	}

	@Test
	public void testPrintHPRP() {
		Train train = new Train("HPRP");
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|", train.print());
	}

	@Test
	public void testPrintHPRPH() {
		Train train = new Train("HPRPH");
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|::HHHH>", train.print());
	}

	@Test
	public void testPrintHCCC() {
		Train train = new Train("HCCC");
		assertEquals("<HHHH::|____|::|____|::|____|", train.print());
	}

	@Test
	public void testFill() {
		Train train = new Train("HCCC");
		assertEquals("<HHHH::|____|::|____|::|____|", train.print());

		assertTrue(train.fill());
		assertEquals("<HHHH::|^^^^|::|____|::|____|", train.print());

		assertTrue(train.fill());
		assertEquals("<HHHH::|^^^^|::|^^^^|::|____|", train.print());

		assertTrue(train.fill());
		assertEquals("<HHHH::|^^^^|::|^^^^|::|^^^^|", train.print());

		assertFalse(train.fill());
	}

	@Test
	public void testDetachEnd() {
		Train train = new Train("HPRPH");
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|::HHHH>", train.print());

		train.detachEnd();
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|", train.print());

		// Detaching again should have no effect as the end is no longer 'H'
		train.detachEnd();
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|", train.print());
	}

	@Test
	public void testDetachHead() {
		Train train = new Train("HPRP");
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|", train.print());

		train.detachHead();
		assertEquals("|OOOO|::|htht|::|OOOO|", train.print());

		// Detaching again should have no effect as there is no more 'H' at the beginning
		train.detachHead();
		assertEquals("|OOOO|::|htht|::|OOOO|", train.print());
	}

	@Test
	public void testDetachHeadAndEnd() {
		Train train = new Train("HPRPH");
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|::HHHH>", train.print());

		train.detachEnd();
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|", train.print());

		train.detachHead();
		assertEquals("|OOOO|::|htht|::|OOOO|", train.print());

		// Detaching again should have no effect
		train.detachHead();
		assertEquals("|OOOO|::|htht|::|OOOO|", train.print());
	}
}
