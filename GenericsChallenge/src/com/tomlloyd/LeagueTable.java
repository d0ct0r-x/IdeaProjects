package com.tomlloyd;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String name;
    private String sport;
    private ArrayList<T> teams;

    public LeagueTable(String name, String sport) {
        this.name = name;
        this.sport = sport;
        this.teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public boolean addTeam(T newTeam) {
        teams.add(newTeam);
        return true;
    }

    public void showTeams() {
        if(this.teams.isEmpty()) {
            System.out.println("There are no teams in the league.");
        } else {
            Collections.sort(this.teams);
            for(int i=0; i<this.teams.size(); i++) {
                System.out.println(this.teams.get(i).toString());
            }
        }
    }
}
