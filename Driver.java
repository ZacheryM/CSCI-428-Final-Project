import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Driver {
    private final static boolean debug = true;
    private final static String data = "data.txt";
    private static int wordleLength = 5;
    public static void main(String[] args) {
        
        // create class obj to hold the wordle
        Scanner input = new Scanner(System.in);
        System.out.printf("Select Length of Wordle: \n");
        // get scanner input
        // hardcoded for now
        wordleLength = 5;
        System.out.printf("Length of Wordle: %s\n", wordleLength);
        WordleBoard board = new WordleBoard("data.txt", wordleLength, wordleLength);

        // maybe use a switch case for user options and difficulty settings?
        // keep it simple for now
        do {
            //print the board

            if (debug) {
                System.out.printf("Debug Mode is %s\n", debug);
                // print the correct answer
            }
            // ask for input
            // get input
            // check word
            // print the board w/ new guess
            System.out.printf("Game loop\n");
        } while (board.didWin() == false);
        // clear and print the board here
        // give user the correct answer
        // record game stats?
        input.close();
        System.out.printf("Game closing...\n");
    }

    // might take the board as an arg or function runs in game loop?
    public static void recordGame() {
        // must contain GamesPlayed, GamesWon, maybe previous words?
        System.out.printf("Games Played: \n");
        System.out.printf("Games Won: \n");
        System.out.printf("Previous Words: \n");
    }
}