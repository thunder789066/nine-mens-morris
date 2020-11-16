package sample.Controllers;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import sample.Player;


public class Board {
    public boolean deleteMill = false;
    //(deleteMill) if this is true the "if(deleteMill)" will run below

    public boolean p1;
    public boolean p2;

    public boolean flySwitch;
    public boolean phase1 = true;
    public boolean phase2 = true;
    public boolean phase3 = false;
    public boolean finalStage = false;
    public boolean key =true;
    public boolean flyUnlock;

    public boolean flyPieces = false;

    public boolean canSwitch = false;
    //(canSwitch) enable switching for flight

    public boolean backToPlayer = false;
    //(backToPlayer) this goes back to the player if theyform a mill so they can delete

    public boolean isFirstPlayer = true;
    //(isFirstPlayer) if true it is the first players turn if not true, then it is the Second Players Turn.

    public boolean skipToNextPlayer = false;
    //(isFirstPlayer) if true it is the first players turn if not true, then it is the Second Players Turn.

    public boolean switchMill = false;
    //(switchMill) when true this will go to the switchMill Conditional to work

    public int ownedByPlayer;
    //  (ownedByPlayer) = (1) if owned by Player 1 (2) if owned by Player 2


    Player Player1 = new Player();
    Player Player2 = new Player();
    // *** Player Initializations *** [Check Player Class for more info dude!]


    //***********************Allocating Space for all pieces*******************
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
    Pieces D2 = new Pieces();
    Pieces G4 = new Pieces();
    Pieces D3 = new Pieces();
    Pieces D5 = new Pieces();
    Pieces D6 = new Pieces();
    Pieces D7 = new Pieces();
    Pieces E3 = new Pieces();
    Pieces E4 = new Pieces();
    Pieces E5 = new Pieces();
    Pieces G7 = new Pieces();
    Pieces F2 = new Pieces();
    Pieces F4 = new Pieces();
    Pieces F6 = new Pieces();
    Pieces G1 = new Pieces();
    Pieces SWITCH = new Pieces();
    //***********************Done Allocating :) *******************

    //@FXML
    public Circle a1, a4, a7,
            b2, b4, b6,
            c3, c4, c5,
            d1, d2, d3, d5, d6, d7,
            e3, e4, e5,
            f2, f4, f6,
            g1, g4, g7;
    // Circle is used to interact with the Circles on the Gui


