package assessment;

public class Main {
	public static void main(String[] args) {
		Name competitorName = new Name("Hari", "Krishna", "Shrestha");
		
		Competitor competitor = new Competitor(100, competitorName, "Beginner", "Nepal", 20);
		
		System.out.println(competitor.getFullDetails());
		System.out.println(competitor.getShortDetails());
	}
}
