package chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException, IOException { // must be checked wherever it may appear
        bMethod();
        cMethod();
    }

    public static void bMethod() throws FileNotFoundException{
        aMethod();
    }
    public static void cMethod() { //handled not specified
        try {
            throw new IOException();
        } catch (IOException ioe){
            System.out.println("This is an IOException");
        }
    }
    public static void aMethod() throws FileNotFoundException { //must be checked!
        try {
            File file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found.");
        }
    }
}
