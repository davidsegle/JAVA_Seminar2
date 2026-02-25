package model;

import modelenum.ProfDegree;

public class Professor {
	private long profId;
	private String name;
	private String surname;
	private String personCode;
	private ProfDegree degree;
	
	private static long counter = 0;
	
	public long getProfId() {
		return profId;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	
	
	public void setProfId() {
		profId = counter;
		counter++;
	}
	public void setName(String inputName) {
		if((inputName !=null) && (!inputName.isEmpty()) && (inputName.matches("[A-ZĒŪĪĀŠĢĶĻŽČŅ]{1}[a-zēūīāšģķļžčņ]{2,15}( {1}[A-ZĒŪĪĀŠĢĶĻŽČŅ]{1}[a-zēūīāšģķļžčņ]{2,15})?"))   ) {
			name = inputName;
		}
		else {
			name = "Unknown";
		}
		
	}
	public void setSurname(String inputSurname) {
		if((inputSurname != null) && (!inputSurname.isEmpty()) && (inputSurname.matches("[A-ZĒŪĪĀŠĢĶĻŽČŅ]{1}[a-zēūīāšģķļžčņ]{2,15}([-]{1}[A-ZĒŪĪĀŠĢĶĻŽČŅ]{1}[a-zēūīāšģķļžčņ]{2,15})?"))) {
			surname = inputSurname;
		}
		else {
			surname = "Unknown";
		}
	}
	public void setPersonCode(String inputPersonCode) {
		if((inputPersonCode != null) && (!inputPersonCode.isEmpty()) && (inputPersonCode.matches("[0-9]{6}[-]{1}[0-9]{5}"))) {
			personCode = inputPersonCode;
		}
		else {
			personCode = "Unknown";
		}
	}
	public void setDegree(ProfDegree inputDegree) {
		if(inputDegree!=null) {
			degree = inputDegree;
		}
		else {
			degree = ProfDegree.unknown;
		}
	}
	
	
	
}
