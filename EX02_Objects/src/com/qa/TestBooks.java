package com.qa;

import java.util.ArrayList;

public class TestBooks {
    public static void main(String[] args) {
        Book book1 = new Book("a","b", 1.0);
        Book book2 = new Book("c","d", 2.0);
        Book book3 = new Book("e","f", 3.0);

        Book[] books = {book1,book2,book3};

        for(int i=0;i<books.length;i++)
            System.out.println(books[i]);

        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<String> actors1 = new ArrayList<>();
        actors1.add("John Cena");
        actors1.add("Di Caprio");
        actors1.add("Brad Pitt");

        ArrayList<String> actors2 = new ArrayList<>();
        actors2.add("John Travolta");
        actors2.add("Di Caprio");
        actors2.add("Jack Nicholson");

        ArrayList<String> actors3 = new ArrayList<>();
        actors3.add("John Cena");
        actors3.add("Cristi Puiu");
        actors3.add("Brad Pitt");

        movies.add(new Movie("Scream","Nicolaescu",actors1,1987));
        movies.add(new Movie("Solaris","Tarkovski",actors2,1988));
        movies.add(new Movie("Stalker","Tarkovski",actors3,1989));

        for(int i=0;i<movies.size();i++)
            movies.get(i).displayActors();

    }
}
