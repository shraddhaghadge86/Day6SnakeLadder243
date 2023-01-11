package com.bridgelabz.day6snakeladder;

public class SnakeLadder {

    static public final int Starting_Position_Of_Player = 0;
    static public final int Ending_Position_Of_Player = 100;
    public static final  int ladder = 2;
    public static final int snake = 1;
    public static final int noPlay = 0;
    public static int roolldie(){
        int dieValue = (int)Math.floor(Math.random()*10)%6+1;
        return dieValue ;
    }
    public static void main(String[] args) {

        int roolldie = roolldie();
        int presentPlayerPosition = 0;

        while ( presentPlayerPosition <= Ending_Position_Of_Player){
            int currentPosition = 0;
            int checkPosition= (int)Math.floor(Math.random()*10)%3;
            switch (checkPosition){
                case snake:
                    currentPosition = roolldie-snake;
                    System.out.println("player is on snake " + currentPosition);
                    break;
                case  ladder:
                    currentPosition = ladder+roolldie;
                    System.out.println("player is on Ladder " + currentPosition);
                    break;
                default:
                    System.out.println("player is not play " );
            }

            presentPlayerPosition = presentPlayerPosition + currentPosition;
            System.out.println("Player" + presentPlayerPosition);
        }
    }
}

