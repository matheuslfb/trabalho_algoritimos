import java.util.Scanner;
import java.io.*;

public class LTest {

    public static void main( String[] args ) throws FileNotFoundException {
        List L = new List();
        System.out.println("Lista criada.");
        Scanner input = new Scanner( new FileReader("casos/x1.txt")).useDelimiter("\n");
        
        while ( input.hasNext() ) {
            String temp = input.next();

           System.out.println(temp);
        }
    }
}