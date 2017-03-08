package com.joke;

import java.util.Random;

public class JokeProvider {
    private static final String[] jokes = {
            "Why do men find it difficult to make eye contact? Breasts don’t have eyes.",
            "A computer once beat me at chess, but it was no match for me at kick boxing.",
            "How do you get a sweet 80-year-old lady to say the F word?\n" +
                    "Get another sweet little 80-year-old lady to yell *BINGO*!",
            "As long as there are tests, there will be prayer in schools.",
            "What did one ocean say to the other ocean? Nothing, they just waved.",
            "A day without sunshine is like, night."
    };

    public static String getJoke(){
        int size = jokes.length;

        Random r = new Random();
        int index = r.nextInt(size);

        return jokes[index];
    }
}
