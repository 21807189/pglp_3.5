package mou;

import java.time.LocalDateTime;

public class UneclaseeMetier implements UneInterfaceMetier {

	public void affiche(String string) {
		
		System.out.println(string);
	}
	
	public void unemethodeMetier(UneInterfaceMetier log) {
		
		log.affiche(LocalDateTime.now() + "Debut de methode metier");
		
		log.affiche(LocalDateTime.now() + "fin de methode metier");

	}
}
