import java.util.ArrayList;

import file.circulaire.FileCirculaire;


public class Pool implements IPool{

	private FileCirculaire<Runnable> fc;
	private int workers;
	private ArrayList<Worker> workerList; 
	private Object monitor;

	
	public Pool(int nbWorkers){
		this.fc = new FileCirculaire<Runnable>();
		this.workers = nbWorkers;
		monitor = new Object();
		
		// Circulaire init
		fc = new FileCirculaire<Runnable>();
		
		// Worker init
		workerList = new ArrayList<Worker>(workers);
		for (int i=0; i<workers; i++){
			Worker w = new Worker(this);
			workerList.add(w);
			w.start();
		}
	}
	
	@Override
	public void addJob(Runnable job) {
		synchronized (monitor) {
			fc.addNode(job);
			monitor.notify();
		}		
	}

	@Override
	public Runnable nextJob() {
		synchronized (monitor) {
			try{
				if(fc.getSize() == 0){
					monitor.wait();
				}
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			return fc.popNode();
		}
	}

}
