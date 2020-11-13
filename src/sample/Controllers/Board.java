package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import sample.Player;


public class Board {
    Pieces A1 = new Pieces();
    Pieces A4 = new Pieces();
    Pieces A7 = new Pieces();
    Pieces B2 = new Pieces();
    Pieces B4 = new Pieces();
    Pieces B6 = new Pieces();
    Pieces C3 = new Pieces();
    Pieces C4 = new Pieces();
    Pieces C5 = new Pieces();
    Pieces D1 = new Pieces();
    Pieces D2 = new Pieces();Pieces G4 = new Pieces();
    Pieces D3 = new Pieces();
    Pieces D5 = new Pieces();
    Pieces D6 = new Pieces();
    Pieces D7 = new Pieces();
    Pieces E3 = new Pieces();
    Pieces E4 = new Pieces();
    Pieces E5 = new Pieces();Pieces G7 = new Pieces();
    Pieces F2 = new Pieces();
    Pieces F4 = new Pieces();
    Pieces F6 = new Pieces();
    Pieces G1 = new Pieces();









    int turn = 1000;// dummy variable for demonstration

    //@FXML
    public Circle a1, a4, a7,   //if "Circle" is red, it must be imported. Hover over it and you see a prompt to import.
            b2, b4, b6,
            c3, c4, c5,
            d1, d2, d3, d5, d6, d7,
            e3, e4, e5,
            f2, f4, f6,
            g1, g4, g7;


    /*public Pieces a1,a4,a7,   //if "Circle" is red, it must be imported. Hover over it and you see a prompt to import.
            b2,b4,b6,
            c3,c4,c5,
            d1,d2,d3,d5,d6,d7,
            e3,e4,e5,
            f2,f4,f6,
            g1,g4,g7= new Pieces ();

    Pieces [] layout = new Pieces[]{
            a1,a4,a7,   //if "Circle" is red, it must be imported. Hover over it and you see a prompt to import.
            b2,b4,b6,
            c3,c4,c5,
            d1,d2,d3,d5,d6,d7,
            e3,e4,e5,
            f2,f4,f6,
            g1,g4,g7
    };*/
    //int cooli = 5;
    //public void makerecord(){System.out.println(cooli);}
     boolean isFirstPlayer = true;

      void decrease(Player num){
         num.startingPieces = num.startingPieces -1 ;
    }

