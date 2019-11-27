import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is a skeleton. Don't change the overall
 * structure but just uncomment and add code where needed.
 */
public class CommandLineLCR {



  public static void main(String[] args) {
    // Use this as an test area when starting out
    // I.e. instantiate objects and test
    // Later just comment out (don't erase the test code!)
    /*Die die = new Die();
    for (int i = 0; i < 10; i++){
      die.rollDie();
    }
    die.toString();

    testDie();
        System.out.println(Arrays.toString(lcr.getPlayers()));
    System.out.println(lcr.players[0].name);
    System.out.println(Arrays.toString(lcr.players[0].playerRoll(lcr.players[0].getChips())));
    testPlayer();*/
    LCRGame lcr = new LCRGame("Anna","Johan","Pernilla");
    System.out.println("Current player is " +lcr.players[0].name+" ("+lcr.players[0].chips+" chips)");
    System.out.println(Arrays.toString(lcr.players[0].playerRoll(lcr.players[0].getChips())));









    // TODO: Uncomment this when you are done
    // runCommandLineLCR();
  }

  // TODO: For each class you implement, add a method here to test it.
  // private static void testXXX() { ... }
  public static Die testDie(){
    Die die = new Die();
    die.rollDie();
    return die;
  }
  public static void testPlayer(){
    Die[] die = new Die[3];
    for (int i = 0; i < 3; i++){
      die[i]= new Die();
    }
    Player Glenn = new Player("Glenn",die, 3);
    System.out.println(Arrays.toString(Glenn.playerRoll(Glenn.getChips())));
  }



  // TODO: Uncomment below when possible
  public static void runCommandLineLCR() {

    // LCRGame lcr = buildLCRGame();
    System.out.println("LCR started");
    // render(lcr);

    Scanner s = new Scanner(System.in);

    boolean done = false;
    while (!done) {
      //System.out.println("Current player is " + ...);
      System.out.print("> ");
      String cmd = s.nextLine();
      switch (cmd) {
        case "r":
          // TODO: Play one player's turn and render the game's state
          break;
        case "q":
          done = true;
          break;
        default:
          System.out.println("Enter 'r' to continue or 'q' to quit");
      }
    }

    /* TODO
    if ( ... ) {
      // Game is finished
      System.out.println("Game over! Winner is " + lcr.getWinner());
    } else {
      // Game was aborted
      System.out.println("Game aborted");
      render(lcr);
    }*/
  }

  /*  TODO?
  private static LCRGame buildLCRGame() {
    LCRGame lcr = new LCRGame("Anna", "Pernilla", "Gunnar");
    return lcr;
  }
  */
  /* TODO

    private static void render(LCRGame lcr) {

    // This needs overridden toString method to work!
    for (Die d : lcr.getDice()) {
      System.out.print(d + "  ");
    }
    System.out.println();
    System.out.print("Players: ");
    for (Player p : lcr.getPlayers()) {
      System.out.print(p + " ");
    }
    System.out.println();
  }*/


}
