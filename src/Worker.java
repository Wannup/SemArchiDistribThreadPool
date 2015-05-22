public class Worker extends Thread {

	private Pool myPool;
	

	public Worker(Pool pool) {
		this.myPool = pool;
	}

	public void run() {
		while (true) {
			// demande un job
			Runnable job = myPool.nextJob();
			// fait le job
			job.run();
		}
	}
}
