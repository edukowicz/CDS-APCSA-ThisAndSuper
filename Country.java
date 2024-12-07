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
			return "" + countryName + " participated in the 2017 AFCON tournament and was not knocked out of the tournament and won the tournament.";
		}
		else if (super.wasTeamKnockedOut() == true) {
			return "" + countryName + " participated in the 2017 AFCON tournament and was knocked out of the tournament";
		}
		else {
			return "" + countryName + " participated in the 2017 AFCON tournamnet and was not knocked out of the tournament and did not win the tournament.";
		}
	}
}