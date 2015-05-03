package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sagar.Train;

public class TrainTest {
Train t;
@Before
public void setup(){
	
}
	@Test
	public void testPrint() {
		
		t=new Train("HPP");
		String result=t.print();
		assertEquals("<HHHH::|OOOO|::|OOOO|",result);
		t=new Train("HPPH");
		String resultg=t.print();
		assertEquals("<HHHH::|OOOO|::|OOOO|::HHHH>",resultg);
	t=new Train("HPRP");
	String result1=t.print();
	assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|",result1);
	t=new Train("HPRPH");
	String result2=t.print();
	assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|::HHHH>",result2);
	t=new Train("HCCC");
	String result3=t.print();
	assertEquals("<HHHH::|____|::|____|::|____|", result3);
	}


  @Test
public void testfill()
{
 Train t=new Train("HCCC");
  String result=t.print();
 assertEquals("<HHHH::|____|::|____|::|____|",result);
 t.fill();
 String result1=t.print();
 assertEquals("<HHHH::|^^^^|::|____|::|____|",result1);
 t.fill();
 String result2=t.print();
 assertEquals("<HHHH::|^^^^|::|^^^^|::|____|",result2);
 t.fill();
 String result3=t.print();
 assertEquals("<HHHH::|^^^^|::|^^^^|::|^^^^|",result3);
 assertFalse(t.fill());
 System.out.println("bye");
}
  @Test
  public void testheaden()
  {

	Train t1=new Train("HPRPH");
	String result=t1.print();
	assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|::HHHH>",result);
	t1.detachEnd();
	String result1=t1.print();
	assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|",result1);
	t1.detachEnd();
String result2=t1.print();
assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|",result2);
		
  }
  @Test
  public void testcomb()
  {
	  Train t=new Train("HPRPH");
	  String result=t.print();
		assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|::HHHH>",result);
		t.detachEnd();
  String result1=t.print();
  assertEquals("<HHHH::|OOOO|::|htht|::|OOOO|",result1);
  t.detachHead();
  String result2=t.print();
  assertEquals("|OOOO|::|htht|::|OOOO|", result2);
  t.detachHead();
  String result3=t.print();
  assertEquals("|OOOO|::|htht|::|OOOO|", result3);

  
  
  
  }
 }