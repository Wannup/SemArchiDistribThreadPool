public interface IPool {
	void addJob(Runnable job);
	Runnable nextJob();
}
