package exsJB;

import java.util.Scanner;

public class BTest {

  public static void main( String[] args ) {
    BinaryTree T = new BinaryTree();

    Scanner input = new Scanner( System.in );

    while ( input.hasNext() ) {
      String temp = input.next();

      if ( temp.equals( "quit" ) ) System.exit( 0 );
      if ( temp.matches( "[0-9]+" ) ) T.insert( Integer.parseInt( temp ) );
      if(temp.equals("destroy"))T.destroy();
      if(temp.equals("exist")){
    	  int val = input.nextInt();
    	  System.out.println(T.exist(val));
      }
      if(temp.equals("altura"))System.out.println(T.altura());
      if(temp.equals("numnodos"))System.out.println(T.numnodos());
      if(temp.equals("numfolhas"))System.out.println(T.numfolhas());
      if(temp.equals("conta")){
    	  int val = input.nextInt();
    	  System.out.println(T.conta(val));
      }
      if(temp.equals("soma"))System.out.println(T.soma());
      System.out.println("-----TREE-----");
      T.print();
      System.out.println("--------------");
    }
    T.destroy( );
  }
}