package com.myproject.watchlist.watchlist.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.myproject.watchlist.watchlist.model.User;
import com.myproject.watchlist.watchlist.service.UserService;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

	UserService userservice = new UserService();
	
	@GET
	public List<User> getUsers(){
		return userservice.getAllUsers();
	}
	@GET
	@Path("/{name}")
	public User getUser(@PathParam("name") String name){
		return userservice.getUser(name);
	}
	@POST
	public User addUser(User user){
		return userservice.addUser(user);
	}
	@PUT
	@Path("/{name}")
	public User updateUser(@PathParam("name") String name, User user){
		user.setName(name);
		return userservice.updateUser(user);
	}
	@DELETE
	@Path("/{name}")
	public void removeUser(@PathParam("name") String name){
		userservice.removeUser(name);
	}
}
