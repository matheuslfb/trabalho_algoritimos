
import java.util.Scanner;
import java.io.*;

public class LTest {

    public static void main( String[] args ) throws FileNotFoundException {
        List L = new List();
        System.out.println("Lista criada.");
        Scanner input = new Scanner( new FileReader("casos/x1")).useDelimiter("\n");
        
        while ( input.hasNext() ) {
            String temp = input.next();
            if ( temp.matches( "[0-9]+" ) ) L.insert( Integer.parseInt( temp ) );
            
           /*
            *  if(temp.equals("quit")) System.exit(0);
            
            if ( temp.equals( "cont" ) )  System.out.println("Contador = " + L.contador());
            if ( temp.equals( "existe" ) ) { 
                int aux = input.nextInt();
                if ( L.existe( aux ) ) System.out.println("existe o numero");
                else System.out.println("NAO existe o numero");
            }
            if ( temp.equals( "primeiro" ) ) {
                System.out.println ("o primeiro da lista era " + L.getFirst());

            }
            if(temp.equals("troca")) L.swap();
            if ( temp.equals( "append" ) ) { 
                int aux = input.nextInt();
                L.append(aux);
            }
            if ( temp.equals( "insere" ) )
                L.insert(input.nextInt(), input.nextInt());
                
                
                L.print();
            */
            
            System.out.println(temp);
            if ( temp.equals( "cont" ) )  System.out.println("Contador = " + L.contador());
           
            
        }
        
    }
}
