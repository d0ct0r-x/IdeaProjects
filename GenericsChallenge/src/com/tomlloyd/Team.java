package com.tomlloyd;

public abstract class Team<T> implements Comparable<Team<T>> {

    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Team<T> opponentTeam) {
        if(this.getScore() > opponentTeam.getScore()) {
            return -1;
        } else if(this.getScore() < opponentTeam.getScore()) {
            return 1;
        } else {
            return 0;
        }

    }
}
