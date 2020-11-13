package sample.Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pieces {



    public String id ="";
    public int playerNumber=1;
    public boolean taken = false; // If this piece has been taken up or not yet
    public int ownedByPlayer =1 ; //If it is owned by player 1(1) if it is owned by player 2 (2)
    public Pieces adjacent [] ; //all adjacent pieces
    public Pieces mill1 []; // first mill combo
    public Pieces mill2 [];// second mill combo

    public Pieces() {
    }

    /*public Pieces a1,a4,a7,
            b2,b4,b6,
            c3,c4,c5,
            d1,d2,d3,d5,d6,d7,
            e3,e4,e5,
            f2,f4,f6,
            g1,g4,g7 ;*/

    HashMap<String, List<Pieces>> hashMap = new HashMap<String, List<Pieces>>();
    List<Pieces> millOne = new ArrayList<Pieces>();
    List<Pieces> millTwo = new ArrayList<Pieces>();
    List<Pieces> listTwo = new ArrayList<Pieces>();

    public void checkMill(Pieces spot,int num){
        int count = 0;
        for (int i =0;i<mill1.length;i++){
            if ((mill1[i].taken == true) && (playerNumber == num)){
                count ++;
            }
        }
        if(count == 3){
            System.out.println("DESTROY MILL");
        }
    }

    public void checkMill2(Pieces spot,int num){
        int count = 0;
        for (int i =0;i<mill1.length;i++){
            if ((mill1[i].taken == true) && (playerNumber == num)){
                count ++;
            }
        }
        if(count == 3){
            System.out.println("DESTROY MILL");
        }
    }
}
