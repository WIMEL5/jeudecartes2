package com.khalid.carte.model;

import java.io.Serializable;

public class Carte implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long carteId;
	private String carteCode;
	private String carteName;

	public Carte() {
	}

	public Carte(String carteCode, String carteName) {
		this.carteCode = carteCode;
		this.carteName = carteName;
	}

	public Long getCarteId() {
		return this.carteId;
	}

	public void setCarteId(Long carteId) {
		this.carteId = carteId;
	}

/*	public String getCarteCode() {
		return this.carteCode;
	}

	public void setCarteCode(String i) {
		this.carteCode = i;
	}
*/
	public String getCarteName() {
		return this.carteName;
	}

	public void setCarteName(String carteName) {
		this.carteName = carteName;
	}

	@Override
	public String toString() {
		return "Carte [carteId=" + carteId
				+ ", carteName=" + carteName + "]";
	}

	
}
