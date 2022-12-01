package org.generation.italy.movie.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Indichiamo a java che questa classe funzionera' da controller
@Controller
public class MovieController {
	
	//Indichiamo a quale path fa riferimento questo metodo
	@RequestMapping("/")
	//indichiamo il metodo publico che ritornerà una Stringa
			//indichiamo la presenza di un model per fornire attributi alla view ritornata
	public String getHome(Model model) {
		//assegnamo alla variabile name un valore 
		String name = "Andrea";
		//aggiungiamo il valore della variabile al posto dell'elemento name inserito nell'html
		model.addAttribute("name", name);
		
		//ritorniamo il file assocciato al nome "home"
		return "home";
	}
}
