package sample.Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pieces {



    public String id ="";
    public int playerNumber;
    public boolean taken = false; // If this piece has been taken up or not yet
    public int ownedByPlayer =1 ; //If it is owned by player 1(1) if it is owned by player 2 (2)
    public Pieces adjacent [] ; //all adjacent pieces
    public Pieces mill1 []; // first mill combo
    public Pieces mill2 [];// second mill combo
    public boolean isInMIll;

    // ** use bool for mill formed
    public Pieces() {
    }

    /*public Pieces a1       ,    a4,            a7,
                         b2 ,     b4,         b6,
                             c3,  c4,    c5,
                    d1,  d2,  d3,        d5,  d6,   d7,
                             e3,  e4,    e5,
                         f2,      f4,        f6,
                    g1,           g4,                g7 ;*/

}
