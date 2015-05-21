package file.circulaire;

public class FileCirculaire<E> {

	private int size;
	private Node<E> lastNode;
	
	public FileCirculaire(){
		this.size = 0;
		this.lastNode = null;
	}
	
	public void addNode(E value){
		Node<E> newNode = new Node<E>(value);
		
		if(size == 0){
			//if empty
			newNode.setNext(newNode);
		}else{
			newNode.setNext(lastNode.getNext());
			lastNode.setNext(newNode);
		}
		
		lastNode = newNode;
		size++;
	}
	
	public E popNode(){

		if(size == 0){
			return null;
		}
		Node<E> ln = lastNode.getNext();
		if(1 == size){
			lastNode = null;
		}else{
			lastNode.setNext(lastNode.getNext().getNext());
		}

		size--;
		return ln.getValue();
	}

	public int getSize() {
		return size;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("Ring: ");
		if(lastNode != null){
			Node<E> n = lastNode.getNext();
			for(int i=0; i<size; i++){
				sb.append(" " + n.getValue());
				n = n.getNext();
			}
		}
		return sb.toString();
	}
	
}
