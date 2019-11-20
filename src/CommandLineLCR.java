import java.util.Scanner;

/**
 * This class is a skeleton. Don't change the overall
 * structure but just uncomment and add code where needed.
 */
public class CommandLineLCR {

  public static Die testDie(){
    Die die = new Die();
    die.rollDie();
    die.toString();
    return die;
  }

  public static void main(String[] args) {
    // Use this as an test area when starting out
    // I.e. instantiate objects and test
    // Later just comment out (don't erase the test code!)
    /*Die die = new Die();
    for (int i = 0; i < 10; i++){
      die.rollDie();
    }
    die.toString();
    */
    testDie();
    Die[] die = new Die[3];
    for (int i = 0; i < 3; i++){
      die[i]= new Die();
    }
    Player Glenn = new Player("Glenn",die,5);
    String x[] = Glenn.playerRoll(Glenn.getChips());
    for (int i = 0; i < x.length; i++){
      System.out.println(x[i]);
    }






    // TODO: Uncomment this when you are done
    // runCommandLineLCR();
  }

  // TODO: For each class you implement, add a method here to test it.
  // private static void testXXX() { ... }

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

  /*  TODO
  private static LCRGame buildLCRGame() {
    ...
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
