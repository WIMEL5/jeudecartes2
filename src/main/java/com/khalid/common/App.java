package com.khalid.common;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.khalid.carte.bo.CarteBo;
import com.khalid.carte.model.Carte;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	
    	CarteBo carteBo = (CarteBo)appContext.getBean("carteBo");

    	// Créer une liste de carte

		//final Logger log = Logger.getLogger(Carte.class);
		
		ArrayList<Carte> jeu_de_carte = new ArrayList<Carte>();
		//log.info("initialisation du tableau des couleurs");
		String couleurs[] = { "trèfle", "pique", "carreau", "coeur" };

		// Alimenter la liste des cartes, 2 boucles imbriqués, une pour la couleur
		// l'autre pour les 13 cartes par couleur
		//log.info("Remplissage de la liste des cartes");
		for (int x = 0; x < couleurs.length; x++) {
			for (int i = 1; i <= 13; i++) {

				Carte uneCarte = new Carte();
				//uneCarte.setCarteCode(i);
				// le libellé est composé de l'identifiant et de la couleur, ex: 2 de coeur, on
				// adapte le libellé pour l'as, le valet, le roi et la reine
				uneCarte.setCarteName(i + " de " + couleurs[x]);
				if (i == 1) {
					uneCarte.setCarteName("As de " + couleurs[x]);
				}
				if (i == 11) {
					uneCarte.setCarteName("Valet de " + couleurs[x]);
				}
				if (i == 12) {
					uneCarte.setCarteName("Reine de " + couleurs[x]);
				}
				if (i == 13) {
					uneCarte.setCarteName("Roi de " + couleurs[x]);
				}
			 
				//jeu_de_carte.add(uneCarte);
				carteBo.save(uneCarte);

			}
		}
    	
    	/** select **/
    	//Carte carte4 = carteBo.findByCarteCode("CCC");
    	//System.out.println(carte2);
    	
    	/** update **/
    	//carte2.setCarteName("HAIO-1");
    	//carteBo.update(carte2);
    	
    	/** delete **/
    	//carteBo.delete(carte2);
    	
    	System.out.println("Insertion OK!");
    }
}