    Player Player1 = new Player();
    Player Player2 = new Player();
    public void onClickEvent(MouseEvent mouseEvent) {


        A1.id="a1";
        A1.mill1= new Pieces[]{A1, A4, A7};
        A1.mill2= new Pieces[]{A1,D1,G1};
        A1.adjacent= new Pieces[]{D1,A4};

        A4.id="a4";
        A4.mill1= new Pieces[]{A1,A4,A7};
        A4.mill2= new Pieces[]{A4,B2,C3};
        A4.adjacent= new Pieces[]{A1,A7,B2};

        A7.id="a7";
        A7.mill1= new Pieces[]{A1,A4,A7};
        A7.mill2= new Pieces[]{A7,D6,G7};
        A7.adjacent= new Pieces[]{A4,D6,B2};

        B2.id="b2";
        B2.mill1= new Pieces[]{B2,B4,B6};
        B2.mill2= new Pieces[]{B2,D2,F2};
        B2.adjacent= new Pieces[]{B4,D2};

        B4.id="b4";
        B4.mill1= new Pieces[]{B2,B4,B6};
        B4.mill2= new Pieces[]{A4,B4,C4};
        B4.adjacent= new Pieces[]{B2,B6,A4,C4};

        B6.id="b6";
        B6.mill1= new Pieces[]{B2,B4,B6};
        B6.mill2= new Pieces[]{B6,B6,F6};
        B6.adjacent= new Pieces[]{B4,D6};

        C3.id="c3";
        C3.mill1= new Pieces[]{C3,C4,C5};
        C3.mill2= new Pieces[]{C3,D3,E3};
        C3.adjacent= new Pieces[]{D3,C4};

        C4.id="c4";
        C4.mill1= new Pieces[]{C3,C4,C5};
        C4.mill2= new Pieces[]{C4,B4,A4};
        C4.adjacent= new Pieces[]{C3,C5,B4};

        C5.id="c5";
        C5.mill1= new Pieces[]{C3,C4,C5};
        C5.mill2= new Pieces[]{C5,D5,E5};
        C5.adjacent= new Pieces[]{C4,D5};

        D1.id="d1";
        D1.mill1= new Pieces[]{A1,A1,G1};
        D1.mill2= new Pieces[]{D1,D2,D3};
        D1.adjacent= new Pieces[]{A1,G1,D2};

        D2.id="d2";
        D2.mill1= new Pieces[]{D2,B2,F2};
        D2.mill2= new Pieces[]{D1,D2,D3};
        D2.adjacent= new Pieces[]{D1,B2,D3,F2};

        D3.id="d3";
        D3.mill1= new Pieces[]{C3,D3,E3};
        D3.mill2= new Pieces[]{D1,D2,D3};
        D3.adjacent= new Pieces[]{D2,C3,E3};

        D5.id="d5";
        D5.mill1= new Pieces[]{D5,D6,D7};
        D5.mill2= new Pieces[]{C5,D5,E5};
        D5.adjacent= new Pieces[]{C5,E5,D6};

        D6.id="d6";
        D6.mill1= new Pieces[]{D5,D6,D7};
        D6.mill2= new Pieces[]{B6,D6,F6};
        D6.adjacent= new Pieces[]{D5,B6,D7,F6};

        D7.id="d7";
        D7.mill1= new Pieces[]{D5,D6,D7};
        D7.mill2= new Pieces[]{A7,D7,G7};
        D7.adjacent= new Pieces[]{A7,D6,G7};

        E3.id="e3";
        E3.mill1= new Pieces[]{C3,D3,E3};
        E3.mill2= new Pieces[]{E3,E4,E5};
        E3.adjacent= new Pieces[]{D3,E4};

        E4.id="e4";
        E4.mill1= new Pieces[]{E4,F4,G4};
        E4.mill2= new Pieces[]{E3,E4,E5};
        E4.adjacent= new Pieces[]{E3,E5,F4};

        E5.id="e5";
        E5.mill1= new Pieces[]{C5,D5,E5};
        E5.mill2= new Pieces[]{E3,E4,E5};
        E5.adjacent= new Pieces[]{E4,D5};

        F2.id="f2";
        F2.mill1= new Pieces[]{B2,D2,F2};
        F2.mill2= new Pieces[]{F2,F4,F6};
        F2.adjacent= new Pieces[]{D2,F4};

        F4.id="f4";
        F4.mill1= new Pieces[]{E4,F4,F6};
        F4.mill2= new Pieces[]{F2,F4,F6};
        F4.adjacent= new Pieces[]{F2,E4,F6,G4};

        F6.id="f6";
        F6.mill1= new Pieces[]{B6,D6,F6};
        F6.mill2= new Pieces[]{F2,F4,F6};
        F6.adjacent= new Pieces[]{F4,D6};

        G1.id="g1";
        G1.mill1= new Pieces[]{A1,D1,G1};
        G1.mill2= new Pieces[]{G1,G4,G7};
        G1.adjacent= new Pieces[]{D1,G4};

        G4.id="g4";
        G4.mill1= new Pieces[]{E4,F4,G4};
        G4.mill2= new Pieces[]{G1,G4,G7};
        G4.adjacent= new Pieces[]{G1,F4,G7};

        G7.id="g7";
        G7.mill1= new Pieces[]{A7,D7,G7};
        G7.mill2= new Pieces[]{G1,G4,G7};
        G7.adjacent= new Pieces[]{G4,D7};

        Pieces [] boardlayout = new Pieces[]{
                A1,A4,A7,
                B2,B4,B6,
                C3,C4,C5,
                D1,D2,D3,D5,D6,D7,   //This is an array of type circle that holds each board position.
                E3,E4,E5,
                F2,F4,F6,
                G1,G4,G7
        };


        //System.out.println(a1.getId());  // This prints out the id of whatever object passed.
        //System.out.println(mouseEvent.getPickResult().getIntersectedNode().getId()); //This gets the id of whatever is clicked.
        Circle clickedCircle = (Circle) mouseEvent.getTarget();
        String circleLabel = clickedCircle.getId();
       // System.out.println(circleLabel);
        //System.out.println(clickedCircle);
        int count = 0;
        if(Player1.startingPieces+Player2.startingPieces !=0) {
            for (int i = 0; i < boardlayout.length; i++) {
                //System.out.print()
                // String cool = mouseEvent.getPickResult().getIntersectedNode().getId();
                //System.out.println(cool + " hahahahahahahahah");
                // System.out.println(A1.id);

                if ((boardlayout[i].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())) && (boardlayout[i].taken == false)) { // If array index = id of circle clicked
                    if (isFirstPlayer == true) {

                        clickedCircle.setFill(Paint.valueOf("RED"));
                        //turn--;
                        boardlayout[i].taken = true;
                        Player1.startingPieces --;
                        System.out.println(Player1.startingPieces);
                        isFirstPlayer = false;
                        break;
                    } else if (isFirstPlayer == false) {
                        boardlayout[i].taken = true;

                        clickedCircle.setFill(Paint.valueOf("BLUE"));///
                        Player2.startingPieces--;
                        System.out.println(Player2.startingPieces);
                        isFirstPlayer = true;///
                        //turn--;

                        break;
                    }
                    // }
                }
            }
        }
        //if("".equals(circleLabel) && isFirstPlayer){
        //    clickedCircle.setFill(Paint.valueOf("RED"));
        //}

        //Circle [] layoutArray = new Circle[]{
        //        a1,a4,a7,
        //        b2,b4,b6,
        //        c3,c4,c5,
        //        d1,d2,d3,d5,d6,d7,   //This is an array of type circle that holds each board position.
        //       e3,e4,e5,
        //        f2,f4,f6,
        //        g1,g4,g7
        //};


    }
}
