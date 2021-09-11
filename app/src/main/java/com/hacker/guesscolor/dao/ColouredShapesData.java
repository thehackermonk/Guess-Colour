package com.hacker.guesscolor.dao;

import com.hacker.guesscolor.R;
import com.hacker.guesscolor.bean.ColouredShape;

import java.util.ArrayList;

public class ColouredShapesData {

    /**
     * To get a particular coloured shape
     *
     * @param shape shape of the object
     * @param colour colour of the object
     * @return coloured shape
     */
    public ColouredShape getColouredShape(String shape, String colour) {

        ArrayList<ColouredShape> colouredShapesList=getColouredShapes();

        for (ColouredShape colouredShape : colouredShapesList) {

            if (colouredShape.getColour().equals(colour) && colouredShape.getShape().equals(shape))
                return colouredShape;

        }

        return null;

    }

    /**
     * returns all the coloured shapes
     * each coloured shape contains the colour, shape and image
     *
     * @return the list of coloured shapes
     */
    public ArrayList<ColouredShape> getColouredShapes() {

        ArrayList<ColouredShape> colouredShapesList = new ArrayList<>();

        // Circle Black
        ColouredShape blackCircle = new ColouredShape();
        blackCircle.setColour("Black");
        blackCircle.setShape("Circle");
        blackCircle.setPath(R.drawable.circle_black);
        colouredShapesList.add(blackCircle);

        // Circle Blue
        ColouredShape blueCircle = new ColouredShape();
        blueCircle.setColour("Blue");
        blueCircle.setShape("Circle");
        blueCircle.setPath(R.drawable.circle_blue);
        colouredShapesList.add(blueCircle);

        // Circle Green
        ColouredShape greenCircle = new ColouredShape();
        greenCircle.setColour("Green");
        greenCircle.setShape("Circle");
        greenCircle.setPath(R.drawable.circle_green);
        colouredShapesList.add(greenCircle);

        // Circle Orange
        ColouredShape orangeCircle = new ColouredShape();
        orangeCircle.setColour("Orange");
        orangeCircle.setShape("Circle");
        orangeCircle.setPath(R.drawable.circle_orange);
        colouredShapesList.add(orangeCircle);

        // Circle Pink
        ColouredShape pinkCircle = new ColouredShape();
        pinkCircle.setColour("Pink");
        pinkCircle.setShape("Circle");
        pinkCircle.setPath(R.drawable.circle_pink);
        colouredShapesList.add(pinkCircle);

        // Circle Red
        ColouredShape redCircle = new ColouredShape();
        redCircle.setColour("Red");
        redCircle.setShape("Circle");
        redCircle.setPath(R.drawable.circle_red);
        colouredShapesList.add(redCircle);

        // Circle White
        ColouredShape whiteCircle = new ColouredShape();
        whiteCircle.setColour("White");
        whiteCircle.setShape("Circle");
        whiteCircle.setPath(R.drawable.circle_white);
        colouredShapesList.add(whiteCircle);

        // Circle Yellow
        ColouredShape yellowCircle = new ColouredShape();
        yellowCircle.setColour("Yellow");
        yellowCircle.setShape("Circle");
        yellowCircle.setPath(R.drawable.circle_yellow);
        colouredShapesList.add(yellowCircle);

        // Rectangle Black
        ColouredShape blackRectangle = new ColouredShape();
        blackRectangle.setColour("Black");
        blackRectangle.setShape("Rectangle");
        blackRectangle.setPath(R.drawable.rectangle_black);
        colouredShapesList.add(blackRectangle);

        // Rectangle Blue
        ColouredShape blueRectangle = new ColouredShape();
        blueRectangle.setColour("Blue");
        blueRectangle.setShape("Rectangle");
        blueRectangle.setPath(R.drawable.rectangle_blue);
        colouredShapesList.add(blackRectangle);

        // Rectangle Green
        ColouredShape greenRectangle = new ColouredShape();
        greenRectangle.setColour("Green");
        greenRectangle.setShape("Rectangle");
        greenRectangle.setPath(R.drawable.rectangle_green);
        colouredShapesList.add(greenRectangle);

        // Rectangle Orange
        ColouredShape orangeRectangle = new ColouredShape();
        orangeRectangle.setColour("Orange");
        orangeRectangle.setShape("Rectangle");
        orangeRectangle.setPath(R.drawable.circle_orange);
        colouredShapesList.add(orangeRectangle);

        // Rectangle Pink
        ColouredShape pinkRectangle = new ColouredShape();
        pinkRectangle.setColour("Pink");
        pinkRectangle.setShape("Rectangle");
        pinkRectangle.setPath(R.drawable.rectangle_pink);
        colouredShapesList.add(pinkRectangle);

        // Rectangle Red
        ColouredShape redRectangle = new ColouredShape();
        redRectangle.setColour("Red");
        redRectangle.setShape("Rectangle");
        redRectangle.setPath(R.drawable.rectangle_red);
        colouredShapesList.add(redRectangle);

        // Rectangle White
        ColouredShape whiteRectangle = new ColouredShape();
        whiteRectangle.setColour("White");
        whiteRectangle.setShape("Rectangle");
        whiteRectangle.setPath(R.drawable.rectangle_white);
        colouredShapesList.add(whiteRectangle);

        // Rectangle Yellow
        ColouredShape yellowRectangle = new ColouredShape();
        yellowRectangle.setColour("Yellow");
        yellowRectangle.setShape("Rectangle");
        yellowRectangle.setPath(R.drawable.rectangle_yellow);
        colouredShapesList.add(yellowRectangle);

        // Square Black
        ColouredShape blackSquare = new ColouredShape();
        blackSquare.setColour("Black");
        blackSquare.setShape("Square");
        blackSquare.setPath(R.drawable.square_black);
        colouredShapesList.add(blackSquare);

        // Square Blue
        ColouredShape blueSquare = new ColouredShape();
        blueSquare.setColour("Blue");
        blueSquare.setShape("Square");
        blueSquare.setPath(R.drawable.square_blue);
        colouredShapesList.add(blueSquare);

        // Square Green
        ColouredShape greenSquare = new ColouredShape();
        greenSquare.setColour("Green");
        greenSquare.setShape("Square");
        greenSquare.setPath(R.drawable.square_green);
        colouredShapesList.add(greenSquare);

        // Square Orange
        ColouredShape orangeSquare = new ColouredShape();
        orangeSquare.setColour("Orange");
        orangeSquare.setShape("Square");
        orangeSquare.setPath(R.drawable.square_orange);
        colouredShapesList.add(orangeSquare);

        // Square Pink
        ColouredShape pinkSquare = new ColouredShape();
        pinkSquare.setColour("Pink");
        pinkSquare.setShape("Square");
        pinkSquare.setPath(R.drawable.square_pink);
        colouredShapesList.add(pinkSquare);

        // Square Red
        ColouredShape redSquare = new ColouredShape();
        redSquare.setColour("Red");
        redSquare.setShape("Square");
        redSquare.setPath(R.drawable.square_red);
        colouredShapesList.add(redSquare);

        // Square White
        ColouredShape whiteSquare = new ColouredShape();
        whiteSquare.setColour("White");
        whiteSquare.setShape("Square");
        whiteSquare.setPath(R.drawable.square_white);
        colouredShapesList.add(whiteSquare);

        // Square Yellow
        ColouredShape yellowSquare = new ColouredShape();
        yellowSquare.setColour("Yellow");
        yellowSquare.setShape("Square");
        yellowSquare.setPath(R.drawable.square_yellow);
        colouredShapesList.add(yellowSquare);

        // Triangle Black
        ColouredShape blackTriangle = new ColouredShape();
        blackTriangle.setColour("Black");
        blackTriangle.setShape("Triangle");
        blackTriangle.setPath(R.drawable.triangle_black);
        colouredShapesList.add(blackTriangle);

        // Triangle Blue
        ColouredShape blueTriangle = new ColouredShape();
        blueTriangle.setColour("Blue");
        blueTriangle.setShape("Triangle");
        blueTriangle.setPath(R.drawable.triangle_blue);
        colouredShapesList.add(blueTriangle);

        // Triangle Green
        ColouredShape greenTriangle = new ColouredShape();
        greenTriangle.setColour("Green");
        greenTriangle.setShape("Triangle");
        greenTriangle.setPath(R.drawable.triangle_green);
        colouredShapesList.add(greenTriangle);

        // Triangle Orange
        ColouredShape orangeTriangle = new ColouredShape();
        orangeTriangle.setColour("Orange");
        orangeTriangle.setShape("Triangle");
        orangeTriangle.setPath(R.drawable.triangle_orange);
        colouredShapesList.add(orangeTriangle);

        // Triangle Pink
        ColouredShape pinkTriangle = new ColouredShape();
        pinkTriangle.setColour("Pink");
        pinkTriangle.setShape("Triangle");
        pinkTriangle.setPath(R.drawable.triangle_pink);
        colouredShapesList.add(pinkTriangle);

        // Triangle Red
        ColouredShape redTriangle = new ColouredShape();
        redTriangle.setColour("Red");
        redTriangle.setShape("Triangle");
        redTriangle.setPath(R.drawable.triangle_red);
        colouredShapesList.add(redTriangle);

        // Triangle White
        ColouredShape whiteTriangle = new ColouredShape();
        whiteTriangle.setColour("White");
        whiteTriangle.setShape("Triangle");
        whiteTriangle.setPath(R.drawable.triangle_white);
        colouredShapesList.add(whiteTriangle);

        // Triangle Yellow
        ColouredShape yellowTriangle = new ColouredShape();
        yellowTriangle.setColour("Yellow");
        yellowTriangle.setShape("Triangle");
        yellowTriangle.setPath(R.drawable.triangle_yellow);
        colouredShapesList.add(yellowTriangle);

        return colouredShapesList;

    }

}
