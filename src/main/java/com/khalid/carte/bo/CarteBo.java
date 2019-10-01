package com.khalid.carte.bo;

import com.khalid.carte.model.Carte;

public interface CarteBo {
	
	void save(Carte carte);
	
	void update(Carte carte);
	
	void delete(Carte carte);
	
	Carte findByCarteCode(String carteCode);

}
