
public class Main {

	public static void main(String[] args) {
		(new Thread(){
			public void run(){
				System.out.println("Hello");
			}
		}).start();
	}
}
