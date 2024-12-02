public class AFCONTeam
{

	//PIVs
	private int teamSize;
	private boolean knockedOut;
	private boolean tournamentWinner;

	//Constructor
	public AFCONTeam()
	{
		teamSize = 23;
		knockedOut = false;
		tournamentWinner = false;
	}

	//Mutators
	public void knockedOutOfTournament()
	{
		knockedOut = true;
	}

	public void wonTournament()
	{
		tournamentWinner = true;
	}

	//Accessors
	public boolean wasTeamKnockedOut()
	{
		return knockedOut;
	}

	public boolean didTeamWinTournament()
	{
		return tournamentWinner;
	}

	//toString
	public String toString()
	{
		return "This is a team in the 2017 AFCON Tournament.";
	}

}