package model;

public class Student {
	//mainigie
	private long studId;
	private String name;
	private String surname;
	private String personCode;
	
	private static long counter=0;
	
	//get funkcijas
	public long getStudId() {
		return studId;
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
	
	//set funkcijas
	public void setStudId() {
		studId = counter;
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
	
	public Student() {
		setStudId();
		setName("Jānis");
		setSurname("Bērziņš-Kalniņš");
		setPersonCode("121212-12345");
	}
	
	public Student(String inputName, String inputSurname, String inputPersonCode) {
		setStudId();
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}
 
	
	
}
