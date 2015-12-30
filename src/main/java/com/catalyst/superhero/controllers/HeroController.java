package com.catalyst.superhero.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.superhero.entities.Hero;
import com.catalyst.superhero.services.HeroService;

@RestController
public class HeroController {
	@Autowired
	private HeroService heroService;
	
	@RequestMapping(value = "/heroes", method = RequestMethod.GET)
	public List<Hero> getAllHeroes() {
		return heroService.getAllHeroes();
	}

	public void setHeroService(HeroService heroService) {
		this.heroService = heroService;
	}
}
