public class Country extends AFCONTeam
{

	//PIVs
	private String countryName;

	//Constructor
	public Country(String name){
		super();
		countryName = name;
	}
	public void changeName(String countryName) {
		this.countryName = countryName;
	}
	public void getName(){
		System.out.println(countryName);
	}
	public String toString(){
		if (super.didTeamWinTournament() == true) {
			return "The country of " + countryName + " has won the tournament!";
		}
		else if (super.wasTeamKnockedOut() == true) {
			return "The country of " + countryName + " was knocked out of the tournament";
		}
		else {
			return "The country of " + countryName + " is still in the tournament, but did not win";
		}
	}
}