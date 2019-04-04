package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class CrossGame {
	public static void main(String[] args) {
		int e=0;
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
FunctionalUtil.board[i][j]="-";

          }

		}
		FunctionalUtil.printBoard();
			do
		{
			System.out.println("player1:player2");
			int i=FunctionalUtil.input();
			int j=FunctionalUtil.input();
			System.out.println(+i+":"+j);
		FunctionalUtil.placeMark(i,j);
	    	    	FunctionalUtil.printBoard();
	    	    	if (FunctionalUtil.checkForWin()) {
	    	    		   System.out.println("We have a winner! Congrats!");
	    	    		   System.exit(0);

	    	    		}
	    	    		else if (FunctionalUtil.isBoardFull()) {
	    	    		   System.out.println("Appears we have a draw!");
	    	    		   System.exit(0);
	    	    		}
	    	    	FunctionalUtil.changeplayer();
	    	    	e++;
	    	    	
	    	    }while(e<9);
		
	}
	
  	}


