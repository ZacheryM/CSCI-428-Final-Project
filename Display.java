import java.io.*;
import java.nio.file.*;
import java.util.*;
// This class will deal with displaying game information to console.
public class Display {
    // public functions
    public static void printBoard(WordleBoard board) {
        System.out.println("Java Wordle Game");


        /* 5 row example
        1 2 3 4 5
        _ _ _ _ _
        _ _ _ _ _
        _ _ _ _ _
        _ _ _ _ _
        _ _ _ _ _

        Guess: HELLOS
        */
        // print out the board
    }

    public static void printAnswer(String arg) {
        //print the answer
        System.out.println("The answer is:\n " + arg);
    }

    public static void clear() {
        //clear the screen for new input
    }

    // Have to find way to color/highlight the text to
    // indicate if player made a match or a near match or a miss.
}
