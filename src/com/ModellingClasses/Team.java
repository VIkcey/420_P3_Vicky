package com.ModellingClasses;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private List<Player> players;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }


    public boolean addPlayer(Player player) {
        for (Player p : players) {
            if (p.getName().equals(player.getName())) {
                // If player already exists, return false
                return false;
            }
        }
        players.add(player);
        return true;
    }


    public boolean removePlayer(String playerName) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                players.remove(player);
                return true;
            }
        }
        return false;
    }


    public List<Player> getPlayers() {
        return players;
    }


    public void printTeamInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println(player);
        }
    }

}
