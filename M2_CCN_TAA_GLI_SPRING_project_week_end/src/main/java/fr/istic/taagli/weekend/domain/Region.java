package fr.istic.taagli.weekend.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Region extends GenericEntity{

	private int id;
	private String name;
	private List<Department> listOfDepartments = new ArrayList<Department>();

	public Region() {}

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
	 * @return the listOfDepartments
	 */
	@OneToMany(mappedBy = "region", cascade = CascadeType.PERSIST)
	public List<Department> getListOfDepartments() {
		return listOfDepartments;
	}

	/**
	 * @param listOfDepartments the listOfDepartments to set
	 */
	public void setListOfDepartments(List<Department> listOfDepartments) {
		this.listOfDepartments = listOfDepartments;
	}
}
