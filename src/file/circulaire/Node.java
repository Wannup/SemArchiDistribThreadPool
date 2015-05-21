package file.circulaire;

public class Node<NodeType> {

	private NodeType value;
	private Node<NodeType> next;
	
	
	public Node(NodeType value) {
		this.value = value;
		this.next = null;
	}
	
	public Node(NodeType value, Node<NodeType> next) {
		this.value = value;
		this.next = next;
	}

	public Node<NodeType> getNext() {
		return next;
	}
	public void setNext(Node<NodeType> next) {
		this.next = next;
	}

	public NodeType getValue() {
		return value;
	}

	public void setValue(NodeType value) {
		this.value = value;
	}
	
	
}
