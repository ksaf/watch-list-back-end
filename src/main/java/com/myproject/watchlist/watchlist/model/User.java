package com.myproject.watchlist.watchlist.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table (name="USER_DETAILS")
public class User {
	
	private long id;
	@Id
	private String name;
	private String pass;
	private int givenOffset;

	@ElementCollection(fetch=FetchType.EAGER)
	private Set<Show> listOfShows  = new HashSet();

	public User(){
		
	}

	public User(long id, String name, String pass, int givenOffset, Set<Show> listOfShows) {
		this.id =id;
		this.name = name;
		this.pass = pass;
		this.givenOffset = givenOffset;
		this.listOfShows = listOfShows;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getGivenOffset() {
		return givenOffset;
	}
	public void setGivenOffset(int givenOffset) {
		this.givenOffset = givenOffset;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Show> getListOfShows() {
		return listOfShows;
	}

	public void setListOfShows(Set<Show> listOfShows) {
		this.listOfShows = listOfShows;
	}
	
	
}
