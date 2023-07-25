package com.qa;

import java.util.ArrayList;

public class Movie {
    String name;
    String directors;
    ArrayList<String> actors;
    Integer year;

    public Movie(String name, String directors, ArrayList<String> actors, Integer year) {
        this.name = name;
        this.directors = directors;
        this.actors = actors;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", directors='" + directors + '\'' +
                ", actors=" + actors +
                ", year=" + year +
                '}';
    }

    public void displayActors(){
        for(int i=0;i<actors.size();i++)
            System.out.println(actors.get(i));
    }
}
