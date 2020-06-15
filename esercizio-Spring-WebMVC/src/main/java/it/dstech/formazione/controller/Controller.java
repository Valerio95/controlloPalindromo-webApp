package it.dstech.formazione.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.gestione.Gestione;
import it.dstech.modelli.Risposta;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@RequestMapping(value  = "/controllaFrase")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		Gestione gestione = new Gestione();
		int numeroParole =gestione.contaParole(testo);
		
 List<String> listaPalindromi = gestione.listaPalindromi(testo);
 
 Risposta risposta = new Risposta();
 risposta.setListaPalindromi(listaPalindromi);
risposta.setNumeroPalindromi(risposta.getListaPalindromi().size());
 risposta.setNumeroParole(numeroParole);
	return new ModelAndView("risultato", "risposta", risposta);
	}
}
