package com.hacker.guesscolor.logic;

import java.util.Random;

public class RandomGenerator {

    /**
     * Pick a random colour from a list of colours
     *
     * @return random colour
     */
    public String generateRandomColour() {

        String[] colours;
        int rand;

        colours = new String[]{"Black", "Blue", "Green", "Orange", "Pink", "Red", "White", "Yellow"};
        rand = new Random().nextInt(colours.length);

        return colours[rand];

    }

    /**
     * Pick a random colour from a list of colours when the colours are input
     *
     * @param colours list of colours
     * @return random colour
     */
    public String generateRandomColour(String[] colours) {

        int rand;

        rand = new Random().nextInt(colours.length);

        return colours[rand];

    }

    /**
     * Pick a random colour different from a particular colour
     *
     * @param colour1 input colour
     * @return random colour different than the input colour
     */
    public String generateRandomColour(String colour1) {

        String[] colours;
        int rand;

        colours = new String[]{"Black", "Blue", "Green", "Orange", "Pink", "Red", "White", "Yellow"};
        rand = new Random().nextInt(colours.length);

        while (colours[rand].equals(colour1)) {

            rand = new Random().nextInt(colours.length);

        }

        return colours[rand];

    }

    /**
     * Pick a random colour different from two input colours
     *
     * @param colour1 input colour 1
     * @param colour2 input colour 2
     * @return random colour different from the two input colours
     */
    public String generateRandomColour(String colour1, String colour2) {

        String[] colours;
        int rand;

        colours = new String[]{"Black", "Blue", "Green", "Orange", "Pink", "Red", "White", "Yellow"};
        rand = new Random().nextInt(colours.length);

        while (colours[rand].equals(colour1) || colours[rand].equals(colour2)) {

            rand = new Random().nextInt(colours.length);

        }

        return colours[rand];

    }

    /**
     * Pick a random colour different from three input colours
     *
     * @param colour1 input colour 1
     * @param colour2 input colour 2
     * @param colour3 input colour 3
     * @return random colour different from the three input colours
     */
    public String generateRandomColour(String colour1, String colour2, String colour3) {

        String[] colours;
        int rand;

        colours = new String[]{"Black", "Blue", "Green", "Orange", "Pink", "Red", "White", "Yellow"};
        rand = new Random().nextInt(colours.length);

        while (colours[rand].equals(colour1) || colours[rand].equals(colour2) || colours[rand].equals(colour3)) {

            rand = new Random().nextInt(colours.length);

        }

        return colours[rand];

    }

    /**
     * Pick a random shape from a list of shapes
     *
     * @return random shape
     */
    public String generateRandomShape() {

        String[] shapes;
        int rand;

        shapes = new String[]{"Circle", "Rectangle", "Square", "Triangle"};
        rand = new Random().nextInt(shapes.length);

        return shapes[rand];

    }

}
