
public class ForOrLoopsNorShor {
	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		//for5();
		//for6();
		for7();
	}

	static void for1() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
	}

	static void for2() {
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
	}

	static void for3() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	static void for4() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	static void for5() {
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			}
			if (i % 2 != 0) {
				System.out.println(i + " odd");
			}
		}
	}

	static void for6() {
		for (int i = 1; i <= 777; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

	static void for7() {
		for (int i = 2004; i <= 2015; i++) {
			if (i % 7 == 0) {
				int q = i - 2004;
				System.out.println("In " + i + ", I was " + q + " years old!");
			}
		}
	}
}
