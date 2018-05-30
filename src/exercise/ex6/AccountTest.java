package exercise.ex6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	Account a1 = new Account("1", "thangnd1");
	Account a2 = new Account("2", "thangnd2", 10);
	Account a3 = new Account("3", "thangnd3", 20);
	
	@Test
	public void testGet() {
		assertEquals("2", a2.getID());
		assertEquals("thangnd2", a2.getName());
		assertEquals(10, a2.getBalance());
	}
	@Test
	public void testCredit() {
		a2.credit(10);
		assertEquals(20, a2.getBalance());
	}
	@Test
	public void testDebit() {
		a2.debit(5);
		assertEquals(5, a2.getBalance());
	}
	@Test
	public void testTransfer() {
		a2.transferTo(a3, 5);
		assertEquals(5, a2.getBalance());
		assertEquals(25, a3.getBalance());
		
	}

}
