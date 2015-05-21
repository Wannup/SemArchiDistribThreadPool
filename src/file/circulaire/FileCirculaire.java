package file.circulaire;

public class FileCirculaire {

	private Node lastNode;
	private Node currentNode;
	
	public FileCirculaire(){
		
	}
	
	/*public FileCirculaire(Node lastNode, Node currentNode) {
	
		this.lastNode = lastNode;
		this.currentNode = currentNode;
		this.currentNode.setNext(lastNode);
		this.lastNode.setNext(currentNode);
	}*/
	
	public void addNode(Node node){
		if(currentNode != null){
			
		}
		
		Node tempCurrent = currentNode;
		this.currentNode = node;
		this.currentNode.setNext(tempCurrent);
		tempCurrent.setNext(lastNode);
		this.lastNode.setNext(currentNode);
	}
	
	public Node getNode(){
		if(currentNode.equals(lastNode)){
			Node nodeToReturn = currentNode;
			return currentNode;
		}
		Node nodeToReturn = this.currentNode;
		this.currentNode = nodeToReturn.getNext();
		return null;
	}
	
}
