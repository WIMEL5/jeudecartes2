package com.khalid.carte.dao;

import com.khalid.carte.model.Carte;

public interface CarteDao {
	
	void save(Carte carte);
	
	void update(Carte carte);
	
	void delete(Carte carte);
	
	Carte findByCarteCode(String carteCode);

}
