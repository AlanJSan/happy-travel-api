package com.alan.happytravel.state;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class StateDao implements IStateDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<State> getStates() {
		// TODO Auto-generated method stub
		String query = "SELECT s FROM State s";
		return em.createQuery(query).getResultList();
	}

}
