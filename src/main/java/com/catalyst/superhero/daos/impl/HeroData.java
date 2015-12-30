package com.catalyst.superhero.daos.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.catalyst.superhero.daos.HeroDao;
import com.catalyst.superhero.entities.Hero;

@Component @Transactional
public class HeroData implements HeroDao{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Hero> getAllHeroes() {
		return em.createQuery("SELECT h FROM hero h", Hero.class)
			.getResultList();
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
