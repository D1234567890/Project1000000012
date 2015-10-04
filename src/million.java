import java.util.Random;

public class million {
	public static void main(String[] args) {
		int io = 0;
		for (int i = 0; i < 10000000; i++) {
			int a = new Random().nextInt(10);
			int b = new Random().nextInt(10);
			int c = new Random().nextInt(10);
			if (a == b && b == c) {
				io++;
			}
		}
		System.out.println(io);
	}
}
