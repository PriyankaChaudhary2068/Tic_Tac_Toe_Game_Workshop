package com.bridgelabz.ticTacToeGame;

import java.util.Scanner;

public class TicTacToeGame {
	   
             
              static char[] board = new char[10];
              static char player;
              static char computer;
              public static Scanner scanner = new Scanner(System.in);
          	
              
              public static void createBoard()
              {
            	  for(int index = 0 ; index<10 ; index++) {
            		  board[index] = ' ';
            		  
               }
          }
	          
              public static void getPlayerChoice() {
         		 System.out.print("select X or O : ");
         		 player = Character.toUpperCase(scanner.next().charAt(0));
         		 
         		 if (player == 'X')
         			 computer='O';
         		 else
         			 computer ='X';
         		 
         		 System.out.println("You Have Selected : " +player);
         		 System.out.println("Computer's Choice Is : " +computer);
         	}
              
              public static void showBoard() {
          		System.out.println();
          		System.out.println("  " + board[1] + "  |  " + board[2] + "   | " + board[3] + "  ");
          		System.out.println("------------------");
          		System.out.println("  " + board[4] + "  |  " + board[5] + "   | " + board[6] + "  ");
          		System.out.println("------------------");
          		System.out.println("  " + board[7] + "  |  " + board[8] + "   | " + board[9] + "  ");
          	}
              
              
              public static void main(String[] args) {
		
            	  System.out.println("Welcome To The Game Of Tic Tac Toe \n  ");
            	  createBoard();
            	  getPlayerChoice();
            	  showBoard();
          }

}
