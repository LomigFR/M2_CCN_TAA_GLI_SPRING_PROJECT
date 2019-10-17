package fr.istic.taagli.weekend.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Sport extends GenericEntity {

	private int id;
	private String name;
	private String description;
	private List<Town> listOfTowns = new ArrayList<Town>();
	private List<User> listOfUsers = new ArrayList<User>();

	public Sport() {}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the listOfTowns
	 */
	@OneToMany
	//@Transient
	public List<Town> getListOfTowns() {
		return listOfTowns;
	}

	/**
	 * @param listOfTowns the listOfTowns to set
	 */
	public void setListOfTowns(List<Town> listOfTowns) {
		this.listOfTowns = listOfTowns;
	}

	/**
	 * @return the listOfUsers
	 */
	@OneToMany
	public List<User> getListOfUsers() {
		return listOfUsers;	
	}

	/**
	 * @param listOfUsers the listOfUsers to set
	 */
	public void setListOfUsers(List<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
}
