package fr.istic.taagli.weekend.dto;



import fr.istic.taagli.weekend.domain.Preference;
import fr.istic.taagli.weekend.domain.Sport;
import fr.istic.taagli.weekend.domain.Town;

import java.util.List;

public class UserTO {

	public int id;
	
	public String name;
	
	public String firstName;
	
	public String email;
	
	public List<Sport> listOfFavoriteSports;
	
	public List<Town> listOfFavoriteTowns;
	
	public List<Preference> listOfConstraints;
}
