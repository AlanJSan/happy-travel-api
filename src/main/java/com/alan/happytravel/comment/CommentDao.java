package com.alan.happytravel.comment;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class CommentDao implements ICommentDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Comment> getComments() {
		// TODO Auto-generated method stub
		String query = "SELECT c FROM Comment c";
		return em.createQuery(query).getResultList();
	}

}