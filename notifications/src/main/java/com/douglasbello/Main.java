package com.douglasbello;

import com.douglasbello.entities.Show;
import com.douglasbello.entities.User;

public class Main {
    public static void main(String[] args) {
        Show breakingBad = new Show("Breaking Bad", 94);
        Show gameOfThrones = new Show("Game of Thrones", 120);

        breakingBad.addListener(new User("napster"));
        gameOfThrones.addListener(new User("napster"));

        breakingBad.addEpisode();
        gameOfThrones.addEpisode();
    }
}