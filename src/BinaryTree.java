/**
 * @author Carlos Chew
 * @author Otto Trujillo
 *
 */

public class BinaryTree<K extends Comparable<K>, V> {

	public Node<K,V> root;
	

	public BinaryTree() {
		this.root = null;
	}
	

	public V find(K key) {
		Node<K,V> data = root;

		while(data != null) {

			int comparation = data.datos.compareTo(key);
			if(comparation == 0) {
				return data.datos.getValue();
			} else if(comparation > 0) {

				data = data.left;
			} else {
				data = data.right;
			}
		}
		return null;
	}
	

	public void insert(K key, V value) {

		Node<K,V> nNode = new Node<K,V>(key, value);
		if(root == null) {
			root = nNode;
			return;
		}
		
		Node<K,V> data = root;
		Node<K,V> parent = null;

		while(true) {
			parent = data;
			int comparation = data.datos.compareTo(key);
			if(comparation > 0) {
				data = data.left;
				if(data == null) {
					parent.left = nNode;
					return;
				}
			} else {
				data = data.right;
				if(data == null) {
					parent.right = nNode;
					return;
				}
			}
		}
	}
	

	public void display(Node<K,V> root) {
		if(root != null) {
			display(root.left);
			System.out.print(root.datos.toString());
			display(root.right);
		}
	}

class Node<K extends Comparable<K>,V>{
	Association<K,V> datos;
	Node<K,V> left;
	Node<K,V> right;

	public Node(K key, V value) {
		datos = new Association<K,V>(key, value);
		left = null;
		right = null;
	}
}
}