    ////// This here is the core of the program
    public void onClickEvent(MouseEvent mouseEvent) {



        //******** Initializing all of the Pieces**************************
        A1.id = "a1";
        A1.mill1 = new Pieces[]{A1, A4, A7};
        A1.mill2 = new Pieces[]{A1, D1, G1};
        A1.adjacent = new Pieces[]{D1, A4};

        A4.id = "a4";
        A4.mill1 = new Pieces[]{A1, A4, A7};
        A4.mill2 = new Pieces[]{A4, B2, C3};
        A4.adjacent = new Pieces[]{A1, A7, B4};

        A7.id = "a7";
        A7.mill1 = new Pieces[]{A1, A4, A7};
        A7.mill2 = new Pieces[]{A7, D6, G7};
        A7.adjacent = new Pieces[]{A4, D7};

        B2.id = "b2";
        B2.mill1 = new Pieces[]{B2, B4, B6};
        B2.mill2 = new Pieces[]{B2, D2, F2};
        B2.adjacent = new Pieces[]{B4, D2};

        B4.id = "b4";
        B4.mill1 = new Pieces[]{B2, B4, B6};
        B4.mill2 = new Pieces[]{A4, B4, C4};
        B4.adjacent = new Pieces[]{B2, B6, A4, C4};

        B6.id = "b6";
        B6.mill1 = new Pieces[]{B2, B4, B6};
        B6.mill2 = new Pieces[]{B6, D6, F6};
        B6.adjacent = new Pieces[]{B4, D6};

        C3.id = "c3";
        C3.mill1 = new Pieces[]{C3, C4, C5};
        C3.mill2 = new Pieces[]{C3, D3, E3};
        C3.adjacent = new Pieces[]{D3, C4};

        C4.id = "c4";
        C4.mill1 = new Pieces[]{C3, C4, C5};
        C4.mill2 = new Pieces[]{C4, B4, A4};
        C4.adjacent = new Pieces[]{C3, C5, B4};

        C5.id = "c5";
        C5.mill1 = new Pieces[]{C3, C4, C5};
        C5.mill2 = new Pieces[]{C5, D5, E5};
        C5.adjacent = new Pieces[]{C4, D5};

        D1.id = "d1";
        D1.mill1 = new Pieces[]{A1, D1, G1};
        D1.mill2 = new Pieces[]{D1, D2, D3};
        D1.adjacent = new Pieces[]{A1, G1, D2};

        D2.id = "d2";
        D2.mill1 = new Pieces[]{D2, B2, F2};
        D2.mill2 = new Pieces[]{D1, D2, D3};
        D2.adjacent = new Pieces[]{D1, B2, D3, F2};

        D3.id = "d3";
        D3.mill1 = new Pieces[]{C3, D3, E3};
        D3.mill2 = new Pieces[]{D1, D2, D3};
        D3.adjacent = new Pieces[]{D2, C3, E3};

        D5.id = "d5";
        D5.mill1 = new Pieces[]{D5, D6, D7};
        D5.mill2 = new Pieces[]{C5, D5, E5};
        D5.adjacent = new Pieces[]{C5, E5, D6};

        D6.id = "d6";
        D6.mill1 = new Pieces[]{D5, D6, D7};
        D6.mill2 = new Pieces[]{B6, D6, F6};
        D6.adjacent = new Pieces[]{D5, B6, D7, F6};

        D7.id = "d7";
        D7.mill1 = new Pieces[]{D5, D6, D7};
        D7.mill2 = new Pieces[]{A7, D7, G7};
        D7.adjacent = new Pieces[]{A7, D6, G7};

        E3.id = "e3";
        E3.mill1 = new Pieces[]{C3, D3, E3};
        E3.mill2 = new Pieces[]{E3, E4, E5};
        E3.adjacent = new Pieces[]{D3, E4};

        E4.id = "e4";
        E4.mill1 = new Pieces[]{E4, F4, G4};
        E4.mill2 = new Pieces[]{E3, E4, E5};
        E4.adjacent = new Pieces[]{E3, E5, F4};

        E5.id = "e5";
        E5.mill1 = new Pieces[]{C5, D5, E5};
        E5.mill2 = new Pieces[]{E3, E4, E5};
        E5.adjacent = new Pieces[]{E4, D5};

        F2.id = "f2";
        F2.mill1 = new Pieces[]{B2, D2, F2};
        F2.mill2 = new Pieces[]{F2, F4, F6};
        F2.adjacent = new Pieces[]{D2, F4};

        F4.id = "f4";
        F4.mill1 = new Pieces[]{E4, F4, G4};
        F4.mill2 = new Pieces[]{F2, F4, F6};
        F4.adjacent = new Pieces[]{F2, E4, F6, G4};

        F6.id = "f6";
        F6.mill1 = new Pieces[]{B6, D6, F6};
        F6.mill2 = new Pieces[]{F2, F4, F6};
        F6.adjacent = new Pieces[]{F4, D6};

        G1.id = "g1";
        G1.mill1 = new Pieces[]{A1, D1, G1};
        G1.mill2 = new Pieces[]{G1, G4, G7};
        G1.adjacent = new Pieces[]{D1, G4};

        G4.id = "g4";
        G4.mill1 = new Pieces[]{E4, F4, G4};
        G4.mill2 = new Pieces[]{G1, G4, G7};
        G4.adjacent = new Pieces[]{G1, F4, G7};

        G7.id = "g7";
        G7.mill1 = new Pieces[]{A7, D7, G7};
        G7.mill2 = new Pieces[]{G1, G4, G7};
        G7.adjacent = new Pieces[]{G4, D7};
        //******** Done Initializing all of the Pieces***************************

        Pieces[] boardlayout = new Pieces[]{
                A1, A4, A7,
                B2, B4, B6,
                C3, C4, C5,
                D1, D2, D3, D5, D6, D7,
                E3, E4, E5,
                F2, F4, F6,
                G1, G4, G7
        };

        Circle[] allCircles = new Circle[]{
                a1, a4, a7,
                b2, b4, b6,
                c3, c4, c5,
                d1, d2, d3, d5, d6, d7,
                e3, e4, e5,
                f2, f4, f6,
                g1, g4, g7
        };


        Circle clickedCircle = (Circle) mouseEvent.getTarget();
        String circleLabel = clickedCircle.getId();
        if (finalStage) {
            if ((Player1.gamePieces <= 3 || Player2.gamePieces <= 3) && key == true) {
                System.out.println("PIECES CAN FLY NOW BROOOOOO");
                phase2 = false;
                flyPieces = true;// This helps with phase 3
                switchMill = false;
                key = false;
            }
        }

        /****************************THIS IS ALL PHASE ONE ***************************
         * ***************************************************************************
         */


        if (phase1 && deleteMill == false) {
            for (int i = 0; i < boardlayout.length; i++) {

                if ((boardlayout[i].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())) && (boardlayout[i].taken == false)) { // If array index = id of circle clicked
                    if (isFirstPlayer == true) {
                        clickedCircle.setFill(Paint.valueOf("RED"));
                        boardlayout[i].taken = true;
                        boardlayout[i].ownedByPlayer = 1;
                        boardlayout[i].playerNumber = 1;
                        Player1.startingPieces--;
                        System.out.println("PLAYER 1 HAS "+ Player1.startingPieces+" PIECES LEFT"); // just to check initial count

                        //*************IF THERE IS A MILL *******************************
                        if ((boardlayout[i].mill1[0].taken == true) && (boardlayout[i].mill1[0].playerNumber == 1)){
                            if ((boardlayout[i].mill1[1].taken == true) && (boardlayout[i].mill1[1].playerNumber == 1)){
                                if ((boardlayout[i].mill1[2].taken == true) && (boardlayout[i].mill1[2].playerNumber == 1)){
                                    boardlayout[i].mill1[0].isInMIll = true;
                                    boardlayout[i].mill1[1].isInMIll = true;
                                    boardlayout[i].mill1[2].isInMIll = true;
                                    deleteMill = true;
                                    backToPlayer = true;
                                    System.out.println("DESTROY MILL 1");

                                }
                            }
                        }
                        //****************************************************************
                        //*************IF THERE IS A MILL2 *******************************
                        if ((boardlayout[i].mill2[0].taken == true) && (boardlayout[i].mill2[0].playerNumber == 1)){
                            if ((boardlayout[i].mill2[1].taken == true) && (boardlayout[i].mill2[1].playerNumber == 1)){
                                if ((boardlayout[i].mill2[2].taken == true) && (boardlayout[i].mill2[2].playerNumber == 1)){
                                    boardlayout[i].mill2[0].isInMIll = true;
                                    boardlayout[i].mill2[1].isInMIll = true;
                                    boardlayout[i].mill2[2].isInMIll = true;
                                    deleteMill = true;
                                    System.out.println("DESTROY MILL 2");

                                }
                            }
                        }
                        isFirstPlayer = false;
                        break;
                    }
                    if (isFirstPlayer == false) { // PLAYER 2 TURN
                        clickedCircle.setFill(Paint.valueOf("BLUE"));///
                        boardlayout[i].taken = true;
                        boardlayout[i].ownedByPlayer = 2;
                        boardlayout[i].playerNumber = 2;
                        Player2.startingPieces--;
                        System.out.println("PLAYER TWO HAS : "+Player2.startingPieces+" PIECES LEFT TO PLACE");

                        //*************IF THERE IS A MILL *******************************
                        if ((boardlayout[i].mill1[0].taken == true) && (boardlayout[i].mill1[0].playerNumber == 2)){
                            if ((boardlayout[i].mill1[1].taken == true) && (boardlayout[i].mill1[1].playerNumber == 2)){
                                if ((boardlayout[i].mill1[2].taken == true) && (boardlayout[i].mill1[2].playerNumber == 2)){
                                    boardlayout[i].mill1[0].isInMIll = true;
                                    boardlayout[i].mill1[1].isInMIll = true;
                                    boardlayout[i].mill1[2].isInMIll = true;
                                    deleteMill = true;
                                    System.out.println("DESTROY MILL 1");

                                }
                            }
                        }
                        //****************************************************************
                        //*************IF THERE IS A MILL2 *******************************
                        if ((boardlayout[i].mill2[0].taken == true) && (boardlayout[i].mill2[0].playerNumber == 2)){
                            if ((boardlayout[i].mill2[1].taken == true) && (boardlayout[i].mill2[1].playerNumber == 2)){
                                if ((boardlayout[i].mill2[2].taken == true) && (boardlayout[i].mill2[2].playerNumber == 2)){
                                    boardlayout[i].mill2[0].isInMIll = true;
                                    boardlayout[i].mill2[1].isInMIll = true;
                                    boardlayout[i].mill2[2].isInMIll = true;
                                    deleteMill = true;
                                    System.out.println("DESTROY MILL 2");

                                }
                            }
                        }
                        isFirstPlayer = true;///
                        break;
                    }
                }
            }
            if (Player1.startingPieces + Player2.startingPieces == 0){
                phase1 = false;
                canSwitch = true;
            }
        }

