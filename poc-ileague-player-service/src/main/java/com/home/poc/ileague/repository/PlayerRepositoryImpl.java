package com.home.poc.ileague.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.poc.ileague.model.Player;

@Repository("playerRepository")
public class PlayerRepositoryImpl implements PlayerRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Player player) {
		System.out.println("Player is successfully added into the system ");
		sessionFactory.getCurrentSession().save(player);
	}

//	@Override
//	public List<User> listUsers() {
//		@SuppressWarnings("unchecked")
//		TypedQuery<User> query = sessionFactory.getCurrentSession()
//				.createQuery("from User");
//		return query.getResultList();
//	}
}
