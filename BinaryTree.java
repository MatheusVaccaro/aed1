package exsJB;
// BinaryTree.java
public class BinaryTree {

  // Referência para a raiz da árvore. É null para o caso de uma
  // árvore vazia.

  private Node root;

  private static class Node {
    Node left;
    Node right;
    int data;

    Node( int newData ) {
      left = right = null;
      data = newData;
    }
  }

  /* Cria uma árvore vazia, ou seja, uma referência nula. */
  public BinaryTree() {
    root = null;
  }

  public void insert( int data ) {
    root = insert( root, data );
  }

  private Node insert( Node root, int data ) {
	  if(root == null)return new Node(data);
	  if(data > root.data)root.right = insert(root.right, data);
	  else root.left = insert(root.left, data);
	  return root;
  }

  public void print( ) {
    print( root, "" );
  }

  private void print( Node n , String offset) {
	  if(n == null) return;
	  print(n.right, offset + "\t");
	  System.out.println(offset + n.data);
	  print(n.left, offset + "\t");
  }

  public void destroy( ) {
    root = destroy( root );
  }

  private Node destroy( Node n ) {
	  if(n == null) return n;
	  n.left = destroy(n.left);
	  n.right = destroy(n.right);
	  return null;
  }
  
  public boolean exist(int val){
	  return exist(root, val);
  }
  
  private boolean exist(Node n, int val){
	  if(n == null) return false;
	  if(n.data == val) return true;
	  boolean aux = exist(n.left, val);
	  if(aux == false) aux = exist(n.right, val);
	  return aux;
  }
  
  public int altura(){
	  return altura(root);
  }
  
  private int altura(Node n){
	  if(n == null) return 0;
	  int altEsq = altura(n.left);
	  int altDir = altura(n.right);
	  if(altEsq >= altDir) return altEsq + 1;
	  else return altDir + 1;
  }
  
  public int numnodos(){
	  return numnodos(root);
  }
  
  private int numnodos(Node n){
	  if(n == null) return 0;
	  return numnodos(n.left) + numnodos(n.right) + 1;
  }
  
  public int numfolhas(){
	  return numfolhas(root);
  }
  
  private int numfolhas(Node n){
	  if(n == null) return 0;
	  if(n.left == null && n.right == null) return 1;
	  return numfolhas(n.left) + numfolhas(n.right);
  }
  
  public int soma(){
	  return soma(root);
  }
  
  private int soma(Node n){
	  if(n == null) return 0;
	  return soma(n.left) + soma(n.right) + n.data; 
  }
  
  public int conta(int val){
	  return conta(root, val);
  }
  
  private int conta(Node n, int val){
	  if(n == null) return 0;
	  int aux = 0;
	  if(n.data == val) aux = aux +1;
	  return conta(n.left, val) + conta(n.right, val) + aux;
  }

}