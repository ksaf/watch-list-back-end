package com.myproject.watchlist.watchlist.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myproject.watchlist.watchlist.database.DatabaseClass;
import com.myproject.watchlist.watchlist.model.Show;
import com.myproject.watchlist.watchlist.model.User;

public class UserService {

	private Map<String, User> users = DatabaseClass.getUsers();
	
	public UserService(){
		Set<Show> list = new HashSet<Show>();
		list.add(new Show("showId",0,0,0));
		users.put("admin", new User(1L,"admin","123",0,list));
	}
	
	public List<User> getAllUsers(){
		return new ArrayList<User>(users.values());
	}
	public User getUser(String name){
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		User user = (User) session.get(User.class,name);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	public User addUser(User user){
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	public User updateUser(User user){
		if(user.getName().isEmpty()){
			return null;
		}
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	public User removeUser(String name){
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		User user = (User) session.get(User.class,name);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		return user;
	}
	
}
