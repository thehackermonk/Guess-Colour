package com.hacker.guesscolor.logic;

public class ResultGenerator {

    /**
     * Checks for the result by checking solution colour and the colour selected by the user
     *
     * @param resultColour colour which is the solution
     * @param buttonColour colour that the user selected
     * @return true if both the colours match, false otherwise
     */
    public boolean checkResult(String resultColour, String buttonColour) {

        return resultColour.equals(buttonColour);

    }

}
