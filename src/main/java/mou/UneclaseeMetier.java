package mou;

import java.time.LocalDateTime;

public class UneclaseeMetier  {

	public void unemethodeMetier(UneInterfaceMetier log) {
		
		log.afficher(LocalDateTime.now() + "Debut de methode metier");
		
		log.afficher(LocalDateTime.now() + "fin de methode metier");

	}
}
