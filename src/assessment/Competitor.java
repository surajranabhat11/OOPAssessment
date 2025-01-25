package assessment;

public class Competitor {
	//Class to store competitors info
	private int competitorId;
	private Name name; //Name class to store name
	private String competitionLevel;
	private String country;
	private int age;
	
	public Competitor(int competitorId, Name name, String competitionLevel, String country, int age ) {
		this.competitorId  = competitorId;
		this.name = name;
		this.competitionLevel = competitionLevel;
		this.country = country;
		this.age = age;
	}
	
	//Getter and Setter 
	public int getCompetitorId() {
		return competitorId;
	}
	
	public void setCompetitorId(int competitorId) {
		this.competitorId = competitorId;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public String getCompetitionLevel() {
		return competitionLevel;
	}
	
	public void setCompetitionLevel(String competitionLevel) {
		this.competitionLevel = competitionLevel;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Overall Score
	public double getOverallScore() {
		return 5.0;
	}
	
	//Competitor's full details
	public String getFullDetails() {
		return String.format("Competitor number %d, Name: %s. %s is a %s aged %d from %s and has an overall score of %.1f.",competitorId,name.getFullName(), name.getFirstName(), competitionLevel, age, country, getOverallScore());
	}
	
	//Competitor's short details
	public String getShortDetails() {
		return String.format("CN %d (%s) has overall score %.1f",competitorId, name.getInitials(), getOverallScore());
	}
}

class Name{
	//Name class to store full name
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return String.format("%s %s %s", firstName, middleName, lastName);
	}
	
	public String getInitials() {
		return String.format("%s%s%s",firstName.charAt(0),middleName.charAt(0),lastName.charAt(0));
	}
	
	public String getFirstName() {
		return firstName;
	}
}
