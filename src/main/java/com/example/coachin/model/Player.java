package com.example.coachin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
public class Player {
    @Id
    private String id;
    private String name;
    private int runs;
    private int wickets;
    private int catches;
    private int jerseyNumber;
    private double averageRunRate;
    private double economy;
    private int age;

    public Player() {
    }

    public Player(String id, String name, int runs, int wickets, int catches, int jerseyNumber, double averageRunRate, double economy, int age) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
        this.jerseyNumber = jerseyNumber;
        this.averageRunRate = averageRunRate;
        this.economy = economy;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public double getAverageRunRate() {
        return averageRunRate;
    }

    public void setAverageRunRate(double averageRunRate) {
        this.averageRunRate = averageRunRate;
    }

    public double getEconomy() {
        return economy;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
