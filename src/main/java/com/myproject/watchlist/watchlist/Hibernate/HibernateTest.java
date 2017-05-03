package com.myproject.watchlist.watchlist.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myproject.watchlist.watchlist.model.Show;
import com.myproject.watchlist.watchlist.model.User;

public class HibernateTest {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("ksaf");
		user.setPass("****");
		user.setGivenOffset(2);
		
		Show show = new Show();
		show.setImdbId("tt223113");
		show.setSavedSeason(1);
		show.setSavedEpisode(5);
		show.setEpisodesForSavedSeason(21);
		
		user.getListOfShows().add(show);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