        /****************************THIS IS ALL PHASE TWO ***************************
         * ***************************************************************************
         */
        if (phase2) {
            if (canSwitch) {   // if we are able to switch pieces
                if ((Player1.startingPieces + Player2.startingPieces <= 2) && deleteMill == false) {   // If we are past phase1 and not in deleteMill mode
                    for (int i = 0; i < boardlayout.length; i++) {
                        if (((boardlayout[i].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())) && (boardlayout[i].taken == true))) {
                            for (int j = 0; j < boardlayout[i].adjacent.length; j++) {

                                if (boardlayout[i].adjacent[j].taken == false) {
                                    SWITCH.ownedByPlayer = boardlayout[i].ownedByPlayer;
                                    System.out.println("OWNED BY " + SWITCH.ownedByPlayer);
                                    SWITCH.playerNumber = boardlayout[i].playerNumber;
                                    System.out.println("PLAYER NUM " + SWITCH.ownedByPlayer);      //If the peice we selected  has an adjacent space, copy contents
                                    SWITCH.adjacent = boardlayout[i].adjacent;
                                    //System.out.println(SWITCH.adjacent);
                                    SWITCH.id = boardlayout[i].id;
                                    System.out.println("THE ID IS " + SWITCH.id);
                                    System.out.println("**********************************************************");
                                    for(int k = 0; k < boardlayout[i].adjacent.length;k++){
                                        boardlayout[i].adjacent[k].isInMIll = false;
                                    }
                                    boardlayout[i].taken = false;
                                    boardlayout[i].isInMIll=false;
                                    clickedCircle.setFill(Paint.valueOf("WHITE"));
                                    boardlayout[i].ownedByPlayer = 0;
                                    boardlayout[i].playerNumber = 0;
                                    canSwitch = false;
                                    switchMill = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(switchMill == true && deleteMill == false) {
            //System.out.println("SWITCHMILL STILL HIT BRODIE");
            for (int i = 0; i < SWITCH.adjacent.length; i++) {
                if ((SWITCH.adjacent[i].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())) && (SWITCH.adjacent[i].taken == false)) {
                    // if what is clicked id matches any of the adjacent ids and it isnt take


                    if(isFirstPlayer == true){
                        for (int j = 0; i < boardlayout.length;j++){
                            if(boardlayout[j].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())){
                                clickedCircle.setFill(Paint.valueOf("RED"));
                                boardlayout[j].taken = true;
                                boardlayout[j].ownedByPlayer = 1;
                                boardlayout[j].playerNumber = 1;

                                //*************IF THERE IS A MILL *******************************
                                if ((boardlayout[j].mill1[0].taken == true) && (boardlayout[j].mill1[0].playerNumber == 1)){
                                    if ((boardlayout[j].mill1[1].taken == true) && (boardlayout[j].mill1[1].playerNumber == 1)){
                                        if ((boardlayout[j].mill1[2].taken == true) && (boardlayout[j].mill1[2].playerNumber == 1)){
                                            boardlayout[j].mill1[0].isInMIll = true;
                                            boardlayout[j].mill1[1].isInMIll = true;
                                            boardlayout[j].mill1[2].isInMIll = true;
                                            deleteMill = true;
                                            backToPlayer = true;
                                            System.out.println("DESTROY MILL 1");

                                        }
                                    }
                                }
                                //****************************************************************
                                //*************IF THERE IS A MILL2 *******************************
                                if ((boardlayout[j].mill2[0].taken == true) && (boardlayout[j].mill2[0].playerNumber == 1)){
                                    if ((boardlayout[j].mill2[1].taken == true) && (boardlayout[j].mill2[1].playerNumber == 1)){
                                        if ((boardlayout[j].mill2[2].taken == true) && (boardlayout[j].mill2[2].playerNumber == 1)){
                                            boardlayout[j].mill2[0].isInMIll = true;
                                            boardlayout[j].mill2[1].isInMIll = true;
                                            boardlayout[j].mill2[2].isInMIll = true;
                                            deleteMill = true;
                                            System.out.println("DESTROY MILL 2");

                                        }
                                    }
                                }
                                canSwitch = true;
                                isFirstPlayer = false;
                                break;
                            }
                        }
                    }
                    else{
                        for (int j = 0; i < boardlayout.length;j++){
                            if(boardlayout[j].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())){
                                clickedCircle.setFill(Paint.valueOf("BLUE"));
                                boardlayout[j].taken = true;
                                boardlayout[j].ownedByPlayer = 2;
                                boardlayout[j].playerNumber = 2;

                                //*************IF THERE IS A MILL *******************************
                                if ((boardlayout[j].mill1[0].taken == true) && (boardlayout[j].mill1[0].playerNumber == 2)){
                                    if ((boardlayout[j].mill1[1].taken == true) && (boardlayout[j].mill1[1].playerNumber == 2)){
                                        if ((boardlayout[j].mill1[2].taken == true) && (boardlayout[j].mill1[2].playerNumber == 2)){
                                            boardlayout[j].mill1[0].isInMIll = true;
                                            boardlayout[j].mill1[1].isInMIll = true;
                                            boardlayout[j].mill1[2].isInMIll = true;
                                            ///INCORPERATE PIECE TO DELETE
                                            deleteMill = true;
                                            backToPlayer = true;
                                            System.out.println("DESTROY MILL 1");

                                        }
                                    }
                                }
                                //****************************************************************
                                //*************IF THERE IS A MILL2 *******************************
                                if ((boardlayout[j].mill2[0].taken == true) && (boardlayout[j].mill2[0].playerNumber == 2)){
                                    if ((boardlayout[j].mill2[1].taken == true) && (boardlayout[j].mill2[1].playerNumber == 2)){
                                        if ((boardlayout[j].mill2[2].taken == true) && (boardlayout[j].mill2[2].playerNumber == 2)){
                                            boardlayout[j].mill2[0].isInMIll = true;
                                            boardlayout[j].mill2[1].isInMIll = true;
                                            boardlayout[j].mill2[2].isInMIll = true;
                                            ///INCORPERATE PIECE TO DELETE
                                            deleteMill = true;
                                            // backToPlayer = true;
                                            System.out.println("DESTROY MILL 2");

                                        }
                                    }
                                }
                                canSwitch = true;
                                isFirstPlayer = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(phase3){
            if (p1){
                isFirstPlayer = true;}

            if (p2){isFirstPlayer = false;}
           // System.out.println("IT hit PHASE 3 (1)");
            for (int i = 0; i < boardlayout.length; i++) {
               // System.out.println("IT hit PHASE 3 (2)");
                if ((boardlayout[i].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())) && (boardlayout[i].taken == false)) { // If array index = id of circle clicked
                    if (isFirstPlayer == true) {
                        clickedCircle.setFill(Paint.valueOf("RED"));
                        boardlayout[i].taken = true;
                        boardlayout[i].ownedByPlayer = 1;
                        boardlayout[i].playerNumber = 1;

                        //*************IF THERE IS A MILL *******************************
                        if ((boardlayout[i].mill1[0].taken == true) && (boardlayout[i].mill1[0].playerNumber == 1)){
                            if ((boardlayout[i].mill1[1].taken == true) && (boardlayout[i].mill1[1].playerNumber == 1)){
                                if ((boardlayout[i].mill1[2].taken == true) && (boardlayout[i].mill1[2].playerNumber == 1)){
                                    boardlayout[i].mill1[0].isInMIll = true;
                                    boardlayout[i].mill1[1].isInMIll = true;
                                    boardlayout[i].mill1[2].isInMIll = true;
                                    ///INCORPERATE PIECE TO DELETE
                                    deleteMill = true;
                                    backToPlayer = true;
                                    phase3 = false; /////CHECK TO SEE IF WE NEED TO MAKE FLY PIECES FALSE
                                    flyUnlock = true;
                                    flyPieces = false;
                                    System.out.println("DESTROY MILL 1");


                                }
                            }
                        }
                        //****************************************************************
                        //*************IF THERE IS A MILL2 *******************************
                        if ((boardlayout[i].mill2[0].taken == true) && (boardlayout[i].mill2[0].playerNumber == 1)){
                            if ((boardlayout[i].mill2[1].taken == true) && (boardlayout[i].mill2[1].playerNumber == 1)){
                                if ((boardlayout[i].mill2[2].taken == true) && (boardlayout[i].mill2[2].playerNumber == 1)){
                                    boardlayout[i].mill2[0].isInMIll = true;
                                    boardlayout[i].mill2[1].isInMIll = true;
                                    boardlayout[i].mill2[2].isInMIll = true;
                                    ///INCORPERATE PIECE TO DELETE
                                    deleteMill = true;
                                    backToPlayer = true;
                                    phase3 = false; /////CHECK TO SEE IF WE NEED TO MAKE FLY PIECES FALSE
                                    flyUnlock = true;
                                    flyPieces = false;
                                    // backToPlayer = true;
                                    System.out.println("DESTROY MILL 2");

                                }
                            }
                        }

                        isFirstPlayer = false;
                        phase3 = false; /////CHECK TO SEE IF WE NEED TO MAKE FLY PIECES FALSE
                        flyUnlock = true;
                        break;
                    }
                    if (isFirstPlayer == false) { // PLAYER 2 TURN
                        clickedCircle.setFill(Paint.valueOf("BLUE"));///
                        boardlayout[i].taken = true;
                        boardlayout[i].ownedByPlayer = 2;
                        boardlayout[i].playerNumber = 2;


                        //*************IF THERE IS A MILL *******************************
                        if ((boardlayout[i].mill1[0].taken == true) && (boardlayout[i].mill1[0].playerNumber == 2)){
                            if ((boardlayout[i].mill1[1].taken == true) && (boardlayout[i].mill1[1].playerNumber == 2)){
                                if ((boardlayout[i].mill1[2].taken == true) && (boardlayout[i].mill1[2].playerNumber == 2)){
                                    boardlayout[i].mill1[0].isInMIll = true;
                                    boardlayout[i].mill1[1].isInMIll = true;
                                    boardlayout[i].mill1[2].isInMIll = true;
                                    ///INCORPERATE PIECE TO DELETE
                                    deleteMill = true;
                                    backToPlayer = true;
                                    phase3 = false; /////CHECK TO SEE IF WE NEED TO MAKE FLY PIECES FALSE
                                    flyUnlock = true;
                                    flyPieces = false;
                                    System.out.println("DESTROY MILL 1");

                                }
                            }
                        }
                        //****************************************************************
                        //*************IF THERE IS A MILL2 *******************************
                        if ((boardlayout[i].mill2[0].taken == true) && (boardlayout[i].mill2[0].playerNumber == 2)){
                            if ((boardlayout[i].mill2[1].taken == true) && (boardlayout[i].mill2[1].playerNumber == 2)){
                                if ((boardlayout[i].mill2[2].taken == true) && (boardlayout[i].mill2[2].playerNumber == 2)){
                                    boardlayout[i].mill2[0].isInMIll = true;
                                    boardlayout[i].mill2[1].isInMIll = true;
                                    boardlayout[i].mill2[2].isInMIll = true;
                                    ///INCORPERATE PIECE TO DELETE
                                    deleteMill = true;
                                    backToPlayer = true;
                                    phase3 = false; /////CHECK TO SEE IF WE NEED TO MAKE FLY PIECES FALSE
                                    flyUnlock = true;
                                    flyPieces = false;
                                    System.out.println("DESTROY MILL 2");

                                }
                            }
                        }
                        //checkMill1(boardlayout[i], 2);
                        //checkMill2(boardlayout[i], 2);
                        isFirstPlayer = true;///
                        backToPlayer = true;
                        phase3 = false; /////CHECK TO SEE IF WE NEED TO MAKE FLY PIECES FALSE
                        flyUnlock = true;
                        break;
                    }
                }
            }

        }

        if(flyPieces == true){
            for (int i = 0; i < boardlayout.length; i++) {
                if ((boardlayout[i].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())) && (boardlayout[i].taken == true)) {
                    if (isFirstPlayer == true) {
                       // System.out.println("Player 1 hit");
                        clickedCircle.setFill(Paint.valueOf("WHITE"));
                        boardlayout[i].taken = false;
                        boardlayout[i].ownedByPlayer = 0;
                        boardlayout[i].playerNumber = 0;
                        flyPieces = false;
                        flyUnlock = false;
                        phase3 = true;
                        p1=true;
                        p2=false;

                    }
                    if (isFirstPlayer == false) {
                        System.out.println("Player 2 hit");
                        clickedCircle.setFill(Paint.valueOf("WHITE"));
                        boardlayout[i].taken = false;
                        boardlayout[i].ownedByPlayer = 0;
                        boardlayout[i].playerNumber = 0;
                        flyPieces = false;
                        flyUnlock = false;
                        phase3 = true;
                        p2 = true;
                        p1 = false;

                    }
                }
            }
        }



        /****************************THIS IS WHAT DELETS MILLS ***************************
         * ***************************************************************************
         */

        if (deleteMill == true) {
            for (int i = 0; i < boardlayout.length; i++) {
                if (((boardlayout[i].id.equals(mouseEvent.getPickResult().getIntersectedNode().getId())) && (boardlayout[i].taken == true)) && boardlayout[i].isInMIll == false) {


                    boardlayout[i].taken = false;
                    boardlayout[i].playerNumber=0;
                    clickedCircle.setFill(Paint.valueOf("WHITE"));
                    boardlayout[i].isInMIll = false;
                    if (boardlayout[i].ownedByPlayer == 1) {
                        Player1.gamePieces--;
                        System.out.println("Player 1 has " + Player1.gamePieces +" Total Pieces left");
                        boardlayout[i].ownedByPlayer = 0;
                        boardlayout[i].isInMIll = false;
                        isFirstPlayer = true;
                        deleteMill = false;
                        if(deleteMill == false){
                            canSwitch = true;
                        }
                        if ((Player1.gamePieces <= 3 || Player2.gamePieces <= 3) ){
                            finalStage = true;
                        }
                        if (Player1.gamePieces <3){
                            for(int k =0; k<allCircles.length;k++)
                                allCircles[k].setFill(Paint.valueOf("BLUE"));
                            System.out.println("GAME OVER");
                        }
                        if (Player2.gamePieces <3){
                            for(int j =0; j<allCircles.length;j++)
                                allCircles[j].setFill(Paint.valueOf("RED"));
                            System.out.println("GAME OVER");
                        }
                        break;
                    }
                    if (boardlayout[i].ownedByPlayer == 2) {
                        Player2.gamePieces--;
                        System.out.println("Player 2 has " + Player2.gamePieces+ "Total Pieces Left");
                        boardlayout[i].ownedByPlayer = 0;
                        isFirstPlayer = false;
                        deleteMill = false;
                        if(deleteMill == false){
                            canSwitch = true;
                        }
                        if ((Player1.gamePieces <= 3 || Player2.gamePieces <= 3) ){
                            finalStage = true;
                        }
                        if (Player1.gamePieces <3){
                            for(int k =0; k<allCircles.length;k++)
                                allCircles[k].setFill(Paint.valueOf("BLUE"));
                            System.out.println("GAME OVER");
                        }
                        if (Player2.gamePieces <3){
                            for(int j =0; j<allCircles.length;j++)
                                allCircles[j].setFill(Paint.valueOf("RED"));
                            System.out.println("GAME OVER");
                        }
                        break;
                    }
                }
            }
        }


        if (flyUnlock == true){ //this unlocks flying
            flyPieces = true;
        }
    }
}
