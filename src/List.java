
// List.java
public class List {

    // Referência para  o primeiro elemento
    private Node first;

    /*
    Node
    A lista usa esta classe interna. Cada nodo contÃ©m
    uma informação e referência para o próximo nodo.
     */
    private static class Node {
        Node next;
        int data;

        Node( int newData ) {
            data = newData;
            next = null;
        }
    }

    public List() {
        first = null;
    }

    public void insert( int data ) {
        Node p = new Node( data );
        p.next = first;
        first = p;
    }
    
    public int contador(){
        return contador(first);
    }
    
    private int contador(Node p){
        if(p == null) return 0;              
        return 1 + contador(p.next);
    }

    public boolean existe(int x){
        Node p = first;
        while(p != null){
            if(p.data == x) return true;
            p = p.next;
        }
        return false;
    }

    public int getFirst () {
        int c = first.data;
        first = first.next;
        return c; 
    }

    public void swap(){
        Node ref1 = first;
        first = first.next;
        ref1.next = first.next;
        first.next = ref1;
    }

    public void print()  {
        System.out.print( "[ " );
        print(first);
        System.out.println( "]" );
    }

    private void print(Node p){
        if(p == null) return;
        System.out.print( p.data + " ");
        print(p.next);
    }
    
    public void append(int n){
        first = append(first, n);
    }

    private Node append(Node f, int n){
        if ( f == null ) return new Node( n );
        f.next = append( f.next, n );
        return f;
    }
    
    public void insert(int n, int p){
        first = insert(first, n, p);
    }

    private Node insert(Node f, int n, int p){
        if ( p == 0 || f == null ) {
            Node aux = new Node( n );
            aux.next = f;
            return aux;
        }
        f.next = insert( f.next, n, p-1 );
        return f;
    }
}