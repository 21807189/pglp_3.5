package mou;

import org.junit.Before;
import org.junit.Test;

public class MetierTest {
	
	private UneclasseMetier metier;
	private UneInterfaceMetier interface_Metier;
	
	@Before()
	
	public void setUp() {
		interface_Metier= new Metier();
	}

	@Test
	
	public void TestM() {
		this.metier=new UneclasseMetier();
		metier.unemethodeMetier(interface_Metier);
				
	}
}
