package com.tomlloyd;

public class Main {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);

        FootballTeam arsenal = new FootballTeam("Arsenal", 20);
        FootballTeam manu = new FootballTeam("Man U", 10);
        FootballTeam chelsea = new FootballTeam("Chelsea", 30);
        RugbyTeam albion = new RugbyTeam("Albion", 10);

        LeagueTable<Team<FootballTeam>> uefa = new LeagueTable<>("UEFA", "Football");

        uefa.showTeams();

        uefa.addTeam(arsenal);
        uefa.addTeam(manu);
        uefa.addTeam(chelsea);

        uefa.showTeams();
    }
}
