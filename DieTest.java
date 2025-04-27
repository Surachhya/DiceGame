//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 2
  //   Version 1.0

/**
 * The DieTest class is an application that simulates a dice game between the computer and the user.
 * It uses the Die class to roll dice for both the user and the computer, determines the winner of each round,
 * and declares the final grand winner based on the number of rounds won by each player.
 */
public class DieTest {
   /**
    * The main method of the DieTest class, which initiates and manages the dice game.
    * It creates two Die objects, one for the user and one for the computer, and then runs a loop for 10 rounds.
    * In each game, both dice are rolled, and the winner of the game is determined and displayed.
    * After 10 game, the final results are displayed, including the grand winner of the game.
    */
   public static void main(String[] args) {
      // Create dice objects for the user and computer
      Die userDie = new Die(6);
      Die computerDie = new Die(6);
   
      // Initialize variables to keep track of wins
      int userWins = 0;
      int computerWins = 0;
   
      // Loop for 10 rounds of the game
      for (int i = 1; i <= 10; i++) {
         // Roll dice for both the user and computer
         userDie.roll();
         computerDie.roll();
      
         // Display game number and dice values
         System.out.println("\nGame " + i);
         System.out.println("Computer.... " + computerDie.getValue());
         System.out.println("User........ " + userDie.getValue());
      
         // Determine the winner of the game and update win counts
         if (userDie.getValue() > computerDie.getValue()) {
            System.out.println("The user is the grand winner of this round!");
            userWins++;
         } else if (userDie.getValue() < computerDie.getValue()) {
            System.out.println("The computer is the grand winner of this round!");
            computerWins++;
         } else {
            System.out.println("The game has ended in a tie for this round!");
         }
      }
   
      // Display final results of the game
      displayFinalResult(computerWins, userWins);

   }
   
   public static void displayFinalResult(int computerWins, int userWins)
   {
      System.out.println("\n===========**********============\n");
      System.out.println("Final Results:");
      System.out.println("Computer score: " + computerWins);
      System.out.println("User wins: " + userWins);
   
      // Determine and display the final grand winner of the game
      if (userWins > computerWins) {
         System.out.println("User is the final grand winner!");
      } else if (userWins < computerWins) {
         System.out.println("Computer is the final grand winner!");
      } else {
         System.out.println("The final game has ended in a tie! No grand winner in the final.");
      }
   
   }
}
