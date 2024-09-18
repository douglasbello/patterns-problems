package com.douglasbello;

import com.douglasbello.facade.PlayMovieFacade;

public class Main {
    public static void main(String[] args) {
        PlayMovieFacade playMovie = new PlayMovieFacade();
        playMovie.playMovie("Matrix");
    }
}