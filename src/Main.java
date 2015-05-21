import file.circulaire.FileCirculaire;


public class Main {

	public static void main(String[] args) {
		FileCirculaire<Integer> fc = new FileCirculaire<Integer>();
		fc.addNode(4);
		fc.addNode(8);
		fc.addNode(15);
		fc.addNode(16);
		fc.addNode(23);
		fc.addNode(42);
		
		System.out.println(fc);
		System.out.println(fc.getSize());
		
		fc.popNode();
		fc.popNode();
	
		System.out.println(fc);
		System.out.println(fc.getSize());
		
		fc.popNode();
		fc.popNode();
		fc.popNode();
		fc.popNode();
		
		System.out.println(fc);
		System.out.println(fc.getSize());
		
		fc.popNode();

		System.out.println(fc);
		System.out.println(fc.getSize());
		
		IPool pool = new Pool(8);
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
		pool.addJob(new JobHelloWorld());
	}
}
