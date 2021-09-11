package com.hacker.guesscolor.logic;

import com.hacker.guesscolor.bean.ColouredShape;
import com.hacker.guesscolor.dao.ColouredShapesData;

public class ShapesLogic {

    /**
     * Get a random shape with a random colour
     *
     * @return random coloured shape
     */
    public ColouredShape getRandomShape() {

        ColouredShapesData colouredShapesData=new ColouredShapesData();
        RandomGenerator randomGenerator=new RandomGenerator();

        return colouredShapesData.getColouredShape(randomGenerator.generateRandomShape(),randomGenerator.generateRandomColour());

    }

}
