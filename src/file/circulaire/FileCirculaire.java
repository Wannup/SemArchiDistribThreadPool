package file.circulaire;

public class FileCirculaire {

	private Node lastNode;
	private Node firstNode;
	
	public FileCirculaire(){
		
	}
	
	/*public FileCirculaire(Node lastNode, Node currentNode) {
	
		this.lastNode = lastNode;
		this.currentNode = currentNode;
		this.currentNode.setNext(lastNode);
		this.lastNode.setNext(currentNode);
	}*/
	
	public void addNode(Node node){
		if(firstNode == null && lastNode == null){
			firstNode = node;
		}
		else if(firstNode != null && lastNode == null){
			lastNode = node;
			firstNode.setNext(lastNode);
			lastNode.setNext(firstNode);
		}
		else{
			Node nodeNext = firstNode;
			firstNode = node;
		//	firstNode.setNext(next);
		}
		
		Node tempCurrent = firstNode;
		this.firstNode = node;
		this.firstNode.setNext(tempCurrent);
		tempCurrent.setNext(lastNode);
		this.lastNode.setNext(firstNode);
	}
	
	public Node getNode(){
		if(firstNode.equals(lastNode)){
			Node nodeToReturn = firstNode;
			return firstNode;
		}
		Node nodeToReturn = this.firstNode;
		this.firstNode = nodeToReturn.getNext();
		return null;
	}
	
}
