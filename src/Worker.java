public class Worker extends Thread {

	private Pool myPool;

	public Worker(Pool pool) {
		this.myPool = pool;
	}

	public void run() {
		while (true) {
			// Demande un job
			Runnable job = myPool.nextJob();
			// Fait le job
			job.run();
		}
	}
}
