package com.khalid.carte.bo.impl;

import com.khalid.carte.bo.CarteBo;
import com.khalid.carte.dao.CarteDao;
import com.khalid.carte.model.Carte;

public class CarteBoImpl implements CarteBo{
	
	CarteDao carteDao;
	
	public void setCarteDao(CarteDao carteDao) {
		this.carteDao = carteDao;
	}

	public void save(Carte carte){
		carteDao.save(carte);
	}
	
	public void update(Carte carte){
		carteDao.update(carte);
	}
	
	public void delete(Carte carte){
		carteDao.delete(carte);
	}
	
	public Carte findByCarteCode(String carteCode){
		return carteDao.findByCarteCode(carteCode);
	}
}
