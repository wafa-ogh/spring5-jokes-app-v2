package com.wafa.jokesapp.controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class JokesController {

    private ChuckNorrisQuotes quotes;

    @PostConstruct
    public void init(){
        quotes = new ChuckNorrisQuotes();
    }

    public String getQuote() {
        return quotes.getRandomQuote();
    }
}
