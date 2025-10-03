/*
 Name: Teddy Miller
 Block: B
 Program: PA11
Date: 11/1/2023 
 */


import java.util.*;
public class PA11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userinput=0;
        int numberofwinsa=0;
        int numberofwinsb=0;
        int playerainput=0;
        int playerbinput=0;
        while(numberofwinsa<2 && numberofwinsb<2){
            System.out.print("Player A: Rock (1), Paper (2), or Scissors (3)? ");
                playerainput=scan.nextInt();
            System.out.print("Player B: Rock (1), Paper (2), or Scissors (3)? ");
                playerbinput=scan.nextInt();
                if((playerainput==1 && playerbinput==1) || (playerainput ==2 && playerbinput==2) || (playerainput==3&&playerbinput==3)){
                    System.out.println("Tie!");
                }
                else if((playerainput==1 && playerbinput==3) || (playerainput==2 && playerbinput==1) || (playerainput==3 && playerbinput==2)){
                    System.out.println("Player A Wins!");
                        numberofwinsa++;
                }
                else if ((playerainput==1 && playerbinput==2) || (playerainput==2 && playerbinput==3) || (playerainput==3 && playerbinput==1)){
                    System.out.println("Player B Wins!");
                        numberofwinsb++;
                }
                else{
                    System.out.println("Invalid Input");
                }
                }
    if(numberofwinsa==2){
       System.out.println("Player A Wins 2 to " + numberofwinsb  );
   }
   else if(numberofwinsb==2){
       System.out.println("Player B Wins 2 to " + numberofwinsa);
   }

}
}
