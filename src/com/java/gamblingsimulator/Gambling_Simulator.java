package com.java.gamblingsimulator;

import java.util.Random;

public class Gambling_Simulator {
	 public static final  int initialStake = 100;
	 public static final int stakeBet = 1;
	 static Random random = new Random();   

	    public static void main(String[] args)
	    {
	    	int totalStake = initialStake;
	    	System.out.println("Welcome to Gambling Game Simulator program");
	    	int play = random.nextInt(2);
	    	switch(play)
	    	{
	    	case 0:
	    		  totalStake = totalStake - stakeBet;
	    		  System.out.println("Stake after losing: "+totalStake);
	    		  break;
	    	case 1:
	    		 totalStake = totalStake + stakeBet;
	    		  System.out.println("Stake after winning: "+totalStake);
	    		  break;
	    	}
	    	
	    }
}
