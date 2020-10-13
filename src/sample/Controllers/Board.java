package sample.Controllers;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;



public class Board {
    int turn = 1000;// dummy variable for demonstration
    public Circle a1,a4,a7,   //if "Circle" is red, it must be imported. Hover over it and you see a prompt to import.
                b2,b4,b6,
                c3,c4,c5,
                d1,d2,d3,d5,d6,d7,
                e3,e4,e5,
                f2,f4,f6,
                g1,g4,g7 = null ;


    public void onClickEvent(MouseEvent mouseEvent) {
        //System.out.println(a1.getId());  // This prints out the id of whatever object passed.
        //System.out.println(mouseEvent.getPickResult().getIntersectedNode().getId()); //This gets the id of whatever is clicked.
        Circle [] layoutArray = new Circle[]{
                a1,a4,a7,
                b2,b4,b6,
                c3,c4,c5,
                d1,d2,d3,d5,d6,d7,   //This is an array of type circle that holds each board position.
                e3,e4,e5,
                f2,f4,f6,
                g1,g4,g7
        };

        for(int i=0;i<=layoutArray.length;i++){

            if (layoutArray[i].getId() == mouseEvent.getPickResult().getIntersectedNode().getId()){ // If array index = id of circle clicked
                if(turn% 2 == 0) {                            ///
                    layoutArray[i].setFill(Paint.valueOf("RED"));   ///
                    turn --;                                  ///
                }                                                  ///   **Just to demonstrate different colors.
                else{                                              ///     REAL LOGIC NEEDS TO BE IMPLEMENTED** LOL
                    layoutArray[i].setFill(Paint.valueOf("BLUE"));///
                    turn --;                                  ///
                }

            }
        }

    }
}
