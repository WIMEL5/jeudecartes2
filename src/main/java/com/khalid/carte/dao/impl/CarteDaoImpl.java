package com.khalid.carte.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.khalid.carte.dao.CarteDao;
import com.khalid.carte.model.Carte;

public class CarteDaoImpl extends HibernateDaoSupport implements CarteDao{
	
	public void save(Carte carte){
		getHibernateTemplate().save(carte);
	}
	
	public void update(Carte carte){
		getHibernateTemplate().update(carte);
	}
	
	public void delete(Carte carte){
		getHibernateTemplate().delete(carte);
	}
	
	public Carte findByCarteCode(String carteCode){
		List list = getHibernateTemplate().find("from Carte where carteCode=?",carteCode);
		return (Carte)list.get(0);
	}

}
