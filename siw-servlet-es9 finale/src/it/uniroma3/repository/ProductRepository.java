package it.uniroma3.repository;

import javax.persistence.EntityManager;

import model.Prodotto;

public class ProductRepository extends CrudRepositoryJpa<Prodotto> {

	public ProductRepository(EntityManager em){
		super(em,Prodotto.class);
	}
}
