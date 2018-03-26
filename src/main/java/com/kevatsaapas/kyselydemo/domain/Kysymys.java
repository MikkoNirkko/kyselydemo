package com.kevatsaapas.kyselydemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kysymys {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String kysymysTeksti;
	
	public Kysymys(String kysymysTeksti) {
		super();
		this.kysymysTeksti = kysymysTeksti;
	}

	public Kysymys() {
		super();
		this.kysymysTeksti = null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKysymysTeksti() {
		return kysymysTeksti;
	}

	public void setKysymysTeksti(String kysymysTeksti) {
		this.kysymysTeksti = kysymysTeksti;
	}

	@Override
	public String toString() {
		return "Kysymys [id=" + id + ", kysymysTeksti=" + kysymysTeksti + "]";
	}
	
	
	
}
