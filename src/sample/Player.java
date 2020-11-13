package sample;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import sample.Controllers.Pieces;

import java.awt.*;
import java.util.Scanner;


public class Player {
    public String name;

    public  int startingPieces = 9;
    public  int gamePieces = 9;
    public String selection;

    public Pieces a1,a4,a7,
            b2,b4,b6,
            c3,c4,c5,
            d1,d2,d3,d5,d6,d7,
            e3,e4,e5,
            f2,f4,f6,
            g1,g4,g7= new Pieces ();

   /* public void setstuff(){
        a1.id="a1";
        a1.mill1= new Pieces[]{a1,a4,a7};
        a1.mill2= new Pieces[]{a1,d1,g1};
        a1.adjacent= new Pieces[]{d1,a4};

        a4.id="a4";
        a4.mill1= new Pieces[]{a1,a4,a7};
        a4.mill2= new Pieces[]{a4,b2,c3};
        a4.adjacent= new Pieces[]{a1,a7,b2};

        a7.id="a7";
        a7.mill1= new Pieces[]{a1,a4,a7};
        a7.mill2= new Pieces[]{a7,d6,g7};
        a7.adjacent= new Pieces[]{a4,d6,b2};

        b2.id="b2";
        b2.mill1= new Pieces[]{b2,b4,b6};
        b2.mill2= new Pieces[]{b2,d2,f2};
        b2.adjacent= new Pieces[]{b4,d2};

        b4.id="b4";
        b4.mill1= new Pieces[]{b2,b4,b6};
        b4.mill2= new Pieces[]{a4,b4,c4};
        b4.adjacent= new Pieces[]{b2,b6,a4,c4};

        b6.id="b6";
        b6.mill1= new Pieces[]{b2,b4,b6};
        b6.mill2= new Pieces[]{b6,d6,f6};
        b6.adjacent= new Pieces[]{b4,d6};

        c3.id="c3";
        c3.mill1= new Pieces[]{c3,c4,c5};
        c3.mill2= new Pieces[]{c3,d3,e3};
        c3.adjacent= new Pieces[]{d3,c4};

        c4.id="c4";
        c4.mill1= new Pieces[]{c3,c4,c5};
        c4.mill2= new Pieces[]{c4,b4,a4};
        c4.adjacent= new Pieces[]{c3,c5,b4};

        c5.id="c5";
        c5.mill1= new Pieces[]{c3,c4,c5};
        c5.mill2= new Pieces[]{c5,d5,e5};
        c5.adjacent= new Pieces[]{c4,d5};

        d1.id="d1";
        d1.mill1= new Pieces[]{a1,d1,g1};
        d1.mill2= new Pieces[]{d1,d2,d3};
        d1.adjacent= new Pieces[]{a1,g1,d2};

        d2.id="d2";
        d2.mill1= new Pieces[]{d2,b2,f2};
        d2.mill2= new Pieces[]{d1,d2,d3};
        d2.adjacent= new Pieces[]{d1,b2,d3,f2};

        d3.id="d3";
        d3.mill1= new Pieces[]{c3,d3,e3};
        d3.mill2= new Pieces[]{d1,d2,d3};
        d3.adjacent= new Pieces[]{d2,c3,e3};

        d5.id="d5";
        d5.mill1= new Pieces[]{d5,d6,d7};
        d5.mill2= new Pieces[]{c5,d5,e5};
        d5.adjacent= new Pieces[]{c5,e5,d6};

        d6.id="d6";
        d6.mill1= new Pieces[]{d5,d6,d7};
        d6.mill2= new Pieces[]{b6,d6,f6};
        d6.adjacent= new Pieces[]{d5,b6,d7,f6};

        d7.id="d7";
        d7.mill1= new Pieces[]{d5,d6,d7};
        d7.mill2= new Pieces[]{a7,d7,g7};
        d7.adjacent= new Pieces[]{a7,d6,g7};

        e3.id="e3";
        e3.mill1= new Pieces[]{c3,d3,e3};
        e3.mill2= new Pieces[]{e3,e4,e5};
        e3.adjacent= new Pieces[]{d3,e4};

        e4.id="e4";
        e4.mill1= new Pieces[]{e4,f4,g4};
        e4.mill2= new Pieces[]{e3,e4,e5};
        e4.adjacent= new Pieces[]{e3,e5,f4};

        e5.id="e5";
        e5.mill1= new Pieces[]{c5,d5,e5};
        e5.mill2= new Pieces[]{e3,e4,e5};
        e5.adjacent= new Pieces[]{e4,d5};

        f2.id="f2";
        f2.mill1= new Pieces[]{b2,d2,f2};
        f2.mill2= new Pieces[]{f2,f4,f6};
        f2.adjacent= new Pieces[]{d2,f4};

        f4.id="f4";
        f4.mill1= new Pieces[]{e4,f4,f6};
        f4.mill2= new Pieces[]{f2,f4,f6};
        f4.adjacent= new Pieces[]{f2,e4,f6,g4};

        f6.id="f6";
        f6.mill1= new Pieces[]{b6,d6,f6};
        f6.mill2= new Pieces[]{f2,f4,f6};
        f6.adjacent= new Pieces[]{f4,d6};

        g1.id="g1";
        g1.mill1= new Pieces[]{a1,d1,g1};
        g1.mill2= new Pieces[]{g1,g4,g7};
        g1.adjacent= new Pieces[]{d1,g4};

        g4.id="g4";
        g4.mill1= new Pieces[]{e4,f4,g4};
        g4.mill2= new Pieces[]{g1,g4,g7};
        g4.adjacent= new Pieces[]{g1,f4,g7};

        g7.id="g7";
        g7.mill1= new Pieces[]{a7,d7,g7};
        g7.mill2= new Pieces[]{g1,g4,g7};
        g7.adjacent= new Pieces[]{g4,d7};

    }*/
}
