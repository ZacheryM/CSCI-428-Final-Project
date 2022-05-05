import java.io.*;
import java.nio.file.*;
import java.util.*;

public class WordleBoard {
    private int rows; // left to right
    private int columns; // top to bottom
    private String answer;
    private ArrayList<String> guesses = new ArrayList<String>();

    public WordleBoard(String filePath, int size, int wordLength) {
        this.rows = size;
        this.columns = wordLength;
        // still need to figure out how to parse data.txt
        // https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
    }

    // GETTERS
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public final String getGuess(int index) {
        return guesses.get(index);
    }

    public final String getAnswer() {
        return answer;
    }

    public int countGuesses() {
        return guesses.size();
    }

    public boolean GameOver() {
        if (countGuesses() == getColumns())
            return true;
        else 
            return false;

    }

    public boolean didWin() {
        if (guesses.contains(getAnswer()))
            return true;
        else
            //return false;
            return true; // debug code
        }

    // MUTATOR
    // this doesn't check to see if words are valid maybe for future release?
    public void mutateGuess(String str) {
        //if (str.length() == getColumns())
        //    guesses.add(str);
    }
}
