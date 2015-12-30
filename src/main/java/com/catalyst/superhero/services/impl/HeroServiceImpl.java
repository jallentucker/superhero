package com.catalyst.superhero.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.superhero.daos.HeroDao;
import com.catalyst.superhero.entities.Hero;
import com.catalyst.superhero.services.HeroService;

@Service
public class HeroServiceImpl implements HeroService{
	@Autowired
	private HeroDao heroDao;

	@Override
	public List<Hero> getAllHeroes() {
		return heroDao.getAllHeroes();
	}
	
	public void setHeroDao(HeroDao heroDao) {
		this.heroDao = heroDao;
	}
}
