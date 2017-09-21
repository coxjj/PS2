package pkgPS2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPS2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisRun() {
		MyInteger myint1 = new MyInteger(1);

		assertEquals(myint1.isEven(),false);
		assertEquals(myint1.isOdd(),true);
		assertEquals(myint1.isPrime(),true);
		assertEquals(myint1.equals(1),true);


		MyInteger myint2 = new MyInteger(2);
		
		assertEquals(myint2.isEven(),true);
		assertEquals(myint2.isOdd(),false);
		assertEquals(myint2.isPrime(),true);
		assertEquals(myint2.equals(2),true);
		assertEquals(myint2.equals(1),false);
		
		
		MyInteger myint100 = new MyInteger(100);
		
		assertEquals(myint100.isEven(),true);
		assertEquals(myint100.isOdd(),false);
		assertEquals(myint100.isPrime(),false);
		assertEquals(myint100.equals(100),true);
		assertEquals(myint100.equals(100.1),false);

		MyInteger myint7 = new MyInteger(7);
		assertEquals(myint7.isEven(myint7),false);
		assertEquals(MyInteger.isOdd(myint7),true);
		assertEquals(MyInteger.isPrime(myint7),true);
		assertEquals(myint7.equals(myint7),true);
		assertEquals(myint7.equals(myint100),false);
		
		MyInteger myint8 = new MyInteger(8);
		assertEquals(myint8.isEven(myint8),true);
		assertEquals(MyInteger.isOdd(myint8),false);
		assertEquals(MyInteger.isPrime(myint8),false);
		assertEquals(myint8.equals(myint8),true);
		assertEquals(myint8.equals(myint100),false);
		


	}

	}


