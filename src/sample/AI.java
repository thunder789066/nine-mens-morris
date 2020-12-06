package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Map;

import sample.Controllers.Board;
import sample.Controllers.Pieces;

public class AI {
	private int difficulty;
	private String[] availablemoves;
	private String[] millmoves;
	private int nextToAddAvailabeMoves = 0;
	private int nextToAddMillMoves = 0;
	
	Random rand = new Random();	
	
	public void AI(int setDifficulty) {
		difficulty = setDifficulty;
		
	}
	public String millCheck(Board boardstate) {		
		return "test";
	}
	public String moveChosen(Board boardstate) {
		Pieces[] boardStatePieces;
		for (int i = 0; i < boardstate.boardlayout.length; i++) {
			if (boardstate.boardlayout[i].ownedByPlayer == 2) {
				for (int j = 0; j < boardstate.boardlayout[i].adjacent.length; j++) {
					if (boardstate.boardlayout[i].adjacent[j].taken == false) {
						boolean milltest = true;						
						for (Pieces x : boardstate.boardlayout[i].adjacent[j].mill1) {
							if (x.ownedByPlayer != 2) {
								milltest = false;
							}
						}
						if (milltest == true) {
							millmoves[nextToAddMillMoves] = boardstate.boardlayout[i].id + "," + boardstate.boardlayout[i].adjacent[j].id;
						}
						milltest = true;
						for (Pieces x : boardstate.boardlayout[i].adjacent[j].mill2) {
							if (x.ownedByPlayer != 2) {
								milltest = false;
							}
						}
						if (milltest == true) {
							millmoves[nextToAddMillMoves] = boardstate.boardlayout[i].id + "," + boardstate.boardlayout[i].adjacent[j].id;
						}
						availablemoves[nextToAddAvailabeMoves] = boardstate.boardlayout[i].id + "," + boardstate.boardlayout[i].adjacent[j].id;
					}
				}
			}
		}
		
		
		if (difficulty == 1) {
			if (millmoves != null) {
				return millmoves[rand.nextInt(millmoves.length)];
			}
			return availablemoves[rand.nextInt(availablemoves.length)];
		}
		return "test";		
	}
}
